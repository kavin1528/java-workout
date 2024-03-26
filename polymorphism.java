/*
 * method overloading in java.
 * 
 * method overloading na method name orey mari irukanum and return type(int) vera mari 
 * irukalm and parameter vera mari irukalam but method name orey mari irukanum
 */

// public class polymorphism {
    
//     public static int multiply(int a, int b)
//     {
//         return a*b;
//     }
//     public static float multiply(float x, float y) // parameter and return type diff 
//     {
//         return x*y;
//     }
//     public static double multiply(double w, double i)  
//     {
//         return w*i;
//     }
//     public static double multiply(double k, int v)  // onu double uh onu int uh
//     {
//         return k*v;
//     }
//     public static int multiply(int h)  // parameter matum change paniruken
//     {
//         return h*h;
//     }

//     public static void main(String[] args) {
//         System.out.println("2 int value          : "+multiply(7,8));
//         System.out.println("2 float value        : "+multiply(9.0,3.8));
//         System.out.println("1 int 1 double value : "+multiply(8.7,8));
//         System.out.println("2 float value        : "+multiply(7,8));
//         System.out.println("1 int value        : "+multiply(5));
//     }

// }











//  Method overridding 

// class user
// {
//     String name;
//     int age;

//     user(String n,int i)
//     {
//         this.age=i;
//         this.name=n;
//     }

//     public void dispaly()
//     {
//         System.out.println( "Name : "+name);
//         System.out.println("age : "+age);
//     }
// }
// class mainprogrammer extends user
// {
//     public String company;

//     mainprogrammer(String n,int i,String c)
//     {
//         super(n,i); // method overridding
//         this.company=c; 
//     }
//     public void dispaly()
//     {
//         System.out.println( "Name : "+name);
//         System.out.println("age : "+age);
//         System.out.println("company : "+company);
//     }
// }
// public class polymorphism {

//     public static void main(String[] args) {
//         mainprogrammer o= new mainprogrammer("kavin", 17, "bck");
//         o.dispaly();
//     }
// }






// Method overridding
class user 
{
    String name ;
    int age;

    user(String n,int a)
    {
        this.age=a;
        this.name=n;
    }
    void dispaly()
    {
        System.out.println( "Name : "+name);
        System.out.println( "age : "+age);
    }
}
class child extends user
{
    String company;

    child(String n, int a,String c)
    {
        super(n,a);
        this.company=c;
       
    }
    void dispaly()
    {
        System.out.println( "Name :"+name);
        System.out.println( "age : "+age);
        System.out.println( "company  : "+company);
    }
}
public class polymorphism {

    public static void main(String[] args) {
        child o=new child("kavin",15,"bck");
        o.dispaly();
    }
}