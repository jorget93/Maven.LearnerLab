package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Arrange
        Person p1 = new Person(123, "name");

        //Action
        long expectedId = 123;
        String expectedName = "name";
        long actualId = p1.getId();
        String actualName = p1.getName();

        //Assert
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        //Arrange
        Person p1 = new Person(123, "name");

        //Action
        p1.setName("person");
        String expected = "person";
        String actual = p1.getName();

        //Assert
        Assert.assertEquals(expected, actual);
    }

}
