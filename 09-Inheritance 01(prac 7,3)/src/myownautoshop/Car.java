package myownautoshop;
public class Car {
    private int speed;
    protected double regularPrice; //to give access to child class(look truck class)
    private String color;
    
    public Car(int speed,double regularPrice,String color)
    {
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }    
    public double getSalePrice()
    {
        return regularPrice;              
    }    
}
