// data hiding getter and setter in java
// getter setter vachi private function la  out side epudi input vanguradhunu pakalam 


class ShapeRectangle
{
    private int length,width;
    // private function ah direct ah outside class la access pana mudiyadhu adhukaga dhan nama object create pandrom 
    
    // Getter method 
    // mela private la iruka length value ah vangi idhukula store panikudhu 
    int getlength()
    {
        return length;
    }
    int getwidth()
    {
        return width;
    }


    // Setter method
    // vanguna length ah l la store panikudhu  
    void setlength(int l)
    {
        length=l;
    }
    void setwidth(int w)
    {
        width=w;
    }

    int getdetail()
    {
        int a=length*width;
        return a;
    }


}

public class getter_setter {

    public static void main(String[] args) {
        
        ShapeRectangle o= new ShapeRectangle();
        o.setlength(5);
        o.setwidth(9);
        System.out.println("length value is : "+o.getlength());
        System.out.println("width value is : "+o.getwidth());
        System.out.println("shape of the rectangle is : "+o.getdetail());
    }
}
