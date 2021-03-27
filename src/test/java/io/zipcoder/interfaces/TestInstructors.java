package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        //Arrange
        Instructors instructors = Instructors.getInstance();

        //Action
        Instructor instructor = instructors.teacherList.get(0);

        //Assert
        Assert.assertTrue(instructor.getName() =="Younger");
    }
}
