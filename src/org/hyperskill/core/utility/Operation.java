package org.hyperskill.core.utility;

import org.hyperskill.enums.Menu;

import java.io.IOException;

import static org.hyperskill.core.utility.Constant.scanner;
import static org.hyperskill.core.utility.MenuUtil.teacherService;
public class Operation {

    public static void operation() throws IOException {

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
