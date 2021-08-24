package StudentMark;

import java.util.Scanner;

public class StudentMark {
    String rollNumber;
    String name;
    String classroom;
    String subject;
    float mark;

    public StudentMark() {
    }

    public StudentMark(String rollNumber, String name, String classroom, String subject, float mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.classroom = classroom;
        this.subject = subject;
        this.mark = mark;
    }

    public void getInfo(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter roll Number: ");
        rollNumber = input.nextLine();
        System.out.println("Enter Name: ");
        name = input.nextLine();
        System.out.println("Enter Class Room: ");
        classroom = input.nextLine();
        System.out.println("Enter Subject: ");
        subject = input.nextLine();
        System.out.println("Enter Mark: ");
        mark = Float.parseFloat(input.nextLine());
    }
    public void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "StudentMark{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }

    public String  getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public static void main(String[] args) {
    StudentMark studentMark = new StudentMark();
    studentMark.getInfo();
    StudentMark studentMark1 = new StudentMark("R01","T1","MATK","MATH",9);
    studentMark.show();
    studentMark1.show();
        System.out.println("Student Mark Max");
    if(studentMark.getMark()> studentMark1.getMark()){
        studentMark.show();
    }else if(studentMark.getMark()< studentMark1.getMark()){
        studentMark1.show();
    }else{
        System.out.println("Bang nhau");
    }
    }
    }
