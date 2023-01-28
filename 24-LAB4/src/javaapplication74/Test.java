/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

/**
 *
 * @author akila
 */
public class Test  {



    public static void main(String[] args)

    {

        SE s=new SE();

        s.setName("Kamal");

        s.setId(777);

        s.setDevelopmentTask("Develop Login module");

       

        QA q = new QA();

        q.setName("Nimal");

        q.setId(111);

        q.setTestTask("Test Login module");

       

        System.out.println("Software Engineer Details : "+s.getName()+" "+s.getId()+" "+s.getDevelopmentTask()+"");

        System.out.println("Quality Engineer Details : "+q.getName()+" "+q.getId()+" "+q.getTestTask()+"");   

       

    }  

}
