package org.hyperskill;

import org.hyperskill.enums.Menu;
import org.hyperskill.service.teacher.TeacherManager;

import org.hyperskill.service.teacher.TeacherService;
import org.hyperskill.utility.MenuUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            TeacherService teacherService = TeacherManager.getInstance();

            while (true){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Which processes you would like to do?");
                    Menu[] menus = Menu.values();
                    for (Menu menu : menus){
                            System.out.println(menu.toString());
                    }
                    int operation = scanner.nextInt();
                    if(operation == Menu.SYSTEM_EXIT.getStatus()){
                            System.exit(operation);
                    }else if(operation == Menu.CREATE.getStatus()){
                            MenuUtil.create();
                    }else if (operation == Menu.GETALL.getStatus()){
                            System.out.println(teacherService.getAll());
                    }else if(operation == Menu.DELETE.getStatus()){
                            MenuUtil.delete();
                    }else if(operation == Menu.GETBYNAME.getStatus()){
                         MenuUtil.getByName();
                    }else{
                            System.out.println("Please select exist operation:1,2,3,4 or -1");
                    }



            }



    }
}
