package ProjectFiles.Graphics;

import ProjectFiles.Logic.CalculatorFacade;
import ProjectFiles.Logic.ColorChanger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Gui extends JFrame implements ActionListener {

    CalculatorFacade calculatorFacade;

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
    ArrayList<JButton> buttonArray = new ArrayList<>(Arrays.asList(button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            commaButton, additionButton, subtractionButton, multiplicationButton, divisionButton, exponentButton, squareRootButton, clearButton, backspaceButton,
            negativeNumberButton, swapColorButton, equalsButton));

    public Gui(){

        calculatorFacade = new CalculatorFacade();

        for(JButton button: buttonArray){
            button.addActionListener(this);
        }

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button0)){
            resultWindow.setText(resultWindow.getText()+button0.getText());
        }else if(e.getSource().equals(button1)){
            resultWindow.setText(resultWindow.getText()+button1.getText());
        }else if(e.getSource().equals(button2)){
            resultWindow.setText(resultWindow.getText()+button2.getText());
        }else if(e.getSource().equals(button3)){
            resultWindow.setText(resultWindow.getText()+button3.getText());
        }else if(e.getSource().equals(button4)){
            resultWindow.setText(resultWindow.getText()+button4.getText());
        }else if(e.getSource().equals(button5)){
            resultWindow.setText(resultWindow.getText()+button5.getText());
        }else if(e.getSource().equals(button6)){
            resultWindow.setText(resultWindow.getText()+button6.getText());
        }else if(e.getSource().equals(button7)){
            resultWindow.setText(resultWindow.getText()+button7.getText());
        }else if(e.getSource().equals(button8)){
            resultWindow.setText(resultWindow.getText()+button8.getText());
        }else if(e.getSource().equals(button9)){
            resultWindow.setText(resultWindow.getText()+button9.getText());
        }else if(e.getSource().equals(commaButton)){
            resultWindow.setText(resultWindow.getText()+commaButton.getText());
        }else if(e.getSource().equals(clearButton)){
            resultWindow.setText("");
        }else if(e.getSource().equals(backspaceButton)){
            StringBuilder text = new StringBuilder(resultWindow.getText());
            if(text.isEmpty()){

            }else{
            text.deleteCharAt(text.length() -1);
            resultWindow.setText(text.toString());
            }
        }else if(e.getSource().equals(additionButton)){
            resultWindow.setText(resultWindow.getText()+additionButton.getText());
        }else if(e.getSource().equals(subtractionButton)){
            resultWindow.setText(resultWindow.getText()+subtractionButton.getText());
        }else if(e.getSource().equals(divisionButton)){
            resultWindow.setText(resultWindow.getText()+divisionButton.getText());
        }else if(e.getSource().equals(multiplicationButton)){
            resultWindow.setText(resultWindow.getText()+multiplicationButton.getText());
        }else if(e.getSource().equals(squareRootButton)){
            resultWindow.setText(resultWindow.getText()+squareRootButton.getText());
        }else if(e.getSource().equals(exponentButton)){
            resultWindow.setText(resultWindow.getText()+exponentButton.getText());
        }else if(e.getSource().equals(negativeNumberButton)){
            resultWindow.setText(resultWindow.getText()+negativeNumberButton.getText());
        }else if(e.getSource().equals(swapColorButton)){
            Color color = ColorChanger.getRandomColor();
            for(JButton b: buttonArray){
                b.setBackground(color);
            }
        }
    }
}
