import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day2{
    public static void main(String[] args){
        try{
            File sample = new File("day2sample.txt");
            Scanner sc = new Scanner(sample);
            int horizontal = 0;
            int depth = 0;
            while(sc.hasNext()){
                String movement = sc.next();
                int steps = sc.nextInt();
                //System.out.println(movement+" "+steps);
                switch(movement){
                    case "forward" :
                        horizontal += steps;
                        break;
                    case "up" :
                        depth += steps;
                        break;
                    case "down" :
                        depth -= steps;
                        break;
                }
                //System.out.println("current depth:"+depth);
            }
            System.out.println("horzontal:"+horizontal+" depth:"+depth);
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }


    }
}