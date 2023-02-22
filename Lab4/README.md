QUESTION<br>
Write a JAVA Menu driven program that does the following:<br>
You can ONLY have the below variables as global variables<br>
Account Number<br>
Account Holder Name<br>
Account Balance<br>
You MUST have the below as functions<br>
To initialize the customer<br>
To deposit money<br>
To withdraw money<br>
To print the transactions<br>
To print account summary<br>
Your menu will have the following operations once the customer is created<br>
To deposit money<br>
To withdraw money<br>
To print the transactions<br>
To print account summary<br>
<br>
<br>
Algorithm:
1. Create the global variable Account number, Account holder name, Account balance.<br>
2. Create the initcustomer method which will take the inputs for all the global variables.<br>
3. Initialize the following variables:is the integer variable which holds the amount which user wants to deposit.<br>
    - amount (is the integer variable which holds the amount which user wants to deposit)<br>
    - opt (is the integer variable which holds the user option for choosing the menu options)<br>
    - choice (is the char variable which will store the user input of continuing the task)<br>
    - transaction_details (is the String array which stores the transaction details which includes timestamp)<br>
    - Initialize count as 0 (It is the integer variable which will keep a count on the transaction and to store the transaction details in the transaction_details array)<br>
    - values (is the String which is used to store the returned value by the functions)<br>
    - arr (is the string array which will split the values string and stores in it.)<br>
4. Create the deposit function as:<br>
    - The deposit function should take amount, transaction_details, timestamp, count and values as parameters<br>
    - Add the amount to the Account balance and store the transaction details in the transaction_details array.<br>
    - Convert the Accountbalance to string and concat it with the transaction_details and store it in the values array.<br>
    - return the values array.<br>
5. Create the withdraw function as:<br>
    - The withdraw function should take amount, transaction_details, timestamp, count and values as parameters<br>
    - Check if the amount is greater than the Account balance.<br>
    - If it is greater then print a message as insufficient funds.<br>
    - Else subract the amount from the Account balance and store the transaction details in the transaction_details array.<br>
    - Convert the Accountbalance to string and concat it with the transaction_details and store it in the values array.<br>
    - return the values array.<br>
6. Create the transactions function as:<br>
    - Use a for loop to print the transaction_details array.<br>
7. Create the accountSummary function as:<br>
    - It will print the details of the customer that includes the Account number, Account holder name, Account balance.<br>
8. Create the main method as:
    - Initialize the customer using the initcustomer method which will ask for the input for the global variables.<br>
    - Perform a do while loop to perform the operation till the user's choice of quit.<br>
    - Create a timestamp variable of Timestamp class to keep a note of the transaction time for each transaction.<br>
    - Now Display the 4 options Deposit, Withdraw, Print Transactions and Account summary.<br>
    - Use a switch case to perform cases.<br>
    - Now if user choose 1 then:<br>
        - Ask for the amount to deposit and store it the amount variable.<br>
        - Call the deposit function by passing the amount, transaction_details, timestamp, count, values as parameters and assign it to values<br>
        - Now split the values variable using the '+' as seperator and assing it to the arr array.<br>
        - Assign the Account balance as the arr array of '0' position.<br>
        - Assign the transaction_details of the count position as the arr array of the '1'st position.<br>
        - increase the count by 1.<br>
    - If user choose 2 then:<br>
        - Ask for the amount to Withdraw and store it the amount variable.<br>
        - Call the withdraw function by passing the amount, transaction_details, timestamp, count, values as parameters and assign it to values<br>
        - Now split the values variable using the '+' as seperator and assing it to the arr array.<br>
        - Assign the Account balance as the arr array of '0' position.<br>
        - Assign the transaction_details of the count position as the arr array of the '1'st position.<br>
        - increase the count by 1.<br>
    - If user choose 3 then:<br>
        - Call the transactions function.<br>
    - If user choose 4 then:<br>
        - Call the accountSummary function.<br>
    - If user enters any other number then:<br>
        - Display a message that the entered option is wrong.<br>
    - Ask the user whether his wish to continue or exit:<br>
        - If he enters 'y' or 'Y' then continue the loop.<br>
        - If he enters any other letter then end the loop.<br>

<br>
<br>
SAMPLE OUTPUT:<br>

BANKING<br>
*******<br>
Initialize the customer<br>
Enter the Account number: <br>
123456789<br>
Enter the Account holder name: <br>
Chendra Kanth<br>
Enter the Account balance: <br>
100000<br>
You have successfully initialized the customer.<br>
<br>
Menu Options<br>
1. Deposit Money<br>
2. Withdraw Money<br>
3. Transactions<br>
4. Account summary<br>
<br>
Please enter your option: <br>
1<br>
Enter the amount you want to deposit.<br>
100000<br>
DEPOSIT<br>
*******<br>
You have successfully deposited the amount<br>
<br>
Do you want to continue, 'y' or 'n' <br>
y<br>
<br>
Menu Options<br>
1. Deposit Money<br>
2. Withdraw Money<br>
3. Transactions<br>
4. Account summary<br>
<br>
Please enter your option: <br>
1<br>
Enter the amount you want to deposit.<br>
10000<br>
DEPOSIT<br>
*******<br>
You have successfully deposited the amount<br>
<br>
Do you want to continue, 'y' or 'n' <br>
y<br>

Menu Options<br>
1. Deposit Money<br>
2. Withdraw Money<br>
3. Transactions<br>
4. Account summary<br>
<br>
Please enter your option: <br>
2<br>
Enter the amount you want to withdraw.<br>
50000<br>
Withdraw<br>
********<br>
Your Withdrawl is successfull.<br>
<br>
Do you want to continue, 'y' or 'n' <br>
y<br>
<br>
Menu Options<br>
1. Deposit Money<br>
2. Withdraw Money<br>
3. Transactions<br>
4. Account summary<br>
<br>
Please enter your option: <br>
2<br>
Enter the amount you want to withdraw.<br>
170000<br>
Withdraw<br>
********<br>
Insufficient funds.<br>
<br>
Do you want to continue, 'y' or 'n' <br>
y<br>
<br>
Menu Options<br>
1. Deposit Money<br>
2. Withdraw Money<br>
3. Transactions<br>
4. Account summary<br>
<br>
Please enter your option: <br>
3<br>
Transactions<br>
************<br>
2023-02-22 17:29:34.615 100000 Deposited, Available balance is 200000.0<br>
2023-02-22 17:29:45.557 10000 Deposited, Available balance is 210000.0<br>
2023-02-22 17:29:58.759 50000 Withdraw, Available balance is 160000.0<br>
[Ljava.lang.String;@7ea987ac<br>
End of the Transactions.<br>
<br>
Do you want to continue, 'y' or 'n' <br>
y<br>
<br>
Menu Options<br>
1. Deposit Money<br>
2. Withdraw Money<br>
3. Transactions<br>
4. Account summary<br>
<br>
Please enter your option: <br>
4<br>
Account Summary<br>
***************<br>
Account Number: 123456789<br>
Account Holder Name: Chendra Kanth<br>
Account Balance: 160000.0<br>
<br>
Do you want to continue, 'y' or 'n' <br>
n<br>

<br>
FLOW CHART:
<br>

![Flow Chart](./images/flowchart.png)