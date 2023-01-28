package javaapplication90;
abstract class car {
    public abstract void carName();
    public void carPrice()
    {
        System.out.println("20000");
    }
}
class toyota extends car
        {
    public void carName()
    {
        System.out.println("TOYOTA");
    }
}
