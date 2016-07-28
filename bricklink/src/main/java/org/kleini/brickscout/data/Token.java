/*
 * GPL v3
 */

package org.kleini.brickscout.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"refresh_token","expires_in","scope"})
public final class Token {

    private String accessToken;

    private String type;

    public Token() {
        super();
    }

    @JsonProperty("access_token")
    String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("token_type")
    String getType() {
        return type;
    }

    @JsonProperty("token_type")
    void setType(String type) {
        this.type = type;
    }
}
