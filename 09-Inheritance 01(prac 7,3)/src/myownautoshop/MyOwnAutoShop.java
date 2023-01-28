package myownautoshop;
public class MyOwnAutoShop {
    public static void main(String[] args) {
        
        Sedan s=new Sedan(50,1999,"red",2001);
        System.out.println("Sale Price: "+s.getSalePrice());
        
        Ford f1=new Ford(60,1998,"Blue",2002,500);
        System.out.println("Sale Price: "+s.getSalePrice());
        Ford f2=new Ford(70,1997,"Green",2003,600);
        System.out.println("Sale Price: "+s.getSalePrice());
        
        Car c = new Car(8, 1996, "Black");
        System.out.println("Sale Price:  "+c.getSalePrice());       
    }   
}
