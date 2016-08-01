/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.api.Parser;
import org.kleini.brickscout.data.Token;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
class LoginParser extends Parser<LoginResponse, Token> {

    LoginParser() {
        super();
    }

    @Override
    protected TypeReference<Token> getResponseType() {
        return new TypeReference<Token>() {
            // Nothing to do.
        };
    }

    @Override
    protected LoginResponse createResponse(Token response) {
        return new LoginResponse(response);
    }
}
