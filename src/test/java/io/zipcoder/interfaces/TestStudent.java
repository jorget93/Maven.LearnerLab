package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Arrange
        Student student = new Student(1, "name");

        //Assert
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Arrange
        Student student = new Student(1, "name");

        //Assert
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Arrange
        Student student = new Student(1, "name");
        student.learn(100.0);

        //Action
        double expected = 100.0;
        double actual = student.getTotalStudyTime();

        //Assert
        Assert.assertEquals(expected, actual, 0.01);
    }

}
