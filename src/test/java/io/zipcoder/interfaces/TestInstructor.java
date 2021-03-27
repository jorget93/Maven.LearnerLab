package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Arrange
        Instructor teacher = new Instructor(1, "Teacher");

        //Assert
        Assert.assertTrue(teacher instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Arrange
        Instructor teacher = new Instructor(1,"Teacher");

        //Assert
        Assert.assertTrue(teacher instanceof Person);
    }

    @Test
    public void testTeach(){
        //Arrange
        Instructor teacher = new Instructor(1,"Teacher");
        Student stu1 = new Student(2,"stu1");

        //Action
        teacher.teach(stu1,100.0);
        double expected = 100.0;
        double actual = stu1.getTotalStudyTime();

        //Assert
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLecture(){
        //Arrange
        Instructor teacher = new Instructor(1,"Teacher");
        Student stu1 = new Student(2,"stu1");
        Student stu2 = new Student(3,"stu2");
        Student stu3 = new Student(4,"stu3");
        Learner[] learners = {stu1, stu2, stu3};

        //Action
        teacher.lecture(learners,300.0);
        double expected = 100.0;
        double actual1 = stu1.getTotalStudyTime();
        double actual2 = stu1.getTotalStudyTime();
        double actual3 = stu1.getTotalStudyTime();

        //Assert
        Assert.assertEquals(expected, actual1,0.01);
        Assert.assertEquals(expected, actual2,0.01);
        Assert.assertEquals(expected, actual3,0.01);
    }
}
