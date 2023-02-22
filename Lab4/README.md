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
3. Create the deposit function as:
    - The deposit function should take amount, transaction_details, timestamp, count and values as parameters
    - amount is the integer variable which holds the amount which user wants to deposit.
2. Initialize the customer using the initcustomer method which will ask for the input for the global variables.<br>
3. Perform a do while loop to perform the operation till the user's choice of quit.<br>
4. Create a timestamp variable of Timestamp class to keep a note of the transaction time for each transaction.<br>
5. Now Display the 4 options Deposit, Withdraw, Print Transactions and Account summary.<br>
6. Use a switch case to perform cases.<br>
7. Now if user chooses 1 then ask for the amount he want to deposit and call the deposit function and store it in value string
