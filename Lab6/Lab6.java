import java.io.File;
import java.util.Scanner;

class Lab6{
    public static void main(String[] args){
        int a,e,i,o,u;
        int count = 0;
        //Read file
        try{
            File file = new File("./22122138-MDS273L-JAVA/Lab6/text.txt");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
        
    }
}