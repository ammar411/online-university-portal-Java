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
public class Student extends Person {
    
    private double GPA;

    public Student() {
    }

    public Student(String N , double GPA) {
        super(N);
                this.GPA=GPA;
    }
    
    
    
    @Override
    public void Getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        super.setName(sc.next());
        System.out.println("Enter Your GPA : :");
        GPA=sc.nextDouble();
    }
    
    @Override
    public void Setdata()
    {System.out.printf("Name :%s \nGPA :%f",super.getName(),this.GPA);
        
    }
    @Override
    public boolean isoutstanding()
    {
        return GPA>3.5;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s \nGPA :",super.toString(),this.GPA);
    }
    
   
    
}
