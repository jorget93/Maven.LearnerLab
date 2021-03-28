package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<Person> {

    List<Person> personList = new ArrayList<Person>();

    public void addPerson(Object E){
        personList.add((Person)E);
    }

    public Person findById(long id){
        for(Person person: personList){
            if(person.getId() == id){
                return person;
            }
        }return null;
    }

    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] getArray();


    public Iterator iterator() {
        return personList.listIterator();
    }
}
