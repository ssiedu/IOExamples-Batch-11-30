
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FileReadExampleOne {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //reading the contents of a file
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File Name (Including Path) : ");
        String fname=sc.next();
        
        //step-1 (open a stream)
        FileInputStream fis=new FileInputStream(fname);
        //step-2 (read the data from stream)
        
        while(true){
            int n=fis.read(); 
            if(n==-1)break;
            System.out.print((char)n);
        }
        System.out.println();
        //step-3 (close the stream)
        fis.close();
        
    }
}
