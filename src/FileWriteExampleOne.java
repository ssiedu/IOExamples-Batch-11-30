
import java.io.FileOutputStream;


public class FileWriteExampleOne {

    public static void main(String[] args) throws Exception {

        //here we are writing data to a file
        
        //step-1    (open a stream)
        //FileOutputStream fos=new FileOutputStream("e:/data/trial.txt"); //non-existing-file
        //FileOutputStream fos=new FileOutputStream("e:/data/info.txt");  //existing file  (overwrite)
        FileOutputStream fos=new FileOutputStream("e:/data/demo.txt", true);  //existing file  (append)
        //step-2    (write the data on stream)
        fos.write(97); fos.write(98); fos.write(99); fos.write(100);
        
        //step-3    (Close the stream)
        fos.close();
        
        System.out.println("Data Stored Successfully...!");
    }
}
