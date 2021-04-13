
import java.io.FileInputStream;

public class FileReadExampleTwo {

    public static void main(String[] args) throws Exception {

        //opening a stream
        FileInputStream fis = new FileInputStream("e:/data/info.txt");

        //read the data from stream
        //creating a array of byte data type
        int n=fis.available();
        byte b[] = new byte[n];
        fis.read(b); //will read 10 bytes from stream and will store them to byte array

        //converting an byte-array to String
        String s = new String(b);
        System.out.println(s);

        //close the stream
        fis.close();

    }
}
