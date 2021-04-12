
import java.io.File;


public class FileInfo {

    public static void main(String[] args) {
        
        File f=new File("e:/data");
        if(f.isDirectory()){
            String names[]=f.list();
            for(String name:names){
                System.out.println(name);
            }
        }else{
            System.out.println("Its Not A Directory");
        }
        
        /*
        File f=new File("e:/data/trial.txt");
        //boolean res=f.isHidden();
        boolean res=f.canWrite();
        System.out.println(res);
        */
        /*
        if(f.exists()){
            long n=f.length();
            System.out.println("Length : "+n);
        }else{
            System.out.println("Not Available ....!");
        }
        */
    }
}
/*
    methods of File class
    ------------------------

    boolean exists()    //will return true if the file exists otherwise false    
    long lengh()        //find the length of a file
    boolean isHidden()  //returns true if it is a hidden file otherwise file.
    boolean canWrite()  //return true if we can write to the file (false if file is read-only)
    String[] list()     //can find the elements in a folder and return their names as a String[]
    boolean isDirectory()
    boolean isFile()

*/