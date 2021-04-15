
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class PlayGame {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice : new or old : ");
        String ch=sc.next();
        Game g=null;
        if(ch.equalsIgnoreCase("new")){
            g=new Game();
        }else if(ch.equalsIgnoreCase("old")){
            //read-Game-object-from-file
            FileInputStream fis=new FileInputStream("e:/data/oldgame.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            g=(Game) ois.readObject();
            ois.close();
            fis.close();
        }
        System.out.println("Enter Horizontal Move : ");
        int h=sc.nextInt();
        System.out.println("Enter Vertical Move : ");
        int v=sc.nextInt();
        g.move(h, v);
        g.showPos();
        System.out.println("Saving Game ....!");
        //here we are writing game object to file
        FileOutputStream fos=new FileOutputStream("e:/data/oldgame.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(g);
        oos.close();
        fos.close();
        System.out.println("Ending Game....!");
        
        
        
    }
}
