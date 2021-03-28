package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor> implements Teacher {

    private static final Instructors INSTANCE = new Instructors();
    List<Instructor> teacherList = new ArrayList<Instructor>();
    public Instructor Younger = new Instructor(1,"Younger");
    public Instructor Dolio = new Instructor(2,"Dolio");
    public Instructor Nobles = new Instructor(3,"Nobles");
    public Instructor Dan = new Instructor(4,"Dan");
    public Instructor Lossie = new Instructor(4,"Lossie");

    private Instructors(){
        teacherList.add(Younger);
        teacherList.add(Dolio);
        teacherList.add(Nobles);
        teacherList.add(Dan);
        teacherList.add(Lossie);
    }

    public static Instructors getInstance(){return INSTANCE;}

    public Person findInstructorById(long id){
        for(Instructor teacher: teacherList){
            if(teacher.getId() == id){
                return teacher;
            }
        }return null;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learner: learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
    @Override
    public Instructor[] getArray() {
        int counter = 0;
        Instructor[] teacherArray = new Instructor[teacherList.size()];
        for(Instructor teacher: teacherList){
            teacherArray[counter] = teacher;
            counter++;
        }return teacherArray;
    }
}
