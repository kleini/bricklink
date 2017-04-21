/*
 * GPL v3
 */

package de.dpag.oneclickforapp.webservice;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * {@link Header}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Header {

    private final String partnerId;
    private final int keyPhase;
    private final String key;

    public Header(String partnerId, int keyPhase, String key) {
        super();
        this.partnerId = partnerId;
        this.keyPhase = keyPhase;
        this.key = key;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public String getTimestamp() {
        SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy-HHmmss", Locale.GERMANY);
        df.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
        return df.format(new Date());
    }

    public int getKeyPhase() {
        return keyPhase;
    }

    public String getSignature() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String complete = partnerId + "::" + getTimestamp() + "::" + keyPhase + "::" + key;
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] bytes = complete.getBytes("UTF-8");
        return new BigInteger(1, digest.digest(bytes)).toString(16).substring(0, 8);
    }
}
