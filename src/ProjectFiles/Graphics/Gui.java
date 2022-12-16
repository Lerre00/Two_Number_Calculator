package ProjectFiles.Graphics;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private JPanel basePanel = new JPanel();
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton commaButton = new JButton(",");
    private JButton additionButton = new JButton("+");
    private JButton subtractionButton = new JButton("-");
    private JButton multiplicationButton = new JButton("*");
    private JButton divisionButton = new JButton("/");
    private JButton exponentButton = new JButton("^");
    private JButton squareRootButton = new JButton("√");
    private JButton clearButton = new JButton("C");
    private JButton backspaceButton = new JButton("←");
    private JButton negativeNumberButton = new JButton("(-)");
    private JButton swapColorButton = new JButton("☻");
    private JButton equalsButton = new JButton("=");
    private JTextField resultWindow = new JTextField(35);

    public Gui(){
        basePanel.setLayout(new BorderLayout());
        add(basePanel);
        basePanel.add(northPanel, BorderLayout.NORTH);
        northPanel.add(swapColorButton);
        northPanel.add(resultWindow);
        northPanel.add(backspaceButton);
        southPanel.setLayout(new GridLayout(5,4));
        basePanel.add(southPanel, BorderLayout.CENTER);

        southPanel.add(clearButton);
        southPanel.add(exponentButton);
        southPanel.add(squareRootButton);
        southPanel.add(divisionButton);

        southPanel.add(button7);
        southPanel.add(button8);
        southPanel.add(button9);
        southPanel.add(multiplicationButton);

        southPanel.add(button4);
        southPanel.add(button5);
        southPanel.add(button6);
        southPanel.add(subtractionButton);

        southPanel.add(button1);
        southPanel.add(button2);
        southPanel.add(button3);
        southPanel.add(additionButton);

        southPanel.add(negativeNumberButton);
        southPanel.add(button0);
        southPanel.add(commaButton);
        southPanel.add(equalsButton);

        setSize(500,500);
        setLocation(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
