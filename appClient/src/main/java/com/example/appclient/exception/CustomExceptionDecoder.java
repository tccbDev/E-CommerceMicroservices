package com.example.appclient.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomExceptionDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();
    @Override
    public Exception decode(String s, Response response) {
        if (response.status() ==404){
            return new ProductNotFoundException("Produit non trouvé");
        }
        return defaultErrorDecoder.decode(s,response);
    }
}
