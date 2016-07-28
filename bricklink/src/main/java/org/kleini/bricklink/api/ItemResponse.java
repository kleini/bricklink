/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Response;
import org.kleini.bricklink.data.Item;

/**
 * {@link ItemResponse}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class ItemResponse extends Response<org.kleini.bricklink.data.Response<Item>> {

    protected ItemResponse(org.kleini.bricklink.data.Response<Item> response) {
        super(response);
    }

    public Item getItem() {
        return getResponse().getData();
    }
}
