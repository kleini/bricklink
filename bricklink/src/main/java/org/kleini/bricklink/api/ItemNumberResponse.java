/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.List;

import org.kleini.api.Response;
import org.kleini.bricklink.data.ItemMapping;

/**
 * {@link ItemNumberResponse} stores the response of an {@link ItemNumberRequest} which is the BrickLink item, type and color of the
 * according LEGO article number.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ItemNumberResponse extends Response<org.kleini.bricklink.data.Response<List<ItemMapping>>> {

    public ItemNumberResponse(org.kleini.bricklink.data.Response<List<ItemMapping>> response) {
        super(response);
    }

    public List<ItemMapping> getItemMapping() {
        return getResponse().getData();
    }
}
