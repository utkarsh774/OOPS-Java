package Inheritancecontainer;

public class student extends human {
    String university;

    student()
    {

    }
    student(String name,int age,String university)
    {
        super(name,age);
        this.university = university;
    }
    student(student s)
    {
        super(s);
        this.university = s.university;

    }
}
