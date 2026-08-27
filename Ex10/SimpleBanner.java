import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" width="700" height="50">
</applet>
*/
public class SimpleBanner extends Applet implements Runnable {
    String msg = " Accept Everything Nothing is Permanent.";
    Thread t = null;
    int state;
    boolean stopFlag;

    // Set colors and initialize thread
    public void init() {
        setBackground(Color.blue);
        setForeground(Color.white);
    }

    // Start thread
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    // Entry point for the thread that runs the banner
    public void run() {
        char ch;

        // Display banner
        for (;;) {
            try {
                repaint();
                Thread.sleep(250);

                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;

                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
            }
        }
    }
    // Pause the banner
    public void stop() {
        stopFlag = true;
        t = null;
    }

    // Display the banner
    public void paint(Graphics g) {
        g.drawString(msg, 500, 300);
    }
}