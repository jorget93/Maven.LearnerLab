package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People{

    private static final Students = new Students();
    List<Student> INSTANCE = new ArrayList<Student>();
    public Student Jorge = new Student(1,"Jorge");
    public Student Greg = new Student(2,"Greg");
    public Student Kelly = new Student(3,"Kelly");
    public Student Chris = new Student(4,"Chris");
    public Student Abe = new Student(5,"Abe");
    public Student Hazel = new Student(6,"Hazel");
    public Student Justin = new Student(7,"Justin");
    public Student Theresa = new Student(8,"Theresa");
    public Student Monali = new Student(9,"Monali");
    public Student Ashley = new Student(10, "Ashley");
    public Student Lena = new Student(11, "Lena");
    public Student Mike = new Student(12,"Mike");
    public Student Xiong = new Student(13,"Xiong");
    public Student Ryan = new Student(14, "Ryan");

    private Students(){
        INSTANCE.add(Jorge);INSTANCE.add(Greg);INSTANCE.add(Kelly);
        INSTANCE.add(Chris);INSTANCE.add(Abe);INSTANCE.add(Hazel);
        INSTANCE.add(Justin);INSTANCE.add(Theresa);INSTANCE.add(Monali);
        INSTANCE.add(Ashley);INSTANCE.add(Lena);INSTANCE.add(Mike);
        INSTANCE.add(Xiong);INSTANCE.add(Ryan);
    }

    public List<Student> getInstance(){
        return INSTANCE;
    }
}
