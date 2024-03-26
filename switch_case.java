import java.util.Scanner;

public class switch_case {

     public static void main(String[] args) 
     {
        
        int a,b,c,ch;
        Scanner in = new Scanner(System.in);
        System.out.println(" 1.Add ");
        System.out.println(" 2.Sub ");
        System.out.println(" 3.Mul ");
        System.out.println(" 4.Div ");
        System.out.println(" Enter any num : ");
        ch=in.nextInt();
        System.out.println("Enter any two no : ");
       
        a=in.nextInt();
        b=in.nextInt();
        switch (ch) 
        {
            case 1:
                System.out.println(" 1.Add ");
                c=a+b;
                System.out.println(" Result : "+c);
                break;
            case 2:
                System.out.println(" 2.Sub ");
                c=a-b;
                System.out.println(" Result : "+c);
                break;
            case 3:
                System.out.println(" 3.Mul ");
                c=a*b;
                System.out.println(" Result : "+c);
                break;
            case 4:
                System.out.println(" 4.Div ");
                c=a/b;
                System.out.println(" Result : "+c);
                break;
            default:
                System.out.println("Invalid no");
                break;
        }

     }
}
