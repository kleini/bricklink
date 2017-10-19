/*
 * GPL v3
 */

package org.kleini.portokasse;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import de.dpag.oneclickforapp.webservice.PartnerSignature;

/**
 * {@link TopUpPostageClient}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class TopUpPostageClient {

    private final CloseableHttpClient client;

    public TopUpPostageClient() {
        super();
        client = HttpClients.createDefault();
    }

    public void execute(PartnerSignature partner, String userToken, BigDecimal amount) throws IOException, NoSuchAlgorithmException {
        List<NameValuePair> form = new ArrayList<NameValuePair>();
        form.add(new BasicNameValuePair("PARTNER_ID", partner.getPartnerId()));
        form.add(new BasicNameValuePair("PARTNER_SIGNATURE", partner.getSignature()));
        form.add(new BasicNameValuePair("REQUEST_TIMESTAMP", partner.getTimestamp()));
        form.add(new BasicNameValuePair("CHARACTER_ENCODING", Consts.UTF_8.displayName()));
        form.add(new BasicNameValuePair("KEY_PHASE", Integer.toString(partner.getKeyPhase())));
        form.add(new BasicNameValuePair("SUCCESS_URL", ""));
        form.add(new BasicNameValuePair("CANCEL_URL", ""));
        form.add(new BasicNameValuePair("USER_TOKEN", userToken));
        form.add(new BasicNameValuePair("BALANCE", amount.multiply(new BigDecimal(100)).setScale(0).toString()));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(form, Consts.UTF_8);

        HttpPost post = new HttpPost("https://portokasse.deutschepost.de/portokasse/marketplace/enter-app-payment");
        post.setEntity(entity);
        System.out.println("Executing request " + post.getRequestLine());

        // Create a custom response handler
        ResponseHandler<String> responseHandler = response -> {
            int status = response.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300) {
                HttpEntity responseEntity = response.getEntity();
                return responseEntity != null ? EntityUtils.toString(responseEntity) : null;
            } else {
                throw new ClientProtocolException("Unexpected response status: " + status);
            }
        };
        String responseBody = client.execute(post, responseHandler);
        System.out.println("----------------------------------------");
        System.out.println(responseBody);
    }
}
