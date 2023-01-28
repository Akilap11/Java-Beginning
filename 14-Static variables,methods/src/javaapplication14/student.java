package javaapplication14;
public class student {
    private int adno;
    private String fname;
    //Static Variablesssssssssssssssssssssssssssssssssss
    private static String uni="NSBM";
    public void setdata(int adno,String fname)
    {
        this.adno=adno;
        this.fname=fname;
    }
    public void display()
    {
        System.out.println("Adno:"+adno+" First name:"+fname);
        System.out.println("University Name:"+uni);
    }
        
}
