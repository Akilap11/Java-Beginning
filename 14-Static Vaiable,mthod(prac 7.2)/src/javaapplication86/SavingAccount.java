package javaapplication86;
public class SavingAccount {
    
    static float annualInterestRate=0.1f; 
    
    private float savingBalance;
    
    public SavingAccount(float m)
    {
        savingBalance=m;
    }
    
    public void calculateMonthlyInterest()
    {
        float mi;
        mi=(savingBalance*annualInterestRate)/12;
        savingBalance=savingBalance+mi;
        System.out.println("New Savings Balance is: "+savingBalance);
    }
    static void modifyInterestRate(float n)
    {
        annualInterestRate=n;
    }
}
