/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.api.Response;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LoginResponse extends Response<String> {

    public LoginResponse(org.kleini.bricklink.data.Response<String> response) {
        super(response);
    }

    public String getToken() {
        return getResponse().getData();
    }
}
