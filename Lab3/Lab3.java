package Lab3;

import java.util.*;

public class Lab3 {

    // MEAN FUNCTION
    static int meanvalue(int[] arr) {
        int sum = 0;
        int mean;
        for (int i = 0; i < arr.length; i++) {
            // ADD ALL ELEMENTS USING THE SUM
            sum += arr[i];
        }
        System.out.println("The mean value is: ");
        // MEAN = SUM OF ALL ELEMENTS / TOTAL NUMBER OF ELEMENTS
        mean = (int)((sum) / arr.length);
        return mean;
    }

    static int medianvalue(int arr[]) {
        // SORTING THE ARRAY
        int index = 0;
        double m;
        int median;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            index = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("The sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // CHECK IF THE LENGTH OF THE ARRAY IS EVEN OR ODD
        // IF ODD THEN MIDDLE VALUE IS MEDIAN, IF EVEN THEN THE AVERAGE OF MIDDLE TWO
        // VALUES IS THE MEDIAN
        if (n%2 == 0) {
            m = ((double) (arr[(n / 2) - 1]) + (double) (arr[(n / 2)])) / 2;
        } else {
            m = (arr[n/ 2]);
        }
        System.out.println("");
        System.out.println("The median is: ");
        median = (int)m;
        return median;
    }

    static int modevalue(int[] arr) {
        // Intialize the maxvalue and maxcount
        int maxcount = 0;
        int maxvalue = 0;
        int mode;
        // check each element of the array with all the elements of the array and
        // increase te count if you find the same element.
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            // check with the count with the maxcount and if the max count is less than
            // count, assign the count as maxcount and the
            // particular i element as the max value.
            if (count > maxcount) {
                maxcount = count;
                maxvalue = arr[i];
            }
        }
        mode = maxvalue;
        System.out.println("The mode is : ");
        return mode;
    }

    public static void main(String[] args) {
        int mean;
        int median;
        int mode;
        System.out.println("WELCOME!!!!!!!!");
        System.out.println("***************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of your integer array: ");
        int n = Integer.parseInt(scan.nextLine());
        int intarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " value:");
            intarr[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("Your Integer Array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(intarr[i] + " ");
        }
        System.out.println();
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("OPERATIONS:");
        System.out.println("1. MEAN");
        System.out.println("2. MEDIAN");
        System.out.println("3. MODE");
        System.out.println();
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scan.nextLine());
        switch (choice) {
            case 1:
                mean = meanvalue(intarr);
                System.out.println(mean);
                break;
            case 2:
                median = medianvalue(intarr);
                System.out.println(median);
                break;
            case 3:
                mode = modevalue(intarr);
                System.out.println(mode);
                break;
            default:
                System.out.println("Please enter your choice as 1,2 or 3.");
        }
        System.out.println("THANK YOU!!!");
        System.out.println("************");
    }

}
