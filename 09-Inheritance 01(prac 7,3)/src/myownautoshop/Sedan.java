package myownautoshop;
public class Sedan extends Car{
    private int length;
    
    public Sedan(int speed,double regularPrice,String color,int length)
    {
        super(speed,regularPrice,color);
        this.length=length;
    }
    public double getSalePrice()
    {
        int d;
        if(length>20)
            d=5%100;
        else
            d=10%100;
        return d;        
    }
}

