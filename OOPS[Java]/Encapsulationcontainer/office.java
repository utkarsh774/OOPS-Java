package Encapsulationcontainer;
public class office
{
     private String student;
     private int rnoll;
     static boolean admin;

   
    office()
    {

    }
    office(String student,int rnoll)
    {
        this.student = student;
        this.rnoll = rnoll;
    }   
    office(office s)
    {
        this.student = s.student;
        this.rnoll = s.rnoll;
    }

    public void getStudent()
    {
        if(admin)
        {
            System.out.print(this.student);
        }
        else
        {
            System.out.println("You don't have admin ascess");
        }
      
    }

    public void getRollNo()
    {
        System.out.println(this.rnoll);
    }

    public void setStudent(String student)
    {
        this.student  = student;
    }

    public void setRollNo(int rnoll)
    {
        this.rnoll = rnoll;
    }

    public static void main(String[] args)
    {
        office s = new office("utkarsh",12);
        System.out.println(s.student);
        System.out.println(s.rnoll);

        s.student = "rahul";

        System.out.println(s.student);
        System.out.println(s.rnoll);

        office.admin = true; 
    }


}
    
