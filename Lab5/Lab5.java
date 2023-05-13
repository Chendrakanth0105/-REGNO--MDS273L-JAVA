package Lab5;
import java.util.*;
public class Lab5 {
    static Scanner scan = new Scanner(System.in);
    static int counter = 0;

    public static void main(String[] args) {
        Student studentarr[] = new Student[100];
        char choice = 'n';

        do {
            System.out.println("MENU");
            System.out.println("1. Add Student");
            System.out.println("2. Search For a Student");
            System.out.println("3. Display The Details Of a Student");

            int option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1:
                    addStudent(studentarr);
                    break;
                case 2:
                    searchStudent(studentarr);
                    break;
                case 3:
                    displayStudent(studentarr);
                    break;
                default:
                    System.out.println("Sorry Invalid Operation!!!!!!!!!");
            }
            System.out.println("Do You Want to Exit??");
            choice = scan.nextLine().charAt(0);
        } while (choice == 'n' || choice == 'N');

    }

    public static int addStudent(Student studentarr[]) {
        System.out.println("ADDING A STUDENT:");
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Email: ");
        String email = scan.nextLine();
        System.out.println("Registration Number: ");
        int regno = Integer.parseInt(scan.nextLine());
        System.out.println("Class: ");
        String Class = scan.nextLine();
        System.out.println("Department: ");
        String dept = scan.nextLine();
        System.out.println("Phone Number: ");
        long phno = Long.parseLong(scan.nextLine());
        studentarr[counter] = new Student(name, email, Class, dept, regno, phno);
        counter++;
        return counter;
    }

    public static void searchStudent(Student studentarr[]) {
        int searchcounter = 0;
        System.out.println("How Do you want to search for a student:");
        System.out.println("1. Name");
        System.out.println("2. Registration Number");
        int opt = Integer.parseInt(scan.nextLine());
        if (opt == 1) {
            System.out.println("Enter the name of the student you want to search");
            String sname = scan.nextLine();
            for (int i = 0; i < counter; i++) {
                if (sname.equalsIgnoreCase(studentarr[i].Name)) {
                    searchcounter = 1;
                    studentarr[i].print();
                }
            }
        } else if (opt == 2) {
            System.out.println("Enter the registration number of the student you want to search");
            int sreg = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < counter; i++) {
                int R = studentarr[i].RegNo;
                if (sreg == R) {
                    searchcounter = 1;
                    studentarr[i].print();
                }
            }
        }
        if (searchcounter == 0) {
            System.out.println("The student with the details provided is not found!!");
        }
        if (searchcounter == 1) {
            System.err.println("These are the requested student details!!!!!!");
        }
    }

    public static void displayStudent(Student studentarr[]) {
        System.out.println("************STUDENT DETAILS************");
        for (int i = 0; i < counter; i++) {
            studentarr[i].print();
        }
    }

}

class Student {
    String Name, Email, Class, Department;
    int RegNo;
    long Phonenumber;

    Student(String Name, String Email, String Class, String Department, int RegNo, long Phonenumber) {
        this.Name = Name;
        this.Email = Email;
        this.Class = Class;
        this.Department = Department;
        this.RegNo = RegNo;
        this.Phonenumber = Phonenumber;
    }

    public void print() {
        System.out.println("----------------------------------------");
        System.out.println("Name: " + Name);
        System.out.println("Registration Number: " + RegNo);
        System.out.println("Email: " + Email);
        System.out.println("Class: " + Class);
        System.out.println("Department: " + Department);
        System.out.println("Phone Number: " + Phonenumber);
        
    }

}