package Lab1;
import java.util.Scanner;

public class Lab1{
    public static void main(String args[]){
        String Name,Class,Email,College,State,Region="Default";
        int Regno,Age;
        char Section, Gender;
        boolean Marriage;
        Float Fees;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        Name = scan.nextLine();
        System.out.println("Enter your Age");
        Age = Integer.parseInt(scan.nextLine());
        System.out.println("Enter your State:");
        State = scan.nextLine();
        System.out.println("Enter your Gender");
        Gender = scan.nextLine().charAt(0);
        System.out.println("Enter your Email:");
        Email = scan.nextLine();
        System.out.println("Enter your College Name");
        College = scan.nextLine();
        System.out.println("Enter your College fees");
        Fees = Float.parseFloat(scan.nextLine());
        System.out.println("Enter your class:");
        Class = scan.nextLine();
        System.out.println("Enter your Section");
        Section = scan.nextLine().charAt(0);
        System.out.println("Enter your Registration number:");
        Regno = Integer.parseInt(scan.nextLine());
        
        System.out.println("**********************************************************************");

        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Gender: "+Gender);
        System.out.println("Email: "+Email);
        System.out.println("State: "+State);
        System.out.println("College: "+College);
        System.out.println("Fees: "+Fees);
        System.out.println("Class: "+Class);
        System.out.println("Section: "+Section);
        System.out.println("Regno: "+Regno);
        


        System.out.println("**********************************************************************");   


        System.out.println("CHECK FOR YOUR GENDER");

        if(Gender == 'M'){
            System.out.println("MALE");
        }
        else if (Gender == 'F'){
            System.out.println("FEMALE");
        }
        else{
            System.out.println("INVALID GENDER");
        }
         

        switch(State){
            case "JammuKashmir", "Himachal Pradesh", "Punjab", "Uttarakhand" ,"Uttar Pradesh", "Haryana":    
             Region = "Northern" ;   
             break;    
            case "Andhra Pradesh", "Karnataka", "Kerala", "Tamil Nadu", "Telangana":    
             Region = "Southern"; 
             break;  
            case "Bihar", "Orissa", "Jharkhand", "West Bengal": 
             Region = "Eastern";
             break;
            case "Rajasthan", "Gujarat", "Goa" , "Maharashtra":
             Region = "Werstern";
             break;
            case "Madhya Pradesh", "Chhattisgarh":
             Region = "Central";
             break;
            case "Assam", "Sikkim", "Nagaland", "Meghalaya", "Manipur", "Mizoram", "Tripura" ,"Arunachal Pradesh":
             Region = "NORTH EAST";
             break;
            default:
             System.out.println("INVALID STATE");      
            }
        System.out.println("The Student is from the "+Region+" state of India");
    }
}

