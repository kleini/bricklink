/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.security.cert.X509Certificate;
import org.apache.http.conn.ssl.TrustStrategy;

/**
 * {@link TrustAllStrategy} trusts all SSL certificates.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
final class TrustAllStrategy implements TrustStrategy {

    @Override
    public boolean isTrusted(X509Certificate[] chain, String authType) {
        return true;
    }
}
