package org.hyperskill.service.teacher;

import org.hyperskill.domain.Teacher;
import org.hyperskill.exception.ResourceException;
import org.hyperskill.utility.response.Response;
import org.hyperskill.utility.response.SuccessResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

import static java.util.stream.Collectors.*;

import static org.hyperskill.utility.Constant.*;

public class TeacherManager implements TeacherService {
    private static TeacherManager  teacherManager = null;


    private TeacherManager(){

    }
    public static TeacherManager getInstance(){
        if (teacherManager == null){
            teacherManager = new TeacherManager();
        }
        return teacherManager;
    }


    @Override
    public Response<Teacher> create(Teacher teacher) {
        final var payload =new Teacher.TeacherBuilder()
                .age(teacher.getAge())
                .name(teacher.getName())
                .surname(teacher.getSurname())
                .salary(teacher.getSalary())
                .build();

        teachers.add(payload);



        return new SuccessResponse<Teacher>()
                .localDateTime(LocalDateTime.now())
                .message("Teacher has been successfully created")
                .payload(payload)
                .build();

    }

    @Override
    public  Response<List<Teacher>> getAll() {
       final var data = new ArrayList<>(teachers);
       if (data.isEmpty()) throw new ResourceException("NO CONTENT!");

        return new SuccessResponse<List<Teacher>>()
                .localDateTime(LocalDateTime.now())
                .message("Teacher has been successfully created")
                .payload(data)
                .build();
    }

    @Override
    public void delete(String name) {
         var data = teachers.stream().filter(teacher -> Objects.equals(teacher.getName(), name)).collect(toList());
        if (data.isEmpty()) throw new ResourceException("NO CONTENT!");
        teachers.removeAll(data);
        System.out.println(name + " has been deleted");
    }

    @Override
    public Response<Teacher> getByName(String name) {
        final var optionalTeacher = teachers.stream().filter(teacher -> Objects.equals(teacher.getName(), name)).findFirst();
        final var payload = optionalTeacher.orElseGet(optionalTeacher::orElseThrow);
        return new SuccessResponse<Teacher>()
                .localDateTime(LocalDateTime.now())
                .message("Teacher has been successfully created")
                .payload(payload)
                .build();
    }
}
