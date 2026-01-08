package org.example.Head03_JCF.example02_StudentManagement;

public class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String toString() {
        return "Student{name: '" + name + "', age: " + age + ", studentId:'" + studentId + "'}";
    }
}
