package javaapplication15;
//presentation 5 slide 17
public class Bank {
    public float getrateofinterset()
            {
        return 0;    
    }
}
class SBI extends Bank
{
    public float getrateofinterset()
    {
        return 0.08f;
    }
}
class ICICI extends Bank
{
    public float getrateofinterset()
    {
        return 0.07f;
    }
}
class AXIS extends Bank
{
    public float getrateofinterset()
    {
        return 0.09f;
    }
}
