package com.thoughtworks.module;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private Student[] students;

    public Teacher() {
    }

    public Teacher(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> findDuplicate() {
        List<Student> nonDuplication = new ArrayList<>();
        List<Student> duplication = new ArrayList<>();
        for (Student student : students) {
            if (!nonDuplication.contains(student)) {
                nonDuplication.add(student);
            } else {
                duplication.add(student);
            }
        }

        return duplication;
    }
}
