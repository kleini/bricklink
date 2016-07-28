/*
 * GPL v3
 */

package org.kleini.brickscout.api;

import java.util.ArrayList;
import java.util.List;

import org.kleini.api.Parameter;
import org.kleini.api.Request;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LoginRequest implements Request<LoginResponse> {

    private String username;
    private String password;

    public LoginRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    @Override
    public org.kleini.api.Request.Method getMethod() {
        return Method.POST;
    }

    @Override
    public String getPath() {
        return "api/oauth/token";
    }

    @Override
    public Parameter[] getParameters() {
        List<Parameter> params = new ArrayList<Parameter>();
        params.add(new Parameter("client_id", "brickscout"));
        params.add(new Parameter("grant_type", "password"));
        params.add(new Parameter("username", username));
        params.add(new Parameter("password", password));
        return params.toArray(new Parameter[params.size()]);
    }

    @Override
    public LoginParser getParser() {
        return new LoginParser();
    }

    @Override
    public String getBody() throws Exception {
        return null;
    }
}
