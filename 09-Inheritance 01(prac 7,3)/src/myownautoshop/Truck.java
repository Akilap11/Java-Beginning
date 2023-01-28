package myownautoshop;
public class Truck extends Car {
    private int weight;
//if there is a constructor in base class, its must to use a constructor in child class. Cause of instructors 

    public Truck(int speed,double regularPrice,String color,int weight)//public aniwa na
    {
        super(speed,regularPrice,color);
        this.weight=weight;
    }    
    public double getSalePrice()
    {
double sp;
if(weight>2000)
    {
        sp=regularPrice=(regularPrice*0.10f);
    }
else
    {
        sp=regularPrice=(regularPrice*0.20);
    }     
return sp;
    }
}

