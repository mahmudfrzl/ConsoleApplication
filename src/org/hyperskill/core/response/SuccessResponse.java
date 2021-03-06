package org.hyperskill.core.response;


public class SuccessResponse<T> extends Response.ResponseBuilder<T> {
    @Override
    public Response<T> build() {
        success(true);
        return super.build();
    }
}
