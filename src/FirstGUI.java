import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String args[]){
        Abc obj = new Abc( );

    }
}
class Abc extends JFrame{
    public Abc( ){

        JLabel l = new JLabel("hiii");
        JLabel l1 = new JLabel("whats up");
        add(l);
        add(l1);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}