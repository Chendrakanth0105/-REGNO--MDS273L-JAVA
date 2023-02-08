package Lab2;

import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        String names[] = new String[1024];
        String newnames[] = new String[1024];
        String n, searchname, removename;
        char choice;
        int c;
        Scanner scan = new Scanner(System.in);
        int searchcounter = 0;
        int delcounter = 0;
        int counter = 0;

        do {
            System.out.println("What do you want to perform: ");
            System.out.println("1. Enter Name");
            System.out.println("2. Search a Name");
            System.out.println("3. Delete a Name");
            System.out.println("4. Print all Names");
            c = Integer.parseInt(scan.nextLine());
            // System.out.println(names.length);
            switch (c) {
                case 1:
                    System.out.println("Enter a name: ");
                    n = scan.nextLine();
                    for (int i = 0; i <= counter; i++) {
                        if (counter == 0) {
                            names[i] = n;
                            counter += 1;
                            break;
                        } 
                        else if (names[i].equalsIgnoreCase(n)) {
                            System.out.println("The name already exist. Please enter unique name!");

                        } else {
                            names[counter] = n;
                            counter += 1;
                            break;
                        }

                    }

                    break;

                case 2:
                    System.out.println("Enter a name you want to search:");
                    searchname = scan.nextLine();
                    for (int i = 0; i < counter; i++) {
                        searchcounter = 0;
                        if (names[i].equalsIgnoreCase(searchname)) {
                            searchcounter += 1;
                            break;
                        }
                    }
                    if (searchcounter == 1) {
                        System.out.println("The name is in the list.");
                    }
                    if (searchcounter == 0) {
                        System.out.println("The name is not in the list.");
                    }
                    break;

                case 3:
                    System.out.println("Enter a name you want to remove: ");
                    removename = scan.nextLine();
                    for (int i = 0, j = 0; i < counter; i++) {
                        if (!names[i].equalsIgnoreCase(removename)) {
                            newnames[j] = names[i];
                            delcounter += 1;
                            j++;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Printing all names in the list.");
                    for (int i = 0; i < counter; i++) {
                        System.out.print(names[i] + " ");
                    }
                    System.out.println(" ");
                    System.out.println("Printing the names after deletion:");
                    for (int i = 0; i < delcounter; i++) {
                        System.out.print(newnames[i] + " ");
                    }
                    break;

            }
            System.out.println(" ");
            System.out.println("Do you want to contiue, press y for yes!");
            choice = scan.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
