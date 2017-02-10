package koffie;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * Created by SapereAude on 18/01/2017.
 */
public class KoffieProbleem implements Runnable {

    private JLabel picLabel = null;
    private String username = System.getProperty("user.name");

    private int counter = 0;
    private JLabel afb_counter = null;
    private JLabel file_name = null;
    private JButton nextButton = new JButton("next");




    private KoffieProbleem() throws IOException {

    }


    public static void main(String[] args) throws IOException {
        KoffieProbleem example = new KoffieProbleem();
        // schedule this for the event dispatch thread (edt)
        SwingUtilities.invokeLater(example);

    }

    public void startEvent() {
        //System.out.println("hij werkt!");
        //System.out.println(afbeeldingen.get(0))
    }

    public void run()
    {

        JFrame frame = new JFrame("titel");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000, 1000));
        frame.setLayout(new BorderLayout());
        frame.pack();
        frame.setVisible(true);
        frame.setFocusable(true);
        JPanel mainpanel = new JPanel();
        JPanel toppanel = new JPanel();
        JPanel bottompanel = new JPanel();
        frame.getContentPane().add(mainpanel);
        mainpanel.setLayout(new BorderLayout());
        mainpanel.add(toppanel);
        mainpanel.add(bottompanel);
        mainpanel.add(toppanel, BorderLayout.NORTH);
        mainpanel.add(bottompanel, BorderLayout.SOUTH);
        JLabel label = new JLabel("test");
        toppanel.add(label);
        toppanel.add(nextButton);



    }

    public static int generateDays(double koffie_p, double aparaat_p) {
        System.out.println("starting");

        return 0;
    }
    class EventHandler implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println(e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }



}


