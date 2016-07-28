/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import org.kleini.api.Parser;
import org.kleini.bricklink.data.Response;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
class LoginParser extends Parser<LoginResponse, String> {

    LoginParser() {
        super();
    }

    @Override
    protected TypeReference<Response<String>> getResponseType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected LoginResponse createResponse(Response<String> response) {
        // TODO Auto-generated method stub
        return null;
    }
}
