/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.x.and.o;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author mena_afefe
 */
public class GameXAndO extends JFrame{
private JPanel p;
    JButton b1 = new JButton("x");
    JButton b2 = new JButton("x");
    JButton b3 = new JButton("x");
    JButton b4 = new JButton("");
    JButton b5 = new JButton("");
    JButton b6 = new JButton("");
    JButton b7 = new JButton("o");
    JButton b8 = new JButton("o");
    JButton b9 = new JButton("o");
    JButton StartGame = new JButton("Start Game");
    private JMenuBar menu;
    private JMenu filemenu;
    private JMenu helpmenu;
    private JMenuItem exit_item, help_item, about_item;
    boolean playerOne = false;
    boolean playerTwo = false;
    boolean selected = false;
    boolean start = false;
    boolean bt1 = true;
    boolean bt2 = true;
    boolean bt3 = true;
    boolean bt4 = true;
    boolean bt5 = true;
    boolean bt6 = true;
    boolean bt7 = true;
    boolean bt8 = true;
    boolean bt9 = true;
    int counter1 = 1;
    int counter2 = 0;
    public GameXAndO() {
        setTitle("Game X and O");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);// To stop controling windo size.
        setLocationRelativeTo(null); // To center window.  

        //*
        p = new JPanel();
        p.setSize(286, 230);
        //*/

        menu = new JMenuBar();
        //*
        filemenu = new JMenu("File");
        filemenu.setMnemonic(KeyEvent.VK_X);
        exit_item = new JMenuItem("Exit");
        exit_item.setMnemonic(KeyEvent.VK_X);
        filemenu.add(exit_item);
        exit_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        helpmenu = new JMenu("Help");
        helpmenu.setMnemonic(KeyEvent.VK_X);
        help_item = new JMenuItem("help");
        help_item.setMnemonic(KeyEvent.VK_X);
        about_item = new JMenuItem("About me");
        about_item.setMnemonic(KeyEvent.VK_X);
        helpmenu.add(help_item);
        helpmenu.add(about_item);
        menu.add(filemenu);
        menu.add(helpmenu);
        about_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, " Egyptian E-Learning University \n Name : Mena Afefe Fawze "
                        + "\n ID : 12-00026 \n Center : Assuit \n mnaguib@eelu.edu.eg");
            }
        });
        help_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This application about Image from A popular game that was programmed using the Java programming language,"
                        + "\n which is a transmission of the symbol X and the symbol O through the buttons and the program can determine the winner");
            }
        });
        //*/
        setJMenuBar(menu);
        setLayout(null);
        //*
        p.add(b1);
        b1.addActionListener(new b1());
        p.add(b2);
        b2.addActionListener(new b2());
        p.add(b3);
        b3.addActionListener(new b3());
        p.add(b4);
        b4.addActionListener(new b4());
        p.add(b5);
        b5.addActionListener(new b5());
        p.add(b6);
        b6.addActionListener(new b6());
        p.add(b7);
        b7.addActionListener(new b7());
        p.add(b8);
        b8.addActionListener(new b8());
        p.add(b9);
        b9.addActionListener(new b9());
        p.setLayout(new GridLayout(3, 3));
        add(p);
        //*/
        setVisible(true);
        add(StartGame);
        StartGame.addActionListener(new startgame());
        StartGame.setSize(140, 50);
        StartGame.setLocation(79, 250);

    }

    void PLayer1() {
        if (b1.getText().equals("x")) {
            b1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b2.getText().equals("x")) {
            b2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b3.getText().equals("x")) {
            b3.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b4.getText().equals("x")) {
            b4.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b5.getText().equals("x")) {
            b5.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b6.getText().equals("x")) {
            b6.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b7.getText().equals("x")) {
            b7.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b8.getText().equals("x")) {
            b8.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b9.getText().equals("x")) {
            b9.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        playerOne = true;
    }

    void PLayer2() {
        if (b1.getText().equals("o")) {
            b1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b2.getText().equals("o")) {
            b2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b3.getText().equals("o")) {
            b3.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b4.getText().equals("o")) {
            b4.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b5.getText().equals("o")) {
            b5.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b6.getText().equals("o")) {
            b6.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b7.getText().equals("o")) {
            b7.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b8.getText().equals("o")) {
            b8.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        if (b9.getText().equals("o")) {
            b9.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
        }
        playerTwo = true;
    }
    Border border = new JButton().getBorder();

    void changeplayer() {
        b1.setBorder(border);
        b2.setBorder(border);
        b3.setBorder(border);
        b4.setBorder(border);
        b5.setBorder(border);
        b6.setBorder(border);
        b7.setBorder(border);
        b8.setBorder(border);
        b9.setBorder(border);

        if (playerOne) {
            counter1++;
            PLayer1();
            testwin("o");
        }
        if (playerTwo) {
            counter2++;
            PLayer2();
            testwin("x");
        }
        selected = false;
    }

    void testwin(String value) {
        if (value == "x") {
            if (b9.getText().equals(value) && b8.getText().equals(value) && b7.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//1
            if (b9.getText().equals(value) && b6.getText().equals(value) && b3.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//2
            if (b9.getText().equals(value) && b5.getText().equals(value) && b1.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//3
            if (b1.getText().equals(value) && b4.getText().equals(value) && b7.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//4
            if (b7.getText().equals(value) && b5.getText().equals(value) && b3.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//5
            if (b6.getText().equals(value) && b5.getText().equals(value) && b4.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//6
            if (b8.getText().equals(value) && b5.getText().equals(value) && b2.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer One you are Win \n in number Move " + counter1);
                playerOne = false;
                playerTwo = false;
            }//7
        }
        if (value == "o") {
            if (b1.getText().equals(value) && b2.getText().equals(value) && b3.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//1
            if (b9.getText().equals(value) && b6.getText().equals(value) && b3.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//2
            if (b9.getText().equals(value) && b5.getText().equals(value) && b1.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//3
            if (b1.getText().equals(value) && b4.getText().equals(value) && b7.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//4
            if (b7.getText().equals(value) && b5.getText().equals(value) && b3.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//5
            if (b6.getText().equals(value) && b5.getText().equals(value) && b4.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//6
            if (b8.getText().equals(value) && b5.getText().equals(value) && b2.getText().equals(value)) {
                JOptionPane.showMessageDialog(null, "Welcome Pleayer Two you are Win \n in number Move " + counter2);
                playerOne = false;
                playerTwo = false;
            }//7
        }
    }

    void change() {
        if (!bt1) {
            b1.setText("");
            bt1 = true;
        }
        if (!bt2) {
            b2.setText("");
            bt2 = true;
        }
        if (!bt3) {
            b3.setText("");
            bt3 = true;
        }
        if (!bt4) {
            b4.setText("");
            bt4 = true;
        }
        if (!bt5) {
            b5.setText("");
            bt5 = true;
        }
        if (!bt6) {
            b6.setText("");
            bt6 = true;
        }
        if (!bt7) {
            b7.setText("");
            bt7 = true;
        }
        if (!bt8) {
            b8.setText("");
            bt8 = true;
        }
        if (!bt9) {
            b9.setText("");
            bt9 = true;
        }

    }

    private class startgame implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            b1.setText("x");
            b2.setText("x");
            b3.setText("x");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("o");
            b8.setText("o");
            b9.setText("o");
            b1.setBorder(border);
            b2.setBorder(border);
            b3.setBorder(border);
            b4.setBorder(border);
            b5.setBorder(border);
            b6.setBorder(border);
            b7.setBorder(border);
            b8.setBorder(border);
            b9.setBorder(border);
            counter1 = 1;
            counter2 = 0;
            PLayer1();
            start = true;
        }

    }

    private class b1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt1 && !selected) {
                    if (b1.getText().equals("x")) {
                        b1.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt1 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt1 && !selected) {
                    if (b1.getText().equals("o")) {
                        b1.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt1 = false;
                        selected = true;
                    }
                } else if (bt1 != true) {
                    b1.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt1 = true;
                    selected = false;
                }

                if (b1.getText().equals("")) {
                    if (selected && bt1) {
                        change();
                        if (playerOne) {
                            b1.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b1.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt2 && !selected) {
                    if (b2.getText().equals("x")) {
                        b2.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt2 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt2 && !selected) {
                    if (b2.getText().equals("o")) {
                        b2.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt2 = false;
                        selected = true;
                    }
                } else if (bt2 != true) {
                    b2.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt2 = true;
                    selected = false;
                }
                if (b2.getText().equals("")) {
                    if (selected && bt2) {
                        change();
                        if (playerOne) {
                            b2.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b2.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt3 && !selected) {
                    if (b3.getText().equals("x")) {
                        b3.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt3 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt3 && !selected) {
                    if (b3.getText().equals("o")) {
                        b3.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt3 = false;
                        selected = true;
                    }
                } else if (bt3 != true) {
                    b3.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt3 = true;
                    selected = false;
                }
                if (b3.getText().equals("")) {
                    if (selected && bt3) {
                        change();
                        if (playerOne) {
                            b3.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b3.setText("o");
                            playerTwo = false;
                            playerOne = true;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt4 && !selected) {
                    if (b4.getText().equals("x")) {
                        b4.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt4 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt4 && !selected) {
                    if (b4.getText().equals("o")) {
                        b4.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt4 = false;
                        selected = true;
                    }
                } else if (bt4 != true) {
                    b4.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt4 = true;
                    selected = false;
                }

                if (b4.getText().equals("")) {
                    if (selected && bt4) {
                        change();
                        if (playerOne) {
                            b4.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b4.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b5 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt5 && !selected) {
                    if (b5.getText().equals("x")) {
                        b5.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt5 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt5 && !selected) {
                    if (b5.getText().equals("o")) {
                        b5.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt5 = false;
                        selected = true;
                    }
                } else if (bt5 != true) {
                    b5.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt5 = true;
                    selected = false;
                }
                if (b5.getText().equals("")) {
                    if (selected && bt5) {
                        change();
                        if (playerOne) {
                            b5.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b5.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b6 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt6 && !selected) {
                    if (b6.getText().equals("x")) {
                        b6.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt6 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt6 && !selected) {
                    if (b6.getText().equals("o")) {
                        b6.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt6 = false;
                        selected = true;
                    }
                } else if (bt6 != true) {
                    b6.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt6 = true;
                    selected = false;
                }
                if (b6.getText().equals("")) {
                    if (selected && bt6) {
                        change();
                        if (playerOne) {
                            b6.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b6.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b7 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt7 && !selected) {
                    if (b7.getText().equals("x")) {
                        b7.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt7 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt7 && !selected) {
                    if (b7.getText().equals("o")) {
                        b7.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt7 = false;
                        selected = true;
                    }
                } else if (bt7 != true) {
                    b7.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt7 = true;
                    selected = false;
                }
                if (b7.getText().equals("")) {
                    if (selected && bt7) {
                        change();
                        if (playerOne) {
                            b7.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b7.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b8 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt8 && !selected) {
                    if (b8.getText().equals("x")) {
                        b8.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt8 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt8 && !selected) {
                    if (b8.getText().equals("o")) {
                        b8.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt8 = false;
                        selected = true;
                    }
                } else if (bt8 != true) {
                    b8.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt8 = true;
                    selected = false;
                }
                if (b8.getText().equals("")) {
                    if (selected && bt8) {
                        change();
                        if (playerOne) {
                            b8.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b8.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    private class b9 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (start) {
                if (playerOne && bt9 && !selected) {
                    if (b9.getText().equals("x")) {
                        b9.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt9 = false;
                        selected = true;
                    }
                } else if (playerTwo && bt9 && !selected) {
                    if (b9.getText().equals("o")) {
                        b9.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.blue));
                        bt9 = false;
                        selected = true;
                    }
                } else if (bt9 != true) {
                    b9.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.blue));
                    bt9 = true;
                    selected = false;
                }
                if (b9.getText().equals("")) {
                    if (selected && bt9) {
                        change();
                        if (playerOne) {
                            b9.setText("x");
                            playerOne = false;
                            playerTwo = true;
                        } else {
                            b9.setText("o");
                            playerOne = true;
                            playerTwo = false;
                        }
                        changeplayer();
                    }
                }
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new GameXAndO();
    }
    
}
