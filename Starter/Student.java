package Starter;


import java.sql.SQLOutput;

public class Student
{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
       Student s1 = new Student(18, "John");
       Student s2 = new Student(20, "Jane");
        System.out.println(s1.age + " " + s1.name);
        System.out.println(s2.age + " " + s2.name);
       int tempAge = s1.getAge();
       String tempName = s1.getName();
       s1.setAge(s2.getAge());
       s1.setName(s2.getName());
       s2.setAge(tempAge);
       s2.setName(tempName);
        System.out.println(s1.age + " " + s1.name);
        System.out.println(s2.age + " " + s2.name);
    }
}
