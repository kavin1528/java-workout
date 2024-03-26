import java.util.Scanner;

public class if_condition
{
    public static void main(String[] args) {

       
        Scanner in=new Scanner(System.in);
        int age;
        System.out.println("Enter your Age : ");
        age=in.nextInt();
        
        if (age>18)
        {
            System.out.println("Your are eligible ");
        } 
            
        

    }
}