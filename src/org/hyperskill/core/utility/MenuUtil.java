package org.hyperskill.core.utility;

import org.hyperskill.domain.Teacher;
import org.hyperskill.enums.Menu;
import org.hyperskill.service.teacher.TeacherManager;
import org.hyperskill.service.teacher.TeacherService;
import static org.hyperskill.core.utility.Scan.*;
import java.math.BigDecimal;

public class MenuUtil {
    protected static final TeacherService teacherService = TeacherManager.getInstance();

    protected static void create(){
        String name = scanName();
        String surname = scanSurName();
        int age = scanAge();
        BigDecimal salary = scanSalary();

        var data = teacherService.create(new Teacher.TeacherBuilder()
                        .age(age)
                        .surname(surname)
                        .name(name)
                        .salary(salary)
                        .build()); // Builder pattern
        System.out.println(data);
    }

    protected static void delete(){
        String name = scanName();
        teacherService.delete(name);
    }

    protected static void getByName(){
        String name = scanName();
        System.out.println(teacherService.getByName(name));
    }

    public static void startMenu(){
        System.out.println("Which processes you would like to do?");
        Menu[] menus = Menu.values();
        for (Menu menu : menus){
            System.out.println(menu.toString());
        }
    }
}
