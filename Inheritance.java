// // Single Inheritance   ph.galary.java.pic
// class father  //base class
// {
//     public void house()
//     {
//         System.out.println("have own house ");
//     }
// }
// class son extends father   //derive class
// // extend use pani father class ah access panikalam indha class la irundhey
// {
//     public void car()
//     {
//         System.out.println("have own audi car");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         son x = new son();
//         x.car();
//         x.house();
//     }
    
// }






// // Multilevel inheritance
// class grandfather  //base class
// {
//     public void land()
//     {
//         System.out.println("have own 5 Acor land  ");
//     }
// }

// class father extends grandfather //derive class
// {
//     public void house()
//     {
//         System.out.println("have own b2h house ");
//     }
// }
// class son extends father   //derive class
// // extend use pani father class ah access panikalam indha class la irundhey
// {
//     public void car()
//     {
//         System.out.println("have own audi car");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         son x = new son();
//         x.car();
//         x.house();
//         x.land();
//     }
    
// }







// // Hierarchical inhertance 

// class shape
// {
//     float length,breadth,radius;   
// }

// class rect extends shape
// {
//     rect(float l,float b)
//     {
//         length=l;
//         breadth=b;
//     }
//     float rectangle_area()
//     {
//         return length*breadth;
//     }

// } 
// class circle extends shape
// {
//     circle(float r)
//     {
//         radius=r;
//     }
//     float circle_area()
//     {
//         return radius*radius;
//     }
// }
// class sqare extends shape
// {
//     sqare(float l)
//     {
//         length=l;
//     }
//     float sqare_area()
//     {
//         return length*length;
//     }
// }
// public class Inheritance {

//     public static void main(String[] args) {
//         rect o1= new rect(4, 5);
//         System.out.println( "Area of rectangle : "+o1.rectangle_area());

//         circle o2= new circle(4);
//         System.out.println( "Area of circle  : "+o2.circle_area());

//         sqare o3= new sqare(8);
//         System.out.println( "Area of sqare : "+o3.sqare_area());
//     }
// }







// // method with varargs in java

// public class Inheritance 
// {

//     // multi names ah arg ah pass pandradhuku 
//     public static void getnames(String...names)   //(string name ) ipudi pota one name dhan store panum
//     {
//         for(String n :names)
//             System.out.println(n);        
//     }
//     public static void main(String[] args) 
//     {
//         getnames("kavin","navin","rahul","chandru");
//     }
// }