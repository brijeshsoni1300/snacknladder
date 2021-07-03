package GameElements;
import java.util.Random;
public class Snake {
    private int InitialPosition;
    private int FinalPosition;
    static int idp = 0;
    private int id;
    static void setID(){
        idp++;
    }
    public Snake(){
        setID();
        this.id = idp;
        Random random = new Random();
        this.InitialPosition = random.nextInt(90)+10;
        this.FinalPosition = random.nextInt(this.InitialPosition-10);
    }

    public int getInitialPosition() {
        return InitialPosition;
    }

    public int getFinalPosition() {
        return FinalPosition;
    }

    public int getId() {
        return id;
    }
}
