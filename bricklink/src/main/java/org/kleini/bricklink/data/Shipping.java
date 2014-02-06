/*
 *
 *    OPEN-XCHANGE legal information
 *
 *    All intellectual property rights in the Software are protected by
 *    international copyright laws.
 *
 *
 *    In some countries OX, OX Open-Xchange, open xchange and OXtender
 *    as well as the corresponding Logos OX Open-Xchange and OX are registered
 *    trademarks of the Open-Xchange, Inc. group of companies.
 *    The use of the Logos is not covered by the GNU General Public License.
 *    Instead, you are allowed to use these Logos according to the terms and
 *    conditions of the Creative Commons License, Version 2.5, Attribution,
 *    Non-commercial, ShareAlike, and the interpretation of the term
 *    Non-commercial applicable to the aforementioned license is published
 *    on the web site http://www.open-xchange.com/EN/legal/index.html.
 *
 *    Please make sure that third-party modules and libraries are used
 *    according to their respective licenses.
 *
 *    Any modifications to this package must retain all copyright notices
 *    of the original copyright holder(s) for the original code used.
 *
 *    After any such modifications, the original and derivative code shall remain
 *    under the copyright of the copyright holder(s) and/or original author(s)per
 *    the Attribution and Assignment Agreement that can be located at
 *    http://www.open-xchange.com/EN/developer/. The contributing author shall be
 *    given Attribution for the derivative code and a license granting use.
 *
 *     Copyright (C) 2004-2014 Open-Xchange, Inc.
 *     Mail: info@open-xchange.com
 *
 *
 *     This program is free software; you can redistribute it and/or modify it
 *     under the terms of the GNU General Public License, Version 2 as published
 *     by the Free Software Foundation.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *     or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *     for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc., 59
 *     Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package org.kleini.bricklink.data;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Shipping}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Shipping {

    /**
     * Shipping method the buyer selected
     */
    private String method;

    /**
     * Tracking numbers for the shipping
     */
    private String trackingNumber;

    /**
     * URL for tracking the shipping
     * API-only field. It is not shown on the BrickLink pages.
     */
    private String trackingLink;

    /**
     * Shipping date
     * API-only field. It is not shown on the BrickLink pages.
     */
    private Date shipped;

    /**
     * The object representation of the shipping address
     */
    private Address address;

    public Shipping() {
        super();
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("tracking_no")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    @JsonProperty("tracking_no")
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @JsonProperty("tracking_link")
    public String getTrackingLink() {
        return trackingLink;
    }

    @JsonProperty("tracking_link")
    public void setTrackingLink(String trackingLink) {
        this.trackingLink = trackingLink;
    }

    @JsonProperty("date_shipped")
    public Date getShipped() {
        return shipped;
    }

    @JsonProperty("date_shipped")
    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }
}
