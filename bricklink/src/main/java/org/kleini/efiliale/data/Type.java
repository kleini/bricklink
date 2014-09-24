/*
 * GPL v3
 */

package org.kleini.efiliale.data;

/**
 * Stamping for letters and parcels is different. Letters are shipped by Deutsche Post and parcels are shipped by Deutsche Post DHL. When
 * creating the stamps this needs to be done on different pages.
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Type {

    LETTER,
    PARCEL;

}
