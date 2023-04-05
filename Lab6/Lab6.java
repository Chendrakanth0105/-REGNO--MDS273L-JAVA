import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

class Lab6{
    public static void main(String[] args){
        int[] Vowels = new int[5];//[a,e,i,o,u]
        //Read file
        try{
            FileReader read = new FileReader("./22122138-MDS273L-JAVA/Lab6/text.txt");
            int count;
            while((count = read.read())!=-1){
                char ch = (char) count;
                String c = (String.valueOf(ch)).toLowerCase();
                if(isVowel(c)){
                    switch(c){
                        case "a":
                            Vowels[0]++;
                            break;
                        case "e":
                            Vowels[1]++;
                            break;
                        case "i":
                            Vowels[2]++;
                            break;
                        case "o":
                            Vowels[3]++;
                            break;
                        case "u":
                            Vowels[4]++;
                            break;

                    }
                }
            }
            read.close();
        System.out.println("Vowel counts:");
        System.out.println("a: " + Vowels[0]);
        System.out.println("e: " + Vowels[1]);
        System.out.println("i: " + Vowels[2]);
        System.out.println("o: " + Vowels[3]);
        System.out.println("u: " + Vowels[4]);

        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
        
    }
    public static boolean isVowel(String ch){
        String vowel = "aeiou";
        return vowel.indexOf(ch) != -1;
    }
}