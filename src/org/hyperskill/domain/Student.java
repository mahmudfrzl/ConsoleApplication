package org.hyperskill.domain;

import java.math.BigDecimal;

public class Student extends Person{
    private final BigDecimal scholarShip;



    public Student(StudentBuilder studentBuilder) {
        super(studentBuilder.name, studentBuilder.surname, studentBuilder.age);
        this.scholarShip = studentBuilder.scholarShip;
    }

    @Override
    public String toString() {
        return "Student{" +
               "scholarShip=" + scholarShip +
               '}';
    }

    static class StudentBuilder{
        private BigDecimal scholarShip;
        private String name;
        private String surname;
        private int age;

        public StudentBuilder scholarShip(BigDecimal scholarShip){
            this.scholarShip = scholarShip;
            return this;
        }

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder surname(String surname){
            this.surname = surname;
            return this;
        }


        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
