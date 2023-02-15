QUESTION:
Create a java program that performs the following operation:<br>
The program should collect an integer array from the user<br>
After the array is entered, you need to create a menu of items<br>
Find the Mean Value<br>
Find the Median Value<br>
Find the Mode Value <br>
From the user-given array.<br>
The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.<br>

ANSWER:<br>

1. Ask the User to enter the length of the integer array he want to create.<br>
2. Create an array of the user entered length.<br>
3. Take inputs from the user to fill the integer array.<br>
4. Display the 3 operation Mean, Median, Mode.<br>
5. Ask User to enter his choice from the above three operations.<br> 
6. If the user chooses mean, then call the meanvalue function which calculates mean of the integer array using the formula of 
   (sum of observations) / (total number of observations)<br>
7. If the user chooses median, then call the medianvalue function which will operate as follows:<br>
   1. It will sort the array
   2. Checks the length of the array
   3. If the value is odd then the middle value is the median and if the length of the array is even then the median is the average of the two middle values.
8. If the user chooses mode, then call the modevalue function which will operate as follows:
   1. Intialise maxcount and maxvalue to zero
   2. Now run a loop where each element will be checked with every element of the array,
   3. which element is repeated for more number of times will be assigned to the maxvalue and the particular count will be assigned to the max count.
   4. Now after the execution of loops the final maxvalue will be the median value.
9. Now the program ends.

TO EXECUTE:
Open Terminal/Command prompt and enter the following commands.<br>
1. javac Lab3.java
2. java Lab3

OUTPUT:
1. Execution of Mean option:

WELCOME!!!!!!!!<br>
***************<br>
Enter the size of your integer array: <br>
5<br>
Enter 1 value:<br>
10<br>
Enter 2 value:<br>
20<br>
Enter 3 value:<br>
40<br>
Enter 4 value:<br>
50<br>
Enter 5 value:<br>
70<br>
*****************************************<br>

Your Integer Array is :<br>
10 20 40 50 70 <br>
*****************************************<br>

OPERATIONS:<br>
1. MEAN
2. MEDIAN
3. MODE

Enter your choice: <br>
1<br>
The mean value is: <br>
38<br>
THANK YOU!!!<br>
************<br>

2. Execution of Median option:

EVEN:<br>
WELCOME!!!!!!!!<br>
***************<br>
Enter the size of your integer array: <br>
6<br>
Enter 1 value:<br>
5<br>
Enter 2 value:<br>
2<br>
Enter 3 value:<br>
4<br>
Enter 4 value:<br>
8<br>
Enter 5 value:<br>
1<br>
Enter 6 value:<br>
2<br>
*****************************************<br>

Your Integer Array is :<br>
5 2 4 8 1 2 <br>
*****************************************<br>

OPERATIONS:<br>
1. MEAN
2. MEDIAN
3. MODE

Enter your choice: <br>
2<br>
The sorted array is : <br>
1 2 2 4 5 8 <br>
The median is: <br>
3<br>
THANK YOU!!!<br>
************<br>

ODD:<br>
WELCOME!!!!!!!!<br>
***************<br>
Enter the size of your integer array: <br>
5<br>
Enter 1 value:<br>
6<br>
Enter 2 value:<br>
3<br>
Enter 3 value:<br>
8<br>
Enter 4 value:<br>
5<br>
Enter 5 value:<br>
2<br>
*****************************************<br>

Your Integer Array is :<br>
6 3 8 5 2 <br>
*****************************************<br>

OPERATIONS:<br>
1. MEAN<br>
2. MEDIAN
3. MODE

Enter your choice: <br>
2<br>
The sorted array is : <br>
2 3 5 6 8 <br>
The median is:<br> 
5<br>
THANK YOU!!!<br>

3. Execution of mode option:<br>

WELCOME!!!!!!!!<br>
***************<br>
Enter the size of your integer array: <br>
5<br>
Enter 1 value:<br>
22<br>
Enter 2 value:<br>
3<br>
Enter 3 value:<br>
2<br>
Enter 4 value:<br>
1<br>
Enter 5 value:<br>
22<br>
*****************************************<br>

Your Integer Array is :<br>
22 3 2 1 22 <br>
*****************************************<br>

OPERATIONS:<br>
1. MEAN
2. MEDIAN
3. MODE

Enter your choice: <br>
3<br>
The mode is : <br>
22<br>
THANK YOU!!!<br>
************<br>

FlowChart:<br>
![Flow Chart](./images/Flowchart.png)

<br>