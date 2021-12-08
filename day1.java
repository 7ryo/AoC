import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class day1{
    public static void main(String[] args){
        try{
            File inputfile = new File("day1sample.txt");
            Scanner sc = new Scanner(inputfile);
            int count=0;
            int lastnum = 0;
            while(sc.hasNextLine()){
                int temp = sc.nextInt();
                System.out.print(temp);
                
                if(lastnum==0){
                    System.out.println("first element");
                    lastnum=temp;
                }
                else{
                    if(temp-lastnum>0){
                        count++;
                        System.out.println("increased");
                    }
                    else System.out.println();
                    lastnum=temp;
                    
                }
            
            }
            System.out.println("count is "+count);
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        
        
    }
}