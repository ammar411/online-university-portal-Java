/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testuni;
import java.util.Scanner;
/**
 *
 * @author ammar
 */
public class Professor extends Person{
    
    private int numPubs;
    
    public Professor(String N,int numpubs)
    {
        super(N);
        this.numPubs=numpubs;
    }
    
   @Override
   public void Getdata()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your Name :");
       super.setName(sc.next());
       
        System.out.println("Enter Your Total Publicatin done :");
        numPubs=sc.nextInt();
   }
    
   @Override
   public void Setdata()
   {
       System.out.printf("%s \n%d",super.toString(),this.numPubs);   
   }
   
   @Override
   public boolean isoutstanding()
   {
       return numPubs>20;
   }

    @Override
    public String toString() {
        return String.format("%s \n%d", super.toString(),this.numPubs);
    }
   
   
}
