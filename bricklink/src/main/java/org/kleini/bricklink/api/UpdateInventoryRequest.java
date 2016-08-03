/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.HashSet;
import java.util.Set;
import org.kleini.api.AbstractPutRequest;
import org.kleini.api.Parameter;
import org.kleini.bricklink.data.Inventory;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * Request to update an inventory item.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class UpdateInventoryRequest extends AbstractPutRequest<UpdateInventoryResponse> {

    private final Inventory inventory;
    private String[] fields;

    public UpdateInventoryRequest(Inventory inventory, String... fields) {
        super();
        this.inventory = inventory;
        this.fields = fields;
    }

    @Override
    public String getPath() {
        return "inventories/" + inventory.getIdentifier();
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public String getBody() throws Exception {
        Set<String> properties = new HashSet<String>();
        for (String field : fields) {
            properties.add(field);
        }
        SimpleBeanPropertyFilter filter = new SimpleBeanPropertyFilter.FilterExceptFilter(properties);
        SimpleFilterProvider provider = new SimpleFilterProvider();
        provider.addFilter("update inventory request filter", filter);
        return mapper.writer(provider).writeValueAsString(inventory);
    }

    @Override
    public UpdateInventoryParser getParser() {
        return new UpdateInventoryParser();
    }
}
