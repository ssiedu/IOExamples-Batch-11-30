public class Game implements java.io.Serializable {
    private int xPos;
    private transient int yPos;
    
    public void move(int h, int v){
        xPos=xPos+h;
        yPos=yPos+v;
    }
    public void showPos(){
        System.out.println("Current Pos : "+xPos+","+yPos);
    }
}
