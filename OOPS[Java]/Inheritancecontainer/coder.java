package Inheritancecontainer;

public class coder extends student {
    String techStack;

    coder()
    {

    }
    coder(String name,int age,String university,String techStack)
    {
        // this.name = name;
        // this.age = age;
        // this.university = university;
        super(name,age,university);
        this.techStack = techStack;
    }
    coder(coder c)
    {
        super(c);
        this.techStack = c.techStack;
    }
}
