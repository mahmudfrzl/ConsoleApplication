package org.hyperskill.service.teacher;

import org.hyperskill.domain.Teacher;
import org.hyperskill.service.GeneralService;
import org.hyperskill.core.response.Response;

import java.io.IOException;
import java.util.List;

public interface TeacherService extends GeneralService<Teacher> {
    @Override
    Response<Teacher> create(Teacher payload) throws IOException;

    @Override
    Response<List<Teacher>> getAll();

    @Override
    void delete(String name);

    @Override
    Response<Teacher> getByName(String name);
}
