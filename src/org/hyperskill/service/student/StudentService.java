package org.hyperskill.service.student;

import org.hyperskill.domain.Student;
import org.hyperskill.service.GeneralService;
import org.hyperskill.core.response.Response;

import java.util.List;

public interface StudentService extends GeneralService<Student> {
    @Override
    Response<Student> create(Student payload);

    @Override
    Response<List<Student>> getAll();
}
