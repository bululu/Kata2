package cata3;

public class Person {
    private final String name;
    private int age;
    private static int MAX_AGE=150;
    private int questions;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        questions=0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getQuestions() {
        return questions;
    }
    

    public static int getMaxage() {
        return MAX_AGE;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }
    
    
}
