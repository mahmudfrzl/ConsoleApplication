package org.hyperskill.service;

import org.hyperskill.utility.response.Response;

import java.util.List;

public interface GeneralService <T> {

    Response<T> create(T payload);
    Response<List<T>> getAll();
    void delete(String name);
    Response<T> getByName(String name);
}
