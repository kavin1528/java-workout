import java.util.Scanner;

public class if_else {
    public static void main(String[] args) 
    {
        int year;
        System.out.println("Enter any year : ");
        Scanner in=new Scanner(System.in);
        
        
        year=in.nextInt();
        if(year%4==0 &&year%100==0 && year%400==0)
        {
            System.out.println(" this is leap year");
        }
        else{
            System.out.println("not leap year");
        }
        
    }

    

    
}