package com.thoughtworks.module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String studentId;
    private String registrationDate;

    public Student(String name, String studentId, String registrationDate) {
        this.name = name;
        this.studentId = studentId;
        this.registrationDate = registrationDate;
    }

    private String processRegistrationDate() {
        SimpleDateFormat sdfOld = new SimpleDateFormat("yyyy.MM.dd");
        Date date = null;
        try {
            date = sdfOld.parse(registrationDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdfNew = new SimpleDateFormat("yyyy年MM月dd日");
        return sdfNew.format(date);
    }

    private int computeEnrollmentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = null;
        try {
            date = sdf.parse(registrationDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date currentDate = new Date();
        double msPerYear = 1000 * 60 * 60 * 24 * 365D;
        System.out.println(msPerYear);
        assert date != null;
        return (int) Math.round((currentDate.getTime() - date.getTime()) / msPerYear);
    }

    @Override
    public String toString() {

        return "我叫" + name + "，我的学号是" + studentId + "，" +
                processRegistrationDate() + "入学，学龄" + computeEnrollmentYear() + "年";
    }

}
