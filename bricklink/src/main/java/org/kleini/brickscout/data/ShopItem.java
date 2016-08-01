/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * {@link ShopItem}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"shopItemUUID","createdDate","shopStock","name","description","condition","unitGrossPrice","unitNetPrice","bulkQuantity","discount","draft","shopProduct","tieredGrossPriceEntries","deleted","isActive","remarks","selectedForBulkUpdate","_embedded","_links"})
public class ShopItem {

    public ShopItem() {
        super();
    }
}
