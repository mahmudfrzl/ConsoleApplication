package org.hyperskill.utility;

import org.hyperskill.domain.Teacher;
import org.hyperskill.service.teacher.TeacherManager;
import org.hyperskill.service.teacher.TeacherService;

import java.math.BigDecimal;
import java.util.Scanner;

public class MenuUtil {

    public static void create(){
        TeacherService teacherService = TeacherManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of teacher");
        String name = scanner.next();
        System.out.println("Enter the surname of teacher");
        String surname  = scanner.next();
        System.out.println("Enter the age of teacher");
        int age = scanner.nextInt();
        System.out.println("Enter the salary of teacher");
        BigDecimal salary = scanner.nextBigDecimal();

        System.out.println(teacherService.create(
                new Teacher.TeacherBuilder()
                        .age(age)
                        .surname(surname)
                        .name(name)
                        .salary(salary)
                        .build())); // Builder pattern
    }


    public static void delete(){
        TeacherService teacherService = TeacherManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of teacher");
        String name = scanner.next();
        teacherService.delete(name);
    }

    public static void getByName(){
        TeacherService teacherService = TeacherManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of teacher");
        String name = scanner.next();
        System.out.println(teacherService.getByName(name));
    }
}
