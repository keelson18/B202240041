import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input Data

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.print("Enter Index Number: ");
        String indexNumber = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Gender (M/F): ");
        char gender = input.next().charAt(0);
        input.nextLine();

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Current Level: Lvl");
        int level = input.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        //Displaying Data
        System.out.print("      ");
        System.out.println("==========STUDENT PROFILE==========");
        System.out.println("name: "+name);
        System.out.println("IndexNumber: "+indexNumber);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Department: "+department);
        System.out.println("Current Level:"+level);
        System.out.println("GPA: "+gpa);


        //ADULT  STAT

        if (age >= 18) {
            System.out.println("ADULT STATUS: YES");}
        else  {
            System.out.println("ADULT STATUS: NO");
        }

        //GPA 
        if (gpa>=3.5 && gpa<=4.0)
        {
            System.out.println("ACADEMIC CLASS: First Class");
        }

        else if (gpa>=3.0 && gpa<=3.49)
        {System.out.println("ACADEMIC CLASS: Second Class Upper");
        }

        else if (gpa>=2.5 && gpa<=2.99)
        {System.out.println("ACADEMIC CLASS: Second Class Lower");
        }

        else
        {System.out.println("ACADEMIC CLASS: Pass");
        }

        System.out.println("====================");

        input.close();
    }
}
