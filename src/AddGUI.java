import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGUI {
    public static void main(String args[]){
        Addition b = new Addition();

    }
}
class Addition extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton b;
    JButton c;
    JLabel l;
    JButton d;
    JButton e;
    JTextField t3;
    JTextField t4;
    JLabel l1;

    public Addition(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("OK");
        c = new JButton("+");
        l = new JLabel("RESULT:");
        add(t1);
        add(c);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(this);
        setLayout(new GridBagLayout());
        setVisible(true);
        setSize(900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int num = num1+num2;
        l.setText(num+"");

    }
}
