package com.thoughtworks;

import com.thoughtworks.module.Student;
import com.thoughtworks.module.Teacher;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Student stu1 = new Student("张三", "001", "2019.02.11");
        System.out.println(stu1);

        Student[] stuArr = new Student[]{stu1, new Student("李四", "002", "2019.02.10"),
                new Student("王五", "001", "2019.02.09")};
        Teacher teacher = new Teacher("张龙", stuArr);
        List<Student> duplication = teacher.findDuplicate();

        System.out.println("重复的学生信息：");
        for (Student student : duplication) {
            System.out.println(student.getName() + "," + student.getStudentId() + "," + student.getRegistrationDate());
        }
    }
}
