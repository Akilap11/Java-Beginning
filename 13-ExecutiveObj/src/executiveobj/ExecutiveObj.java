package executiveobj;
//declare everything here or seperate. better seperate.but whatever(sir)
interface paybonus //default public
{
    void calcincentive();
}
class employee { //cant create abstract methods 
    private int employeeid; //if not private.it means package
    private String employeename;
    private String address;
    private String dob;
    int salary;
    
    public employee(int employeeid,String employeename,String address,String dob,int salary)
    {
        this.employeeid=employeeid;
        this.employeename=employeename;
        this.address=address;
        this.dob=dob;
        this.salary=salary;    
    }
    public void displayinfo()
    {
        System.out.println("Employee ID:"+employeeid+" Employee name:"+employeename+" Address:"+address+" DOB:"+dob+" Salary:"+salary);
    }
    public void salarydet()
    {
        System.out.println("Salary:"+salary);
    } 
}
 class executive extends employee implements paybonus{
    private int travelallowance;
    public executive(int employeeid, String employeename, String address, String dob, int salary,int travelallowance) {
        super(employeeid, employeename, address, dob, salary);
        this.travelallowance=travelallowance;
    }
    @Override
    public void calcincentive() 
    {   
        if(salary<5000)
            System.out.println("No intcentive is paid");
        else
            System.out.println("Incentive amount is:"+salary*0.1);
    
    }
    public void displaysalary()
    {
        System.out.println("travelallowance:"+travelallowance);
    }   
    }
public class ExecutiveObj {

    public static void main(String[] args) {
        executive a=new executive(1,"indika Peiris","ABC","2000-1-1",20000,2000);
        a.displaysalary();
        a.calcincentive();
        a.salarydet();
        a.displayinfo();

    }    
}
