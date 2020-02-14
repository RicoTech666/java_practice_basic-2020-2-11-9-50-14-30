package com.thoughtworks.module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private int studentId;
    private String registrationDate;

    public Student(String name, int studentId, String registrationDate) {
        this.name = name;
        this.studentId = studentId;
        this.registrationDate = registrationDate;
    }

    public String processRegistrationDate() throws ParseException {
        SimpleDateFormat sdfOld = new SimpleDateFormat(registrationDate);
        Date date = sdfOld.parse(registrationDate);
        SimpleDateFormat sdfNew = new SimpleDateFormat("yyyy年mm月dd日");
        return sdfNew.format(date);
    }

    public int computeEnrollmentYear() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(registrationDate);
        Date date = sdf.parse(registrationDate);
        Date currentDate = new Date();
        return (int) (currentDate.getTime() - date.getTime()) / (365 * 24 * 60 * 1000);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("我叫").append(name).append("，我的学号是").append(studentId).append("，")
                .append(processRegistrationDate()).append("入学，学龄").append(computeEnrollmentYear()).append("年");
        System.out.println(info);
    }
}
