
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputExample {

    public static void main(String[] args) throws Exception {

        //here we are reading premitive data from empinfo.txt
        
        FileInputStream fis=new FileInputStream("e:/data/empinfo.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();   //get the eno
        double v2=dis.readDouble(); //get the sal
        boolean v3=dis.readBoolean(); //get the marital status
        dis.close();
        fis.close();
        System.out.println("Emp Number  : "+v1);
        System.out.println("Salary      : "+v2);
        System.out.println("Married     : "+v3);
       
        
    }
}
