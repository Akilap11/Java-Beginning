package javaapplication86;
public class JavaApplication86 {

    public static void main(String[] args) {
        SavingAccount saver1=new SavingAccount(2000);
        SavingAccount saver2=new SavingAccount(3000);
        
        SavingAccount.modifyInterestRate(0.04f);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        SavingAccount.modifyInterestRate(0.05f);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
    }   
}
