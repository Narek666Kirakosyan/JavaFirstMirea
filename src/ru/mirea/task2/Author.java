package ru.mirea.task2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(){}

    public Author(String n, String e, char g){
       name=n;
       email=e;
       gender=g;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return this.name+" ("+this.gender+") "+" at "+this.email;
    }
}
