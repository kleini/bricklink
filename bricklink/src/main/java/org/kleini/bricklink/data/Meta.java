/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Meta} Extra information about the response
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Meta {

    /**
     * API result code. (2xx if successful, any other number otherwise)
     */
    private int code;

    /**
     * More granular information about the result
     */
    private String message;

    /**
     * Detailed description of the result
     */
    private String description;

    public Meta() {
        super();
    }

    @JsonProperty("code")
    public int getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(int code) {
        this.code = code;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }
}
