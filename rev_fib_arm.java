import java.util.Scanner;

public class rev_fib_arm {
    
    public static void main(String[] args) {
        
        // Scanner in=new Scanner(System.in);
        // System.out.println(" Enter any num : ");      //123
        // int n=in.nextInt();    
        // int reverse=0, rem;
        // while (n!=0)
        // {
        //     rem=n%10;   // 3  2  1
        //     reverse=(reverse*10)+rem; //3  2   1
        //     n=n/10;   //12  1
        // }
        // System.out.println("Reverse number : "+reverse);







        // Fibanosis

        // Scanner in=new Scanner(System.in);
        // System.out.println(" Enter any num : ");     
        // int n=in.nextInt();
        // int a=-1,b=1,c;
        // for(int i=1;i<=n;i++);
        // {
        //     c=a+b;
        //     System.out.println(c);
        //     a=b;
        //     b=c;

        // }







        // Armstrong number
        // Scanner in=new Scanner(System.in);
        // System.out.println(" Enter 3 num : ");     
        // int number=in.nextInt();   // 123
    //     int temp=number;    // its just a dublicate variable 
    //     int d1,d2,d3;

    //    // idhu just number ah pirikuradhukaga dhan

    //     d3=temp%10;  //3
    //     temp=temp/10;  //12

    //     d2=temp%10;  //2
    //     temp=temp/10; //1

        
    //    /* 
    //     * 153
    //     1 -----1*1*1=1
    //     5 -----5*5*5=125
    //     3 -----3*3*3=27
    //           ____________
    //                 153
    //    */

    //     d1=temp%10;  //1
    //     int result = (d1*d1*d1 )+(d2*d2*d2 )+(d3*d3*d3 );

    //     if (number==result)
    //     {
    //         System.out.println("This is armstrong number ");   
    //     }
    //     else
    //     {
    //         System.out.println("Not an armstrong number ");
    //     }
        






        
        // int d1,d2,d3,temp,number;

        // for (number = 100; number <=999; number++) 
        // {
        //     temp=number;
        //     d3=temp%10;  
        //     temp=temp/10;  

        //     d2=temp%10;  
        //     temp=temp/10; 


        //     d1=temp%10;  
        //     int result = (d1*d1*d1 )+(d2*d2*d2 )+(d3*d3*d3 );

        //     if (number==result)
        //     {
        //         System.out.println(number + " is armstrong number ");   
        //     }    
        // }






        // multiplication tables
        // Scanner in=new Scanner(System.in);
        // System.out.println(" Enter the table : ");     
        // int t=in.nextInt(); 
        // System.out.println("Enter the Limit : ");
        // int n=in.nextInt();

        // for(int i=1;i<=n;i++)
        // {
        //     System.out.println(i  + "*" + t + "=" + (i*t));
        // }





        // factor divisible by only 0
        // Scanner in=new Scanner(System.in);
        // System.out.println(" Enter the num : ");     
        // int n=in.nextInt(); 
        // for(int i=1;i<=n;i++)
        // {
        //     if (n%i==0)
        //     {
        //         System.out.println(i + " ");
                
        //     }
        // }




        

        // // prime number
        // Scanner in=new Scanner(System.in);
        // System.out.println(" Enter the num : ");  
        // int n,f,i;
        // n=in.nextInt();
        // f=0;
        // for(i=1;i<=n;i++)
        // {
        //     if (n%i==0)
        //     {
        //         f++;              
        //     }
        // }
        // if (f==2)
        // {
        //     System.out.println(n + "is a prime number ");   
        // }
        // else{
        //     System.out.println(n + " is not a prime number");
        // }




        // // perfect number
        // Scanner in = new Scanner(System.in);
        // System.out.println(" enter the number : ");
        // int n= in.nextInt();
        // int sum=0;
        // for (int i = 1; i < n; i++) 
        // {
        //     if (n%i==0)
        //     {
        //         sum+=i; //sum=0+1   
        //     }
        // } 
        // if (sum==n)
        // {
        //     System.out.println(n +" is a perfect number ");   
        // }else{
        //     System.out.println(n +"is not a perfect number ");
        // }

        







        

/*
 * strong number 
 * 1 =            1
 * 4 = 1*2*3*4=   24
 * 5 = 1*2*3*4*5= 120
 *               ______
 *                 145
 * 
 * 
 */

        // Scanner in = new Scanner(System.in);
        // System.out.println(" Enter the number : ");   //145
        // int num= in.nextInt();
        // int rem,OrgNum,fact,i,sum=0;
        // OrgNum=num;
        // while (num>0)
        // {
        //     rem=num%10;  // 5 4 1
        //     // System.out.println("Remainder : " +rem);

        //     fact=1;
        //     for (i=1;i<=rem;i++)
        //     {
        //         fact*=i;   // 1=1*1=1    1=1*2=2   2=2*3=6    6=6*4=24    24=24*5=120     24   1
        //     }
        //     sum+=fact; // 0=0+120    120=120+24=144   144=144+1=145
        //     // System.out.println("fact : "+fact);

        //     num=num/10; //14  1  
        // }
        // if (sum==OrgNum)
        // {
        //     System.out.println(OrgNum+ " " + "is a strong number ");   
        // }
        // else{
        //     System.out.println(OrgNum + " "+ "is a not  strong number "); 
        // }










        
        

    }
}


