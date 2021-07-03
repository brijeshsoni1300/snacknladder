package GameScene;

import GameElements.Ladders;
import GameElements.Snake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private boolean running = true;
    Ladders ladder1 = new Ladders();
    Snake snake1 = new Snake();
    GamePanel(){
        showData();
    }


    void showData(){
        System.out.println("This is snake info");
        System.out.println("ladder1's ID is"+ladder1.getId());
        System.out.println("ladder1's initial position is"+ladder1.getInitialPosition());
        System.out.println("ladder1's final position is"+ladder1.getFinalPosition());
        System.out.println("snake1's ID is"+snake1.getId());
        System.out.println("snake1's initial position is"+snake1.getInitialPosition());
        System.out.println("snake1's final position is"+snake1.getFinalPosition());
        running = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            showData();
        }
    }
//    System.out.println("Test");
}
