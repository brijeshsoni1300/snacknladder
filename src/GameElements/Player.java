package GameElements;

public class Player {
    private int id;
    private int position;
    static int idp = 0;
    static void setID(){
          idp++;
    }

    public Player(){
        setID();
        this.id = idp;
        this.position = 0;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }
}
