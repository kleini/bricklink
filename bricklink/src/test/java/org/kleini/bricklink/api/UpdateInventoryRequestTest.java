/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
import org.kleini.bricklink.data.Inventory;

/**
 * {@link UpdateInventoryRequestTest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class UpdateInventoryRequestTest {

    public UpdateInventoryRequestTest() {
        super();
    }

    @Test
    public void testGetBody() throws Exception {
        Inventory update = new Inventory();
        update.setIdentifier(123);
        update.setPrice(new BigDecimal("1.00"));
        String body = new UpdateInventoryRequest(update, "inventory_id", "unit_price").getBody();
        assertEquals("{\"inventory_id\":123,\"unit_price\":1.00}", body);
    }
}
