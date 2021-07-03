package GameElements;

import java.util.Random;

public class Ladders {
    private int InitialPosition;
    private int FinalPosition;
    static int idp = 0;
    private int id;
    static void setID(){
        idp++;
    }

    public Ladders() {
        setID();
        this.id = idp;
        Random random = new Random();
        this.InitialPosition = random.nextInt(100)-10;
        while(this.FinalPosition < InitialPosition+10){
            this.FinalPosition = random.nextInt(100);
        }
    }
}
