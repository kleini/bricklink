/*
 * GPL v3
 */

package org.kleini.address;

import org.kleini.bricklink.data.Order;

/**
 * Interface for loose coupling of address loading
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public interface AddressLoader {

    Address findAddress(Order order) throws Exception;

}
