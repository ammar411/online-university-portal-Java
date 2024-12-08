/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testuni;


/**
 *
 * @author ammar
 */
class Person implements Award {
    
    private String Name;

    public Person()
    {
        
    }
    
    public Person(String N)
    {
        this.Name=N;
    }
    
    public void Getdata()
    {
        System.out.printf("%s",this.getName());   
    }

    public void Setdata()
    {
        this.setName("Uzair");   
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
  
    public boolean isoutstanding()
    {
        return false; 
       }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + '}';
    }

    
    
    
}