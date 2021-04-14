
import java.io.FileReader;


public class ReaderExample {

    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("e:/data/sample.txt");
        char ch[]=new char[10];
        fr.read(ch);
        for(char tmp:ch){
            System.out.print(tmp);
        }
        fr.close();
        
    }
}
