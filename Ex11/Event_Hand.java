import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Event_Hand" width="1200" height="1200">
</applet>
*/

public class Event_Hand extends Applet implements ActionListener {

    TextField a, b;
    double sum;
    Button ab;

    public void init() {

        Label value1 = new Label("First Number : ", Label.RIGHT);
        
        Label value2 = new Label("Second Number : ", Label.RIGHT);

        a = new TextField(10);
        b = new TextField(10);

        ab = new Button("Add");

        add(value1);
        add(a);
        add(value2);
        add(b);
        add(ab);

        ab.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == ab) {

            try {
                int num1 = Integer.parseInt(a.getText());
                int num2 = Integer.parseInt(b.getText());

                sum = num1 + num2;

            } catch (NumberFormatException e) {
                sum = 0;
            }

            repaint();
        }
    }

    public void paint(Graphics g) {

        g.drawString("Value 1 is : " + a.getText(), 20, 100);
        g.drawString("Value 2 is : " + b.getText(), 20, 130);
        g.drawString("Sum of the numbers is : " + sum, 20, 160);
    }
}