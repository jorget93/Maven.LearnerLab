package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student>{

    private static final Students INSTANCE = new Students();
    List<Student> classList = new ArrayList<Student>();
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
        classList.add(Jorge);classList.add(Greg);classList.add(Kelly);
        classList.add(Chris);classList.add(Abe);classList.add(Hazel);
        classList.add(Justin);classList.add(Theresa);classList.add(Monali);
        classList.add(Ashley);classList.add(Lena);classList.add(Mike);
        classList.add(Xiong);classList.add(Ryan);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] getArray() {
        int counter = 0;
        Student[] studentArray = new Student[classList.size()];
        for(Person person: classList){
            studentArray[counter] = (Student) person;
            counter++;
        }return studentArray;
    }
}
