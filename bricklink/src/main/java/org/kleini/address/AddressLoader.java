/*
 * GPL v3
 */

package org.kleini.address;

import java.math.BigDecimal;

/**
 * Interface for loose coupling of address loading
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public interface AddressLoader {

    Address findAddress(int orderId, BigDecimal amount) throws Exception;

}
