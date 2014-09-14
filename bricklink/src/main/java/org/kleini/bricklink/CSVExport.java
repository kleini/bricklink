/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.ConfigurationProperty;
import org.kleini.bricklink.api.OrderRequest;
import org.kleini.bricklink.api.OrdersRequest;
import org.kleini.bricklink.api.OrdersResponse;
import org.kleini.bricklink.data.Address;
import org.kleini.bricklink.data.Name;
import org.kleini.bricklink.data.Order;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * This class is a starter and should read the customer address information for not yet booked orders.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CSVExport {

    public CSVExport() {
        super();
    }

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        OrderHelper helper = new OrderHelper(configuration.getProperty(ConfigurationProperty.COMMENT_REGEX));
        BrickLinkClient client = new BrickLinkClient(configuration);
        List<String[]> output = new ArrayList<String[]>();
        try {
            OrdersRequest request = new OrdersRequest();
            OrdersResponse response = client.execute(request);
            List<Order> orders = OrderHelper.sortByOrderId(response.getOrders());
            for (Order tmp : orders) {
                Order order = client.execute(new OrderRequest(tmp.getId())).getOrder();
                if (helper.isNotBilled(order)) {
                    Address address = order.getShipping().getAddress();
                    Name name = address.getName();
                    String email = order.getEmail();
                    List<String> parts = new ArrayList<String>();
                    parts.add("http://www.bricklink.com/memberInfo.asp?u=" + order.getBuyer());
                    String fullName = name.getFull();
                    int lastNamePos = fullName.lastIndexOf(' ');
                    parts.add(fullName.substring(0, lastNamePos));
                    parts.add(fullName.substring(lastNamePos + 1));
                    parts.add(email);
                    String[] fullAddress = address.getFull().split("\r\n");
                    for (String addressPart : fullAddress) {
                        parts.add(addressPart);
                    }
                    if (null == address.getCountry()) {
                        parts.add("Unknown country");
                    } else {
                        parts.add(address.getCountry().name());
                    }
                    parts.add("Herr");
                    parts.add("Sehr geehrter Herr");
                    output.add(parts.toArray(new String[parts.size()]));
                } else {
                    break;
                }
            }
        } finally {
            client.close();
        }
        Collections.reverse(output);
        FileOutputStream fis = null;
        OutputStreamWriter osw = null;
        CSVWriter csvw = null;
        try {
            fis = new FileOutputStream(new File("kunden.csv"));
            osw = new OutputStreamWriter(fis, "Windows-1252");
            csvw = new CSVWriter(osw, ';', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, "\r\n");
            csvw.writeAll(output);
        } finally {
            IOUtils.closeQuietly(osw);
            IOUtils.closeQuietly(fis);
            if (null != csvw) {
                csvw.close();
            }
        }
    }
}
