package io.zipcoder.interfaces;

public class Person {

    final long id;
    private String name = "";

    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(long id){
        id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public long getId(){
        return id;
    }

}
