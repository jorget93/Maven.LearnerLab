package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    List<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person){
        personList.add(person);
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
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }


    public Iterator<Person> iterator() {
        return personList.listIterator();
    }
}
