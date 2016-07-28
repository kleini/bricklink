/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.HashSet;
import java.util.Set;

import org.kleini.api.Parameter;
import org.kleini.bricklink.data.Inventory;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
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
        SimpleFilterProvider fProvider = new SimpleFilterProvider();
        fProvider.addFilter("fieldFilter", filter);
        mapper.setAnnotationIntrospector(
            new JacksonAnnotationIntrospector() {
                private static final long serialVersionUID = -1209134534857706066L;
                @Override
                public Object findFilterId(AnnotatedClass ac) {
                    return "fieldFilter";
                }
            }
        );
        return mapper.writer(fProvider).writeValueAsString(inventory);
    }

    @Override
    public UpdateInventoryParser getParser() {
        return new UpdateInventoryParser();
    }
}
