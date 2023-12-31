package org.example;

public class Student{
    private String name;
    private String studentID;

    //빈거도 만들어야 한다 (만약 아무것도 안 만들면 그냥 만들어준다) 딴거 만들어두면 빈거는 자동으로 안생성해줌
    public Student(){
    }
    public Student(String name) {
        this.name = name;
    }


    public String getStudentID() {
        return studentID;
    }
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
