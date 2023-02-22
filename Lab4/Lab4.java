package Lab4;

import java.sql.Timestamp;
import java.util.*;

public class Lab4 {

    // Initalizing global variables.
    static int AccountNumber;
    static String AccountHolderName;
    static double AccountBalance;
    static Scanner scan = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        //Intialize the variables
        char choice;
        int opt, amount;
        int count = 0;   //TO keep count of the transactions.
        String values="";
        String[] arr;
        String transaction_details[] = new String[20];
        System.out.println("");
        System.out.println("BANKING");
        System.out.println("*******");
        System.out.println("Initialize the customer");
        
        //Intialize the customer.
        initCustomer();
        
        //Loop to run till the user enters option other than 'y'
        do {
            //Declare timestamp to record the transaction time.
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            // Display Menu Options
            System.out.println("");
            System.out.println("Menu Options");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Transactions");
            System.out.println("4. Account summary");
            System.out.println("");

            // Take the input for choosing the option
            System.out.println("Please enter your option: ");
            opt = Integer.parseInt(scan.nextLine());

            // Switch case for each option
            switch (opt) {
                case 1:
                //Deposit
                    System.out.println("Enter the amount you want to deposit.");

                    //Ask the amount that user want to deposit.
                    amount = Integer.parseInt(scan.nextLine());
                    //Call the deposit function and store the value of 
                    values = deposit(amount,transaction_details,timestamp,count,values);
                    arr = values.split("\\+");
                    AccountBalance = Double.parseDouble(arr[0]);
                    count ++;
                    transaction_details[count] = arr[1];
                    break;

                case 2:
                    System.out.println("Enter the amount you want to withdraw.");
                    amount = Integer.parseInt(scan.nextLine());
                    values = withdraw(amount,transaction_details,timestamp,count,values);
                    arr = values.split("\\+");
                    AccountBalance = Double.parseDouble(arr[0]);
                    count++;
                    transaction_details[count] = arr[1];
                    break;

                case 3:
                    transactions(transaction_details,count);
                    break;

                case 4:
                    accountSummary();
                    break;

                default:
                    System.out.println("You have choosen the wrong option.");
            }
            System.out.println("");
            System.out.println("Do you want to continue, 'y' or 'n' ");
            choice = scan.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');// if Y or y is entered, then the loop conitnues
    }

    static void initCustomer() {
        //User inputs to initialize the customer
        System.out.println("Enter the Account number: ");
        AccountNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the Account holder name: ");
        AccountHolderName = scan.nextLine();
        System.out.println("Enter the Account balance: ");
        AccountBalance = Double.parseDouble(scan.nextLine());
        System.out.println("You have successfully initialized the customer.");
    }

    static String deposit(int amount, String transaction_details[], Timestamp timestamp,int count, String values) {
        System.out.println("DEPOSIT");
        System.out.println("*******");

        //Add the amount to the total balance.
        AccountBalance = AccountBalance + amount;
        //Store the timestamp details for the transaction in details.
        transaction_details[count] = timestamp+" "+ String.valueOf(amount)+" Deposited, Available balance is "+AccountBalance;
        System.out.println("You have successfully deposited the amount");
        
        //Store the Account balance and the timestamp in values as String to return the account balance and timestamp.
        //After Returning you can separate the timestamp and the Accountbalance using Split() function.
        values = String.valueOf(AccountBalance)+"+"+transaction_details;
        return values;
    }

    static String withdraw(int amount, String transaction_details[],Timestamp timestamp,int count,String values) {
        System.out.println("Withdraw");
        System.out.println("********");

        // Check if the requested withdrawl amount is greater than account balance.
        if(amount>AccountBalance){
            System.out.println("Insufficient funds.");
        }else{
            //Deduct the withdrawn amount and update the account balance.
            AccountBalance = AccountBalance-amount;

            transaction_details[count] = timestamp.toString()+" "+ String.valueOf(amount)+" Withdraw, Available balance is "+AccountBalance;
            System.out.println("Your Withdrawl is successfull.");

            //Store the Account balance and the timestamp in values as String to return the account balance and timestamp.
            //After Returning you can separate the timestamp and the Accountbalance using Split() function.
            values = String.valueOf(AccountBalance)+"+"+transaction_details;
        }
        return values;
    }

    static void transactions(String transaction_details[],int count) {
        System.out.println("Transactions");
        System.out.println("************");
        //Print the transaction transaction_details stored in details array
        for(int i = 0; i<count; i++){
            System.out.println(transaction_details[i]);
        }
        System.out.println("End of the Transactions.");
    }

    static void accountSummary() {
        //Print the account summary
        System.out.println("Account Summary");
        System.out.println("***************");
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Account Holder Name: "+AccountHolderName);
        System.out.println("Account Balance: "+AccountBalance);
    }

}
