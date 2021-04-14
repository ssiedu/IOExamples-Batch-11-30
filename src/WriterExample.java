
import java.io.FileWriter;


public class WriterExample {

    public static void main(String[] args) throws Exception {

        FileWriter fw=new FileWriter("e://data/sample.txt");
        
        String msg="some data storing to file using writer methos which is text based stream";
        
        //fw.write(msg);
        fw.write(msg, 5, 20);
        fw.close();
        
        System.out.println("Data Stored...!!");
        
        
    }
}
