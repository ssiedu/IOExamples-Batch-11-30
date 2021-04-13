
import java.io.FileOutputStream;


public class FileWriteExampleTwo {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos=new FileOutputStream("e:/data/trial.txt");
        
        String msg="hello user, this contents are written using java code";
        
        byte b[]=msg.getBytes();        //converts the string to byte array
        
        //fos.write(b);
        
        fos.write(b, 6, 25);
        
        fos.close();
        
        System.out.println("Data Stored......");
        
        
        
    }
}
