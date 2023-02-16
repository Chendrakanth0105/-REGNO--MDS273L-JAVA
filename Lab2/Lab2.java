package Lab2;

import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        //Intialise arrays
        String names[] = new String[1024];
        String newnames[] = new String[1024];
        //Declare variables
        String n, searchname, removename;
        char choice;
        int c;
        //input variable
        Scanner scan = new Scanner(System.in);
        int searchcounter = 0;
        int delcounter = 0;
        int counter = 0;

        do {
            //Display the options
            System.out.println("What do you want to perform: ");
            System.out.println("1. Enter Name");
            System.out.println("2. Search a Name");
            System.out.println("3. Delete a Name");
            System.out.println("4. Print all Names");
            c = Integer.parseInt(scan.nextLine());
            // System.out.println(names.length);
            switch (c) {
                case 1:// Adding name
                    System.out.println("Enter a name: ");
                    n = scan.nextLine();
                    //Counter is used to store how many names are entered and display only those names instead of empty spaces
                    for (int i = 0; i <= counter; i++) {
                        if (counter == 0) {
                            names[i] = n;
                            counter += 1;
                            break;
                        } 
                        //If the name is already existing then dont store the name.
                        else if (names[i].equalsIgnoreCase(n)) {
                            System.out.println("The name already exist. Please enter unique name!");

                        } 
                        //If the name doesnt exist then you need to add the name to the array
                        else {
                            names[counter] = n;
                            counter += 1;
                            break;
                        }

                    }

                    break;

                case 2://Search for a name
                    System.out.println("Enter a name you want to search:");
                    searchname = scan.nextLine();
                    //check for the name by iteration the specified name with each name of the array
                    //IF the name is found then increment the searchcounter variable
                    for (int i = 0; i < counter; i++) {
                        searchcounter = 0;
                        if (names[i].equalsIgnoreCase(searchname)) {
                            searchcounter += 1;
                            break;
                        }
                    }
                    //If the search counter is 1 then display a message as found.
                    if (searchcounter == 1) {
                        System.out.println("The name is in the list.");
                    }
                    //If the search counter is 0 then display the message as not found
                    if (searchcounter == 0) {
                        System.out.println("The name is not in the list.");
                    }
                    break;

                case 3://Removing a name
                    System.out.println("Enter a name you want to remove: ");
                    removename = scan.nextLine();
                    //Iterate through the loop and if the name is found then remove the name 
                    //by adding all the names to a new array by excluding the matched name.
                    for (int i = 0, j = 0; i < counter; i++) {
                        if (!names[i].equalsIgnoreCase(removename)) {
                            newnames[j] = names[i];//
                            delcounter += 1;// delete counter is used to keep count of the deleted number of names
                            j++;
                        }
                    }
                    break;

                case 4://Printing all the names
                    System.out.println("Printing all names in the list.");
                    for (int i = 0; i < counter; i++) {
                        System.out.print(names[i] + " ");
                    }
                    //Print all the names after deletion.
                    System.out.println(" ");
                    System.out.println("Printing the names after deletion:");
                    for (int i = 0; i < delcounter; i++) {
                        System.out.print(newnames[i] + " ");
                    }
                    break;

            }
            System.out.println(" ");
            // Ask the user for his choice of continuing the operation
            System.out.println("Do you want to contiue, press y for yes!");
            choice = scan.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');// if Y or y is entered, then the loop conitnues.
    }
}
