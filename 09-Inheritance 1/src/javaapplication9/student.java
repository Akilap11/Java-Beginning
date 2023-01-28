package javaapplication9;

public class student {
    private int adno;
    private String name;
    
    public void setdata(int a,String b){
        adno=a;
        name=b;
    }
    public void displaydata(){
        System.out.println("Adno is "+adno+" and name is "+name);
    }
    
}
