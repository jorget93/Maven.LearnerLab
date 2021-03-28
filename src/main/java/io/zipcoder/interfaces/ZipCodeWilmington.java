package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington zipcode = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    HashMap<Student,Double> studentMap = new HashMap<Student, Double>();

    public void hostLecture(Teacher teacher, double numberOfHours){
        for(Student student: students.classList){
            teacher.teach(student, numberOfHours);
        }
    }

    public void hostLecture(long id, double numberOfHours){
//        for(Student student: students.classList) {
            Instructor teacher = (Instructor)instructors.findInstructorById(id);
            teacher.lecture(students.getArray(), numberOfHours);
//        }
    }

    public HashMap<Student, Double> getStudyMap(){
        for(Student student: students.classList){
            studentMap.put(student, student.getTotalStudyTime());
        }return studentMap;
    }

    public static ZipCodeWilmington getInstance(){
        return zipcode;
    }

}
