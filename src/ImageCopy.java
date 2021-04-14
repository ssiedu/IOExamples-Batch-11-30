
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopy {

    public static void main(String[] args) throws Exception {

        //here we will copy the contents of an image file to another one.
        
        //opening a stream to read the image contents.
            FileInputStream fis=new FileInputStream("e:/images/pngs/home.png");
            int n=fis.available();  //to find no of bytes available to read
            byte b[]=new byte[n];   //creating a byte array
            fis.read(b);            //now reading the data from stream and storing to byte array.
            fis.close();            //closing the input stream.
      
        //opening a stream to write the image contents.
            FileOutputStream fos=new FileOutputStream("e:/data/homecopy.png");
            fos.write(b);
            fos.close();
            
            System.out.println("Data Copied...!");
    }
}
