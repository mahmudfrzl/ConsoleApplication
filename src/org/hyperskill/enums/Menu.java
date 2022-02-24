package org.hyperskill.enums;

import org.hyperskill.service.teacher.TeacherService;

public enum Menu {
    CREATE(1,"Create")
    ,GETALL(2,"GetAll")
    ,DELETE(3,"Delete")
    , GETBYNAME(4,"GetData")
    ,SYSTEM_EXIT(-1,"STOP");

    private final int status;
    private final String process;



    Menu(int status, String process) {
        this.status = status;
        this.process =process;
    }


    @Override
    public String toString() {
        return status + "." + process;
    }

    public int getStatus() {
        return status;
    }
}
