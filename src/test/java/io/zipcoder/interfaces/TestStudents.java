package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){
        //Arrange
        Students students = Students.getInstance();

        //Action
        Student student = (Student) students.classList.get(0);

        //Assert
        Assert.assertTrue(student.getName() =="Jorge");
    }

}
