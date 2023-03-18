QUESTION:
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
    3. 
