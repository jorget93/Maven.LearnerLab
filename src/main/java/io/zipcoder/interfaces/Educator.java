package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    YOUNGER(new Instructor((long)1,"Younger"),0.0),
    DOLIO(new Instructor((long)2,"Dolio"),0.0),
    NOBLES(new Instructor((long)3,"Nobles"),0.0),
    DAN(new Instructor((long)4,"Dan"),0.0),
    LOSSIE(new Instructor((long)5,"Lossie"),0.0);

    private final Instructor instructor;
    private Double timeWorked;


    Educator(Instructor teacher, double timeWorked) {
        this.instructor = teacher;
        this.timeWorked = timeWorked;
        Instructors instructors = Instructors.getInstance();
        instructors.addPerson(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
    }
}
