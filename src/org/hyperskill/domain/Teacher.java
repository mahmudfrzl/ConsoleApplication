package org.hyperskill.domain;

import java.math.BigDecimal;

public class Teacher extends Person{
    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public Teacher(Teacher.TeacherBuilder teacherBuilder) {
        super(teacherBuilder.name, teacherBuilder.surname, teacherBuilder.age);
        this.salary = teacherBuilder.salary;
    }

    @Override
    public String toString() {
        return "{" +
               "\n      salary=" + salary + '\n'+"    " +
               "  name='" + super.getName() + '\'' +
               ", \n      surname='" + super.getSurname() + '\'' +
               ", \n      age=" + super.getAge() +
               '}';
    }

     public static class TeacherBuilder{
        private BigDecimal salary;
        private String name;
        private String surname;
        private int age;

        public TeacherBuilder salary(BigDecimal salary){
            this.salary = salary;
            return this;
        }

        public TeacherBuilder name(String name){
            this.name = name;
            return this;
        }

        public TeacherBuilder surname(String surname){
            this.surname = surname;
            return this;
        }


        public TeacherBuilder age(int age){
            this.age = age;
            return this;
        }

        public Teacher build(){
            return new Teacher(this);
        }
    }

}
