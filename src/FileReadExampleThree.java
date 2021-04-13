
import java.io.FileInputStream;


public class FileReadExampleThree {

    public static void main(String[] args) throws Exception {

        FileInputStream fis=new FileInputStream("e:/data/info.txt");
        
        System.out.println((char)fis.read());   //A
        System.out.println((char)fis.read());   //B
        System.out.println((char)fis.read());   //C ->  D
        fis.skip(3);    //D,E,F->G
        System.out.println((char)fis.read());   //G
        System.out.println((char)fis.read());   //H ->  I
        fis.skip(4);    //I,J,K,L
        System.out.println((char)fis.read());   //M
        System.out.println((char)fis.read());   //N
        
        fis.close();
    }
}
