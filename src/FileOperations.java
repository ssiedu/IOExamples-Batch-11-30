
import java.io.File;
import java.io.IOException;


public class FileOperations {

    public static void main(String[] args) throws IOException {
        //File f=new File("e:/data/trial.txt");
        //boolean res=f.mkdir();
        //boolean res=f.delete();
        
        /*
        File f1=new File("e:/data/test.txt");   //file to be renamed
        File f2=new File("e:/data/demo.txt");   //for new file
        boolean res=f1.renameTo(f2);
        */
        File f=new File("e:/data/myfile.txt");
        boolean res=f.createNewFile();
        if(res){
            System.out.println("Operation Success...");
        }else{
            System.out.println("Operation Failed...");
        }

        
    }
}
/*
    Methods of File class

    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()
    
    
*/
