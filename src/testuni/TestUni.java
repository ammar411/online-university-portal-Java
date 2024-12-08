/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testuni;
import java.util.Scanner;
/**
 *
 * @author ammar
 */
public class TestUni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[5]; 

        for (int i = 0; i < 5; i++) {
            if (Math.random() < 0.5) { 
                System.out.println("Enter student name:");
                String name = scanner.nextLine();
                System.out.println("Enter student GPA:");
                double gpa = scanner.nextDouble();
                scanner.nextLine(); 
                persons[i] = new Student(name,gpa);
            }
            
            else
            
            {
                System.out.println("Enter professor name:");
                String name = scanner.nextLine();
                System.out.println("Enter number of publications:");
                int pubs = scanner.nextInt();
                scanner.nextLine(); 
                persons[i] = new Professor(name, pubs);
            }
        }

        System.out.println("Outstanding persons:");

        for (Person person : persons) {
            if (person.isoutstanding()) {
                System.out.println(person);
            }
        }
    }
    
}
