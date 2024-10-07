package MyTests;

import javax.swing.*;
import java.awt.*;

public class TicTacToe_Frame {
    JFrame game = new JFrame();

    public void setGame(JFrame game) {
        this.game = game;
        game.setTitle("ttt");
        game.setSize(200,200);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setLayout(new FlowLayout());


    }
    public void Buttons(){
        for (int i = 0; i < 9; i++) {
            String x = String.valueOf(i);
            Button a = new Button(x);

        }

    }
}
