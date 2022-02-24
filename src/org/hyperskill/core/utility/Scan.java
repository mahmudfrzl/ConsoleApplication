package org.hyperskill.core.utility;

import java.math.BigDecimal;
import static org.hyperskill.core.utility.Constant.scanner;

public class Scan {

    protected static String scanName(){

        System.out.println("Enter the name of teacher");
        return scanner.next();
    }
    protected static String scanSurName(){

        System.out.println("Enter the surname of teacher");
        return scanner.next();
    }
    protected static int scanAge(){

        System.out.println("Enter the age of teacher");
        return scanner.nextInt();
    }
    protected static BigDecimal scanSalary(){

        System.out.println("Enter the salary of teacher");
        return scanner.nextBigDecimal();
    }
}
