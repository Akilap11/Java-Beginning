/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author akila
 */
//extends student means inherit student
//extends keyword
public class marks extends student{
    private int mid;
    private int m1,m2;
    
    public void setvalues(int mid,int m1,int m2){//if i use c,d,e different name,no need for this
        this.mid=mid;
        this.m1=m1;
        this.m2=m2;            
    }
    public void displayavg(){
        float avg=(m1+m2)/2;
        System.out.println("average is "+avg);
    }
    public void displaydet(){
        System.out.println("MID: "+mid+" M1: "+m1+" M2: "+m2);
    }    
}
