/*
 * GPLv3 
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Response}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Response<T> {

    private Meta meta;

    private T data;

    public Response() {
        super();
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("data")
    public T getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(T data) {
        this.data = data;
    }

}
