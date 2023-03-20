QUESTION:<br>
---------<br>
Create a student class, that will store the details of the Student<br>
Reg. No.<br>
Name<br>
Email<br>
Phone<br>
Class<br>
Department<br>
The class will have a constructor to initialize the values of the Student and a method to print the Details of the Student.<br>
In the main-method class, create an array of Student Class to hold maximum details of 100 Students.<br>
In the menu-driven program, the menu options will have<br>
Add a student<br>
Adds the details of 1 student to the array of Student<br>
Search for a student<br>
Search for the details of a student from the array of Student<br>
(Optional) Searching can be done with Name & Register Number <br>
Display all students<br>
Displays the details of all students<br>


SOLUTION<br>
--------<br>
- First Create a Student Class and Declare the variables "Name", "RegNo", "Class", "Department", "Email", "Phonenumber". <br>
- Create a parameterised constructor for the Student class with the parameters "Name", "RegNo", "Class", "Department", "Email", "Phonenumber". <br>
- Assign the parameter values to the declared variables using "this" keyword. <br>
- Create a "print" method which will print the details of the student i.e., ("Name", "RegNo", "Class", "Department", "Email", "Phonenumber") <br>
<br>
<br>
<br>
- Now create a main class, and create a scanner class object to take inputs.<br>
- Create a integer variable counter and intialise it to zero. This counter variable is used to keep count of the number of inputs in the array.<br>
- Inside the main method, Create a Student class array of length 100.<br>
- Declare a character variable choice and intialise to 'n'<br>
- Create a Do while loop which will perform till the users choice wants to exit.<br>
- Inside the do while loop do the following<br>
    1. Print the options for the user (add/search/display)<br>
    2. If user chooses the option as 1, then call addStudent() method and pass a parameter Student class array.<br>
    3. If user chooses the option as 2, then call searchStudent() method and pass a parameter Student class array.<br>
    4. If user chooses the option as 3, then call displayStudent() method and pass a parameter Student class array.<br>
- Create a method as addStudent with a Student class array as the parameter<br>
    - In this method take all the inputs for the student details.<br>
    - Now store all the inputs in the students class array and increase the counter variable by 1.<br>
- Create a method as searchStudent with a Student class array as the parameter<br>
    - In this method you will provide the user with two options to search for the required student<br>
        1. Using Name<br>
        2. Using Registration Number.<br>
    - Take the input from the user for choosing the option and save it in opt variable.<br>
    - If he choose "1" , Ask the student name he wants to search and then start a loop to iterate through the array object and inside the loop give a condition to check the entered name and the name in the array object. If they are equal then print the details of the student and print a message as student found. If you dint find the required student then print a message as not found.<br>
    - If he choose "2", Ask the register number then start a loop to iterate through the array object and inside the loop give a condition to check the entered registered number and the registered number in the array object. If they are equal then print the details of the student and print a message as student found. If you dint find the required student then print a message as not found.<br>
- Create a method as displayStudent with a Student class array as the parameter<br>
    - Print all the students details by iterating through the array.<br>
<br>
<br>
OUTPUT:<br>
------ <br>

<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
1<br>
ADDING A STUDENT:<br>
Name: <br>
Chendra kanth<br>
Email: <br>
peddapuramkanth@gmail.com<br>
Registration Number: <br>
22122138<br>
Class: <br>
MSCDS B<br>
Department:<br> 
Data Science<br>
Phone Number: <br>
6301471234<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
2<br>
How Do you want to search for a student:<br>
1. Name<br>
2. Registration Number<br>
1<br>
Enter the name of the student you want to search<br>
Vaishnavi priya<br>
The student with the details provided is not found!!<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
1<br>
ADDING A STUDENT:<br>
Name: <br>
Vaishnavi Priya<br>
Email: <br>
vvpriaya33@gmail.com<br>
Registration Number: <br>
22122180 <br>
Class: <br>
MSCEA<br>
Department: <br>
Data Science<br>
Phone Number: <br>
123630163<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
2<br>
How Do you want to search for a student:<br>
1. Name<br>
2. Registration Number<br>
2<br>
Enter the registration number of the student you want to search<br>
22122170<br>
The student with the details provided is not found!!<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
1<br>
ADDING A STUDENT:<br>
Name: <br>
Keshav<br>
Email: <br>
keshavreddy010@gmail.com<br>
Registration Number: <br>
22122170<br>
Class: <br>
BBA <br>
Department: <br>
BBA<br>
Phone Number: <br>
9550123456<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
2<br>
How Do you want to search for a student:<br>
1. Name<br>
2. Registration Number<br>
1<br>
Enter the name of the student you want to search<br>
keshav<br>
----------------------------------------<br>
Name: Keshav<br>
Registration Number: 22122170<br>
Email: keshavreddy010@gmail.com<br>
Class: BBA <br>
Department: BBA<br>
Phone Number: 9550123456<br>
These are the requested student details!!!!!!<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
2<br>
How Do you want to search for a student:<br>
1. Name<br>
2. Registration Number<br>
2<br>
Enter the registration number of the student you want to search<br>
22122180<br>
----------------------------------------<br>
Name: Vaishnavi Priya<br>
Registration Number: 22122180<br>
Email: vvpriaya33@gmail.com<br>
Class: MSCEA<br>
Department: Data Science<br>
Phone Number: 123630163<br>
These are the requested student details!!!!!!<br>
Do You Want to Exit??<br>
n<br>
MENU<br>
1. Add Student<br>
2. Search For a Student<br>
3. Display The Details Of a Student<br>
3<br>
************STUDENT DETAILS************<br>
----------------------------------------<br>
Name: Chendra kanth<br>
Registration Number: 22122138<br>
Email: peddapuramkanth@gmail.com<br>
Class: MSCDS B<br>
Department: Data Science<br>
Phone Number: 6301471234<br>
----------------------------------------<br>
Name: Vaishnavi Priya<br>
Registration Number: 22122180<br>
Email: vvpriaya33@gmail.com<br>
Class: MSCEA<br>
Department: Data Science<br>
Phone Number: 123630163<br>
----------------------------------------<br>
Name: Keshav<br>
Registration Number: 22122170<br>
Email: keshavreddy010@gmail.com<br>
Class: BBA <br>
Department: BBA<br>
Phone Number: 9550123456<br>
Do You Want to Exit??<br>
y<br>
<br>
<br>
<br>
FLOWCHART:
<br>

![Flow Chart](./images/flowchart.png)