package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        //Arrange
        People people = new People();
        Person p1 = new Person(1,"name");

        //Action
        people.addPerson(p1);
        int expected = 1;
        int actual = people.count();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        //Arrange
        People people = new People();
        Person p1 = new Person(1,"name");
        Person p2 = new Person(2,"name");
        Person p3 = new Person(3,"name");

        //Action
        people.addPerson(p1);
        people.addPerson(p2);
        people.addPerson(p3);
        people.remove(p1);
        int expected = 2;
        int actual = people.count();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        //Arrange
        People people = new People();
        Person p1 = new Person(1,"name");
        Person p2 = new Person(2,"name");
        Person p3 = new Person(3, "name");
        people.addPerson(p1);
        people.addPerson(p2);
        people.addPerson(p3);

        //Action
        Person expected = p2;
        Person actual = people.findById(2);

        //Assert
        Assert.assertEquals(expected, actual);
    }
}
