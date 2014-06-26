/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Cost} represents the cost information of an order.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Cost {

    /**
     * The currency code of the transaction
     */
    private Currency currency;

    /**
     * The display currency code of the user
     */
    private Currency displayCurrency;

    /**
     * The total price for the order exclusive of shipping and other costs (This must equal the sum of all the items)
     */
    private BigDecimal subtotal;

    /**
     * The total price for the order inclusive of tax, shipping and other costs
     */
    private BigDecimal grandTotal;

    /**
     * The subtotal price in display currency of the user
     */
    private BigDecimal displaySubtotal;

    /**
     * The grand total price in display currency of the user
     */
    private BigDecimal displayGrandTotal;

    /**
     * Extra charge for this order (tax, packing, etc.)
     */
    private BigDecimal extraCharge1;

    /**
     * Extra charge for this order (tax, packing, etc.)
     */
    private BigDecimal extraCharge2;

    /**
     * Insurance cost
     */
    private BigDecimal insurance;

    /**
     * Shipping cost
     */
    private BigDecimal shipping;

    /**
     * Credit applied to this order
     */
    private BigDecimal credit;

    /**
     * Amount of coupon discount
     */
    private BigDecimal coupon;

    /**
     * VAT percentage applied to this order
     */
    private BigDecimal vatRate;

    /**
     * Total amount of VAT included in the grand_total price
     */
    private BigDecimal vatAmount;

    public Cost() {
        super();
    }

    @JsonProperty("currency_code")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency_code")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("disp_currency_code")
    public Currency getDisplayCurrency() {
        return displayCurrency;
    }

    @JsonProperty("disp_currency_code")
    public void setDisplayCurrency(Currency displayCurrency) {
        this.displayCurrency = displayCurrency;
    }

    @JsonProperty("subtotal")
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("grand_total")
    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    @JsonProperty("grand_total")
    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    @JsonProperty("disp_subtotal")
    public BigDecimal getDisplaySubtotal() {
        return displaySubtotal;
    }

    @JsonProperty("disp_subtotal")
    public void setDisplaySubtotal(BigDecimal displaySubtotal) {
        this.displaySubtotal = displaySubtotal;
    }

    @JsonProperty("disp_grand_total")
    public BigDecimal getDisplayGrandTotal() {
        return displayGrandTotal;
    }

    @JsonProperty("disp_grand_total")
    public void setDisplayGrandTotal(BigDecimal displayGrandTotal) {
        this.displayGrandTotal = displayGrandTotal;
    }

    @JsonProperty("etc1")
    public BigDecimal getExtraCharge1() {
        return extraCharge1;
    }

    @JsonProperty("etc1")
    public void setExtraCharge1(BigDecimal extraCharge1) {
        this.extraCharge1 = extraCharge1;
    }

    @JsonProperty("etc2")
    public BigDecimal getExtraCharge2() {
        return extraCharge2;
    }

    @JsonProperty("etc2")
    public void setExtraCharge2(BigDecimal extraCharge2) {
        this.extraCharge2 = extraCharge2;
    }

    @JsonProperty("insurance")
    public BigDecimal getInsurance() {
        return insurance;
    }

    @JsonProperty("insurance")
    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    @JsonProperty("shipping")
    public BigDecimal getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("credit")
    public BigDecimal getCredit() {
        return credit;
    }

    @JsonProperty("credit")
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    @JsonProperty("coupon")
    public BigDecimal getCoupon() {
        return coupon;
    }

    @JsonProperty("coupon")
    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    @JsonProperty("vat_rate")
    public BigDecimal getVatRate() {
        return vatRate;
    }

    @JsonProperty("vat_rate")
    public void setVatRate(BigDecimal vatRate) {
        this.vatRate = vatRate;
    }

    @JsonProperty("vat_amount")
    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    @JsonProperty("vat_amount")
    public void setVatAmount(BigDecimal vatAmount) {
        this.vatAmount = vatAmount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((coupon == null) ? 0 : coupon.hashCode());
        result = prime * result + ((credit == null) ? 0 : credit.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((displayCurrency == null) ? 0 : displayCurrency.hashCode());
        result = prime * result + ((displayGrandTotal == null) ? 0 : displayGrandTotal.hashCode());
        result = prime * result + ((displaySubtotal == null) ? 0 : displaySubtotal.hashCode());
        result = prime * result + ((extraCharge1 == null) ? 0 : extraCharge1.hashCode());
        result = prime * result + ((extraCharge2 == null) ? 0 : extraCharge2.hashCode());
        result = prime * result + ((grandTotal == null) ? 0 : grandTotal.hashCode());
        result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
        result = prime * result + ((shipping == null) ? 0 : shipping.hashCode());
        result = prime * result + ((subtotal == null) ? 0 : subtotal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cost)) {
            return false;
        }
        Cost other = (Cost) obj;
        if (coupon == null) {
            if (other.coupon != null) {
                return false;
            }
        } else if (!coupon.equals(other.coupon)) {
            return false;
        }
        if (credit == null) {
            if (other.credit != null) {
                return false;
            }
        } else if (!credit.equals(other.credit)) {
            return false;
        }
        if (currency != other.currency) {
            return false;
        }
        if (displayCurrency != other.displayCurrency) {
            return false;
        }
        if (displayGrandTotal == null) {
            if (other.displayGrandTotal != null) {
                return false;
            }
        } else if (!displayGrandTotal.equals(other.displayGrandTotal)) {
            return false;
        }
        if (displaySubtotal == null) {
            if (other.displaySubtotal != null) {
                return false;
            }
        } else if (!displaySubtotal.equals(other.displaySubtotal)) {
            return false;
        }
        if (extraCharge1 == null) {
            if (other.extraCharge1 != null) {
                return false;
            }
        } else if (!extraCharge1.equals(other.extraCharge1)) {
            return false;
        }
        if (extraCharge2 == null) {
            if (other.extraCharge2 != null) {
                return false;
            }
        } else if (!extraCharge2.equals(other.extraCharge2)) {
            return false;
        }
        if (grandTotal == null) {
            if (other.grandTotal != null) {
                return false;
            }
        } else if (!grandTotal.equals(other.grandTotal)) {
            return false;
        }
        if (insurance == null) {
            if (other.insurance != null) {
                return false;
            }
        } else if (!insurance.equals(other.insurance)) {
            return false;
        }
        if (shipping == null) {
            if (other.shipping != null) {
                return false;
            }
        } else if (!shipping.equals(other.shipping)) {
            return false;
        }
        if (subtotal == null) {
            if (other.subtotal != null) {
                return false;
            }
        } else if (!subtotal.equals(other.subtotal)) {
            return false;
        }
        return true;
    }
}
