
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputExample {

    public static void main(String[] args) throws Exception {

        int eno=1001;
        double sal=56005.50;
        boolean married=true;
        
        FileOutputStream fos=new FileOutputStream("e:/data/empinfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        dos.writeInt(eno);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        
        dos.close();
        fos.close();
        
        System.out.println("Data Successfully Stored..!!");
        
    }
}
