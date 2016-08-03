/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.math.BigDecimal;
import org.springframework.hateoas.Resources;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link CatalogItem}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"averageNetPriceAmount","description","ean","inventoryCount","maxPrice","minPrice","sixMonthAverageNetPriceAmount"})
public class CatalogItem extends Resources<Image> {

    private String code;
    private String name;
    private BigDecimal weight;

    public CatalogItem() {
        super();
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("weightInGram")
    public BigDecimal getWeight() {
        return weight;
    }

    @JsonProperty("weightInGram")
    public void setWeight(BigDecimal weightInGram) {
        this.weight = weightInGram;
    }
}
