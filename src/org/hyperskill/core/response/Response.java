package org.hyperskill.core.response;

import java.time.LocalDateTime;

public final class Response<T> {

    private final String message;
    private final boolean success;
    private final LocalDateTime localDateTime;
    private final T payload;



    public Response(ResponseBuilder<T> responseBuilder) {
        this.message = responseBuilder.message;
        this.success = responseBuilder.success;
        this.localDateTime = responseBuilder.localDateTime;
        this.payload = responseBuilder.payload;
    }

    @Override
    public String toString() {
        return "{" +
               "\n message='" + message + '\'' +
               ",\n success=" + success +
               ",\n localDateTime=" + localDateTime +
               ",\n payload=" + payload +"\n"+
               '}';
    }


    public static class ResponseBuilder<T>{
        private String message;
        private boolean success;
        private LocalDateTime localDateTime;
        private T payload;

        public ResponseBuilder<T> message(String message){
            this.message = message;
            return this;
        }
        public ResponseBuilder<T> localDateTime(LocalDateTime localDateTime){
            this.localDateTime = localDateTime;
            return this;
        }
        public void success(boolean success){
            this.success = success;
        }
        public ResponseBuilder<T> payload(T payload){
            this.payload = payload;
            return this;
        }
        public Response<T> build(){
            return new Response<>(this);
        }
    }
}
