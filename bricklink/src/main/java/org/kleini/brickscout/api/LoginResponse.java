/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.api.Response;
import org.kleini.brickscout.data.Token;

/**
 *
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LoginResponse extends Response<Token> {

    public LoginResponse(Token response) {
        super(response);
    }

    public Token getToken() {
        return getResponse();
    }
}
