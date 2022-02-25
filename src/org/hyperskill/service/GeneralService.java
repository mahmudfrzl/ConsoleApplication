package org.hyperskill.service;

import org.hyperskill.core.response.Response;

import java.io.IOException;
import java.util.List;

public interface GeneralService <T> {

    Response<T> create(T payload) throws IOException;
    Response<List<T>> getAll();
    void delete(String name);
    Response<T> getByName(String name);
}
