import java.util.Scanner;

public class nested_if {
    
    public static void main(String[] args) {
        
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marital staus M/U :  ");
        char marital=in.next().charAt(0);
        if (marital=='u' || marital=='U') 
        {
            System.out.println("Enter your gender M/F : ");
            char gender =in.next().charAt(0);
            System.out.println("Enter your age : ");
            int age =in.nextInt();

            if ((gender=='m' || gender=='M' ) && age>=30)
            {
                System.out.println("your are eligible ");
                
            }
            else if((gender=='f' || gender=='F') && age>=25)
            {
                System.out.println("your are eligible ");
            }
            else
            {
                System.out.println(" you are not eligible");
            }
        }
        else if(marital=='m' || marital=='M')
        {
            System.out.println("You are eligible for insurance ");
        }
        else
        {
            System.out.println(" Invalid input");
        }


    }
}
