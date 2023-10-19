package Encapsulationcontainer;

public class client
{


    public static void main(String[] args)
    {
        office of = new office("Utkarsh",22);
        // System.out.println(of.student);
        // System.out.println(of.rnoll);

      //   of.getRollNo();
        office.admin = true; 
        of.getStudent();
        
    }
}