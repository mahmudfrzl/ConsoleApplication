package org.hyperskill.core.response;

public class ErrorResponse<T> extends Response.ResponseBuilder<T> {
    @Override
    public Response<T> build() {
        success(false);
        return super.build();
    }
}
