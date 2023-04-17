QUESTION:<br>
1. Create a new folder in git named 'Lab 7' for the following question and solve the following: create a flowchart and document the results, constraints, etc., in the README.md file for the lab.<br>
2. Given the famous iris dataset, find the 5-point summary [Mean, Median, Mode, Min, Max] for the attributes: SepalLengthCm, SepalWidthCm, PetalLengthCm, PetalWidthCm.<br>
3. Once the overall summary statistics have been calculated, identify the summary statistics for each Species of iris flower [Iris-setosa, Iris-versicolor, Iris-virginica].<br>
4. Present your results in the appropriate format and write the results in a file.<br>
<br>
SOLUTION:<br>
**********<br>

1. Create new Folder and add 3 folders Dataset, Images, Output. The Dataset folder contains the dataset of the iris flower, The Images folder will contain the flowchart of the problem and the Output folder contains the text file named "output.txt" which contains the output of the program after execution.<br>
<br>
2. Explanation of Code:<br>
<br>
- In the main method create a new file object and mention the specific path.<br>
- Now create a new file using the file object for saving the output.<br>
- Create a FileWriter object for writing the outputs in the output file.<br>
- Now call the following functions <br>
    1. readFile:<br>
        1. Create a variable length and assign it to 0, This variable is used to create arrays of the length value.<br>
        2. Use try block and define the following:<br>
            Create a File object and give the dataset path.<br>
            Create a Scanner class object to read the file.<br>
            Use a while loop to read the file untill it has the next line and increase the length value by 1 if it has a next line.<br>
            Close the Scanner class object
        3. Use catch block to catch if any exception is occured and print the error message.<br>
        4. Return the length.
    2. sepalLen:<br>
        1. This function will accept a parameter of type FileWriter.<br>
        2. Call the readFile function and assign the returned value to a variable length.<br>
        3. Create a float type array sepallength of the length "length".<br>
        4. Now inside a try block, create a object of File class and an object of scanner class and declare a variable count and initialise it to zero.<br>
        5. Now use a while loop to read the file till it has a next line.<br>
            Inside the while loop split the current line using "," as a separator and assign it to a astring array called line<br>
            If the value at index "1" in the line array matches the float value regular expression then:<br>
                Convert the value of line array at position "1" to float and assign to the sepallength array at the value of count position.<br>
                Increase the count by 1.<br>
        6. Close the scanner class object.<br>
        7. Use catch block to catch if any exception is occured and print the error message.<br>
        8. Now use another try block for writing the output in the output file.<br>
        9. Inside the try using the FileWriter object which is passed as a parameter, write the Summary( mean, median, mode, minimum, maximum) values in the output file.<br>
        10. Use catch block to catch if any exception is occured and print the error message.<br>
    3. sepalWidth:<br>
        1. This function will accept a parameter of type FileWriter.<br>
        2. Call the readFile function and assign the returned value to a variable length.<br>
        3. Create a float type array sepalwidth of the length "length".<br>
        4. Now inside a try block, create a object of File class and an object of scanner class and declare a variable count and initialise it to zero.<br>
        5. Now use a while loop to read the file till it has a next line.<br>
            Inside the while loop split the current line using "," as a separator and assign it to a astring array called line<br>
            If the value at index "2" in the line array matches the float value regular expression then:<br>
                Convert the value of line array at position "2" to float and assign to the sepalwidth array at the value of count position.<br>
                Increase the count by 1.<br>
        6. Close the scanner class object.<br>
        7. Use catch block to catch if any exception is occured and print the error message.<br>
        8. Now use another try block for writing the output in the output file.<br>
        9. Inside the try using the FileWriter object which is passed as a parameter, write the Summary( mean, median, mode, minimum, maximum) values in the output file.<br>
        10. Use catch block to catch if any exception is occured and print the error message.<br>
    4. petalLength:<br>
        1. This function will accept a parameter of type FileWriter.<br>
        2. Call the readFile function and assign the returned value to a variable length.<br>
        3. Create a float type array petallength of the length "length".<br>
        4. Now inside a try block, create a object of File class and an object of scanner class and declare a variable count and initialise it to zero.<br>
        5. Now use a while loop to read the file till it has a next line.<br>
            Inside the while loop split the current line using "," as a separator and assign it to a astring array called line<br>
            If the value at index "3" in the line array matches the float value regular expression then:<br>
                Convert the value of line array at position "3" to float and assign to the petallength array at the value of count position.<br>
                Increase the count by 1.<br>
        6. Close the scanner class object.<br>
        7. Use catch block to catch if any exception is occured and print the error message.<br>
        8. Now use another try block for writing the output in the output file.<br>
        9. Inside the try using the FileWriter object which is passed as a parameter, write the Summary( mean, median, mode, minimum, maximum) values in the output file.<br>
        10. Use catch block to catch if any exception is occured and print the error message.<br>
    5. petalWidth:<br>
        1. This function will accept a parameter of type FileWriter.<br>
        2. Call the readFile function and assign the returned value to a variable length.<br>
        3. Create a float type array petalwidth of the length "length".<br>
        4. Now inside a try block, create a object of File class and an object of scanner class and declare a variable count and initialise it to zero.<br>
        5. Now use a while loop to read the file till it has a next line.<br>
            Inside the while loop split the current line using "," as a separator and assign it to a astring array called line<br>
            If the value at index "4" in the line array matches the float value regular expression then:<br>
                Convert the value of line array at position "4" to float and assign to the petalwidth array at the value of count position.<br>
                Increase the count by 1.<br>
        6. Close the scanner class object.<br>
        7. Use catch block to catch if any exception is occured and print the error message.<br>
        8. Now use another try block for writing the output in the output file.<br>
        9. Inside the try using the FileWriter object which is passed as a parameter, write the Summary( mean, median, mode, minimum, maximum) values in the output file.<br>
        10. Use catch block to catch if any exception is occured and print the error message.<br>
- The summary( mean, median, mode, minimum, maximum) is calculated using the below functions:<br>
    1. mean:<br>
        It calculates mean of the integer array using the formula of (sum of observations) / (total number of observations)<br>
    2. median:<br>
        1. It will sort the array<br>
        2. Checks the length of the array<br>
        3. If the value is odd then the middle value is the median and if the length of the array is even then the median is the average of the two middle values.<br>
    3. mode:<br>
        1. Intialise maxcount and maxvalue to zero<br>
        2. Now run a loop where each element will be checked with every element of the array,<br>
        3. which element is repeated for more number of times will be assigned to the maxvalue and the particular count will be assigned to the max count.<br>
        4. Now after the execution of loops the final maxvalue will be the median value.<br>
    4. min:<br>
        1. Assign the first value as minimum value and iterate through the loop and compare the elements with the minimum value<br>
        2. If any element is lesser than the minimum value, then assign the respective element as the minimum value.<br>
    5. max:<br>
        1. Assign the first value as maximum value and iterate through the loop and compare the elements with the maximum value<br>
        2. If any element is greater than the maximum value, then assign the respective element as the maximum value.<br>
<br>
<br>

OUTPUT:<br>
--------<br>
The output will be saved in the output file in the Lab7 folder.<br>
<br>
<br>
Flowchart:<br>
---------<br>
![Flowchart](./images/Lab7.png)