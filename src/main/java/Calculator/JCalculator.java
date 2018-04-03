package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCalculator extends JFrame implements ActionListener {
    public JCalculator() {
        super("САША и ПАПА");
        initScreen();
        initDisplay();
        initButtons();
        setVisible(true);
    }
private Calculator calculator = new Calculator();
    private String[][] keys = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {"C", "0", "=", "/"}
    };

    private JButton[][] buttons = new JButton[4][4];
    private JTextArea display = new JTextArea();
    private Font font = new Font("Lucida Console", Font.BOLD, 16);


    void initDisplay() {
        display.setFont(font);
        display.setText("0");
        display.setSize(240, 40);
        display.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        add(display);
    }

    void initScreen() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 350);
        setResizable(false);
        setLayout(new GridLayout(5, 1,5,5));
        setLocationRelativeTo(null);
    }

    void initButtons() {
        for (int y = 0; y < 4; y++) {
            JPanel row = new JPanel();
            row.setLayout(new GridLayout(1, 4,5,5));
            for (int x = 0; x < 4; x++) {
                buttons[x][y] = new JButton(keys[y][x]);
                buttons[x][y].setFont(font);
                buttons[x][y].addActionListener(this);
                row.add(buttons[x][y]);
            }
            add(row);
        }
    }

    public void actionPerformed(ActionEvent e) {
        calculator.press((((JButton)e.getSource()).getText()).toCharArray()[0]);
        display.setText(calculator.show());




    }
}
