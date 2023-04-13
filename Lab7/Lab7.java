import java.io.*;
import java.util.*;

public class Lab7{        
    public static void main(String[] args){
        // READ THE FILE
        readFile();
        //SEPAL LENGTH
        sepalLen();
        //SEPAL WIDTH
        sepalWidth();
        //PETAL LENGTH
        petalLen();
        //PETAL WIDTH
        petalWidth();
    }

    //**********************************************************************************//
    static void readFile(){
        System.out.println("THE DATA: ");
        System.out.println("********");
        try{
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            //read the file
            while(read.hasNextLine()){
                String line[] = read.nextLine().split(",");
                System.out.println(Arrays.toString(line));
            }
            read.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //**********************************************************************************//
    static int lenFile(){
        int length = 0;
        try{
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            //read the file
            while(read.hasNextLine()){
                String line[] = read.nextLine().split(",");
                length = length+1;
            }
            read.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return length;
    }
    //**********************************************************************************//
    static void sepalLen(){
        int length = lenFile();
        float sepallength[] = new float[length-1];
        try{
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            //SEPAL LENGTH
            int count = 0;
            while(read.hasNextLine()){
                String line[] = read.nextLine().split(",");
                if (line[1].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    sepallength[count] = Float.parseFloat(line[1]);
                    count++;
                }
            }
            read.close();
            //TO PRINT THE SEPAL LENGTH ARRAY
            // for(int i = 0;i<sepallength.length;i++){
            //     System.out.println(sepallength[i]);
            // }
            System.out.println(" ");
            System.out.println("SEPAL LENGTH ");
            System.out.println("************");
            System.out.println("");
            System.out.println("SUMMARY");
            System.out.println("*******");
            System.out.println("MIN: "+min(sepallength));
            System.out.println("MAX: "+max(sepallength));
            System.out.println("MEAN: "+mean(sepallength));
            System.out.println("MEDIAN: "+median(sepallength));
            //System.out.println("MODE: "+mode(sepallength));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //**********************************************************************************//
    static void sepalWidth(){
        int length = lenFile();
        float sepalwidth[] = new float[length-1];
        try{
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            //SEPAL LENGTH
            int count = 0;
            while(read.hasNextLine()){
                String line[] = read.nextLine().split(",");

                if (line[2].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    sepalwidth[count] = Float.parseFloat(line[2]);
                    count++;
                }
            }
            read.close();
            //TO PRINT THE SEPAL LENGTH ARRAY
            // for(int i = 0;i<sepallength.length;i++){
            //     System.out.println(sepallength[i]);
            // }

            System.out.println(" ");
            System.out.println("SEPAL WIDTH ");
            System.out.println("***********");
            System.out.println("");
            System.out.println("SUMMARY");
            System.out.println("*******");
            System.out.println("MIN: "+min(sepalwidth));
            System.out.println("MAX: "+max(sepalwidth));
            System.out.println("MEAN: "+mean(sepalwidth));
            System.out.println("MEDIAN: "+median(sepalwidth));
            //System.out.println("MODE: "+mode(sepalwidth));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //**********************************************************************************//
    static void petalLen(){
        int length = lenFile();
        float petallength[] = new float[length-1];
        try{
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            //SEPAL LENGTH
            int count = 0;
            while(read.hasNextLine()){
                String line[] = read.nextLine().split(",");

                if (line[3].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    petallength[count] = Float.parseFloat(line[3]);
                    count++;
                }
            }
            read.close();
            //TO PRINT THE SEPAL LENGTH ARRAY
            // for(int i = 0;i<sepallength.length;i++){
            //     System.out.println(sepallength[i]);
            // }
            System.out.println(" ");
            System.out.println("PETAL LENGTH ");
            System.out.println("************");
            System.out.println("");
            System.out.println("SUMMARY");
            System.out.println("*******");
            System.out.println("MIN: "+min(petallength));
            System.out.println("MAX: "+max(petallength));
            System.out.println("MEAN: "+mean(petallength));
            System.out.println("MEDIAN: "+median(petallength));
            //System.out.println("MODE: "+mode(petallength));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //**********************************************************************************//
    static void petalWidth(){
        int length = lenFile();
        float petalwidth[] = new float[length-1];
        try{
            FileReader file = new FileReader("./Dataset/Iris.csv");
            Scanner read = new Scanner(file);
            //SEPAL LENGTH
            int count = 0;
            while(read.hasNextLine()){
                String line[] = read.nextLine().split(",");

                if (line[4].matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")) {
                    petalwidth[count] = Float.parseFloat(line[4]);
                    count++;
                }
            }
            read.close();
            //TO PRINT THE SEPAL LENGTH ARRAY
            // for(int i = 0;i<sepallength.length;i++){
            //     System.out.println(sepallength[i]);
            // }
            System.out.println(" ");
            System.out.println("PETAL WIDTH ");
            System.out.println("***********");
            System.out.println("");
            System.out.println("SUMMARY");
            System.out.println("*******");
            System.out.println("MIN: "+min(petalwidth));
            System.out.println("MAX: "+max(petalwidth));
            System.out.println("MEAN: "+mean(petalwidth));
            System.out.println("MEDIAN: "+median(petalwidth));
            //System.out.println("MODE: "+mode(petalwidth));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //**********************************************************************************//
    static float mean(float arr[]){
        float meanvalue;
        float sum=0;
        for(int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        return meanvalue = sum/arr.length;
    }
    //**********************************************************************************//
    static float median(float arr[]){
        float medianvalue=0;
        int l = arr.length;
        int index;
        //Sorting the array
        for(int i=0;i<l;i++){
            index = i;
            for(int j=i;j<=l-1;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            float temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        // To check the sorted array
        // for(int i =0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        //Finding median
        if(l % 2 != 0){
            medianvalue = arr[l/2];
        }
        else{
            medianvalue = (arr[(l/2)-1] + arr[(l/2)])/2;
        }

        return medianvalue;
    }
    //**********************************************************************************//
    static float mode(float arr[]){
        float modevalue=0;
        return modevalue;
    }
    //**********************************************************************************//
    static float min(float arr[]){
        float minvalue = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
    //**********************************************************************************//
    static float max(float arr[]){
        float maxvalue = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

}