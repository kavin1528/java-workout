// // constructor na argument ulla pass pandradhu dhan but class name um function name uh orey mari irukanum

// class rectangleShape{

//     int len,wid;

//     public rectangleShape()
//     // first idha dhan cl panum aprm dhan main function la iruka op ah print panum
//     {
//         System.out.println("Constructor Called");
//         len=2;
//         wid=8;
//     }

//     int area()
//     {
//         int a=len*wid;
//         return a;
//     }

// }
// public class constructor {
//     public static void main(String[] args) {
//         rectangleShape o= new rectangleShape();
//        System.out.println(" Rectangle :" +o.area());
//     }
    
// }





// // parameterized constructor & constructor overloading 

// class box
// {
//     float length, breadth;

//     public box() //default 
//     {
//         length=4;
//         breadth=3;
//     }
//     public box(float x,float y)  //parameterized constructor
//     {
//         length = x;
//         breadth =y;
//     }
//     public box(float x)
//     {
//         length= breadth=x;
//     }

//     public float add()
//     {
//         float a=length*breadth;
//         return a;
//     }
// }

// public class constructor {

//     public static void main(String[] args) {
        
//         box s1=new box();
//         System.out.println("Area  : "+s1.add());

//         box s2=new box(2,4);
//         System.out.println("Area  : "+s2.add());

//         box s3=new box(3);
//         System.out.println("Area  : "+s3.add());

//     }
// }







// copy constructor 

// /*
//  * just print 5+4i   num + imaginary num
//  */


// class copy
// {
//     private int real,img;

//     public copy()
//     {
//         this.real=2;
//         this.img=3;
//     }
//     public copy(int r,int i)
//     {
//         this.real=r;
//         this.img=i;
//     }
//     public copy(copy o2)
//     {
//         this.real=o2.real;
//         this.img=o2.img;
//     }
//     public String toString()  //tostring  dhan int ah string kooda join panum
//     {
//         return "("+real+ "+" +img+ "i)";
//     }
// }

// public class constructor {

//     public static void main(String[] args) {

//         copy o1=new copy();
//         System.out.println(o1);

//         copy o2=new copy(2,4);
//         System.out.println(o2);

        
//         copy o3=new copy(o2);
//         System.out.println(o3);


//     }
// }









// Array of object in java
// class student
// {
//     public int roll_no;
//     public String name;

//     student(int r,String n)
//     {
//         this.roll_no = r;
//         this.name = n;
//     }
//     void pr()
//     {
//         System.out.println("Roll number : "+roll_no);
//         System.out.println("Name : "+name);
//     }
// }
// public class constructor {

//     public static void main(String[] args) {

//         student[] o=new student[5];
//         // student o=new student(7,"kgds" );
//         o[0]=new student(10,"ram");
//         o[1]=new student(18,"sam");
//         o[2]=new student(39,"ravi");
//         o[3]=new student(90,"deleep");
//         o[4]=new student(23,"kumar");

//         for(int i=0 ;i<o.length;i++)
//         {
//             o[i].pr();
//         }   
        
//         o[0].pr();

//     }
// }






// Nested method in java
class demo 
{
    public int m , n;

    demo(int x,int y)
    {
        this.m=x;
        this.n=y;
    }
    int large()
    {
        if (m>n)
            return m;
        else
            return n;
        
    }
    void display()
    {
        int large=large();   // method kula method 
        System.out.println("Greatest number is : "+large);

        // System.out.println("Greatest number is : "+large());
    }

}
public class constructor {

    public static void main(String[] args) {
        
        demo o=new demo(8, 6);
        o.display();
    }
}
