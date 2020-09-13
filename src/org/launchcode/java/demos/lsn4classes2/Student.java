package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        String gradeLevel = "";
        if (this.numberOfCredits <= 29) {
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits > 29 && this.numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits > 61 && this.numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits > 89) {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }


    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double currentTotalQuality = this.gpa * this.numberOfCredits;
        double newQuality = grade * courseCredits;
        double updateTotalQuality = newQuality + currentTotalQuality;
        this.numberOfCredits += courseCredits;
        this.gpa = updateTotalQuality / (this.numberOfCredits);
    }

    public String toString() {
        return this.name + ": " + this.studentId + " (Credits: " + this.numberOfCredits + ", GPA: " + this.gpa + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }

}
