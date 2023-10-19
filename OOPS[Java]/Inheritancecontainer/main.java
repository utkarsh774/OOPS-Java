package Inheritancecontainer;


public class main{
    

    public static void main(String[] args)
    {
        human h = new human("tom",24);
        System.out.println(h.name);
        System.out.println(h.age);

        student s = new student("tom",24,"Indian University");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.university);

        coder c = new coder("tom",24,"Indian University","java");

        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.university);
        System.out.println(c.techStack);

        teacher t = new teacher("dumbledoor",150,"Magic",7);

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.section);



    }
}
