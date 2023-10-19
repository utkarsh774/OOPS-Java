package Inheritancecontainer;

public class teacher extends human{
    String qualification;
    int section;

    teacher()
    {

    }
    teacher(String name,int age,String qualification,int section)
    {
        super(name,age);
        this.qualification = qualification;
        this.section = section;
    }

    teacher(teacher t)
    {
        super(t);
        this.qualification = t.qualification;
        this.section=t.section;
    }
}