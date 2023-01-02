package main.java.pojo;

public class Student {
    
    int id;
    String name;
    String dateOfBirth;
    String classList;
    static int count = 1;
    public Student(String name, String dateOfBirth, String classList) {
        this.id = count;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
        count++;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", classList=" + classList
                + "]";
    }
    
    
}
