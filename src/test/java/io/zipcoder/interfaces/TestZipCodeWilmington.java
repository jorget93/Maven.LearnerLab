package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        //Arrange
        ZipCodeWilmington school = ZipCodeWilmington.getInstance();
        Students student = Students.getInstance();
        Instructors teacher = Instructors.getInstance();

        //Action
       school.hostLecture(2,100.0);
       double expected = 100.0;
       double actual = student.classList.get(0).getTotalStudyTime();

        //Assert
        Assert.assertEquals(expected, actual, 0.01);
    }

}
