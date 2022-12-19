package ProjectFiles.Graphics;

import ProjectFiles.Logic.CalculatorFacade;
import ProjectFiles.Logic.ColorChanger;
import ProjectFiles.Logic.Operators.OperatorStates;
import ProjectFiles.Logic.StringHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Gui extends JFrame implements ActionListener {

    private CalculatorFacade calculatorFacade;
    private OperatorStates state = OperatorStates.DEFAULT;

    ArrayList<Double> doubles;
    double double1;
    double double2;
    int counter = 0;
    int sNum = 0;
    String tal1;
    String tal2;
    double answer;
    String answerAsString;

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

        setTitle("Tvåtals Räknare");

        setSize(500,500);
        setLocation(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
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

        }else if(e.getSource().equals(negativeNumberButton)){

            if(negativeNumberButton.getText() == "(-)") {
                button1.setText("-1");
                button2.setText("-2");
                button3.setText("-3");
                button4.setText("-4");
                button5.setText("-5");
                button6.setText("-6");
                button7.setText("-7");
                button8.setText("-8");
                button9.setText("-9");
                negativeNumberButton.setText("(+)");
            }
            else if(negativeNumberButton.getText() == "(+)"){
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                button4.setText("4");
                button5.setText("5");
                button6.setText("6");
                button7.setText("7");
                button8.setText("8");
                button9.setText("9");
                negativeNumberButton.setText("(-)");
            }

        }else if(e.getSource().equals(commaButton)){
            if(!resultWindow.getText().endsWith(",")){
                resultWindow.setText(resultWindow.getText()+commaButton.getText());
            }

        }else if(e.getSource().equals(clearButton)){
            resultWindow.setText("");
            state = OperatorStates.DEFAULT;

        }else if(e.getSource().equals(backspaceButton)){
            StringBuilder text = new StringBuilder(resultWindow.getText());
            if(text.isEmpty()){

            }

            else{
            text.deleteCharAt(text.length() -1);
            resultWindow.setText(text.toString());
            }

        }else if(e.getSource().equals(additionButton)){
            if (state.equals(OperatorStates.DEFAULT)){
                state = OperatorStates.ADDITION;
                resultWindow.setText(resultWindow.getText()+additionButton.getText());
                tal1 = resultWindow.getText().replace("+", "");
            }
        }else if(e.getSource().equals(subtractionButton)){
            if(state.equals(OperatorStates.DEFAULT)){
                state = OperatorStates.SUBTRACTION;
                resultWindow.setText(resultWindow.getText()+subtractionButton.getText());
                tal1 = resultWindow.getText().substring(0, resultWindow.getText().length() - 1);
            }
        }else if(e.getSource().equals(divisionButton)){
            if(state.equals(OperatorStates.DEFAULT)) {
                state = OperatorStates.DIVISION;
                resultWindow.setText(resultWindow.getText() + divisionButton.getText());
                tal1 = resultWindow.getText().replace("/", "");
            }
        }else if(e.getSource().equals(multiplicationButton)){
            if(state.equals(OperatorStates.DEFAULT)) {
                state = OperatorStates.MULTIPLICATION;
                resultWindow.setText(resultWindow.getText() + multiplicationButton.getText());
                tal1 = resultWindow.getText().replace("*", "");
            }
        }else if(e.getSource().equals(squareRootButton)){
            if(state.equals(OperatorStates.DEFAULT)) {
                state = OperatorStates.ROOT;
                resultWindow.setText(resultWindow.getText() + squareRootButton.getText());
                tal1 = resultWindow.getText().substring(0, resultWindow.getText().length() - 1);
            }
        }else if(e.getSource().equals(exponentButton)){
            if(state.equals(OperatorStates.DEFAULT)) {
                state = OperatorStates.EXPONENT;
                resultWindow.setText(resultWindow.getText() + exponentButton.getText());
                tal1 = resultWindow.getText().substring(0, resultWindow.getText().length() - 1);
            }
        }else if(e.getSource().equals(negativeNumberButton)){
            resultWindow.setText(resultWindow.getText()+negativeNumberButton.getText());
        }else if(e.getSource().equals(swapColorButton)){
            Color color = ColorChanger.getRandomColor();
            northPanel.setBackground(ColorChanger.getRandomColor());
            for(JButton b: buttonArray){
                b.setBackground(color);
            }
        }else if(e.getSource().equals(equalsButton)){

            if(state == OperatorStates.ADDITION){
                    tal2 = resultWindow.getText().substring(resultWindow.getText().indexOf(additionButton.getText()) + 1);
            }
            else if(state == OperatorStates.MULTIPLICATION){
                tal2 = resultWindow.getText().substring(resultWindow.getText().indexOf(multiplicationButton.getText()) + 1);
            }
            else if(state == OperatorStates.DIVISION){
                tal2 = resultWindow.getText().substring(resultWindow.getText().indexOf(divisionButton.getText()) + 1);
            }
            else if(state == OperatorStates.EXPONENT){
                tal2 = resultWindow.getText().substring(resultWindow.getText().indexOf(exponentButton.getText()) + 1);
            }
            else if(state == OperatorStates.ROOT){
                tal2 = resultWindow.getText().substring(resultWindow.getText().indexOf(squareRootButton.getText()) + 1);
            }
            else if(state == OperatorStates.SUBTRACTION){

                for (int i = 0; i < resultWindow.getText().length(); i++) {
                    if(resultWindow.getText().charAt(i) == '-'){
                        sNum = i;
                        counter++;
                    }
                }
                if(counter == 3){
                    tal2 = resultWindow.getText().substring(sNum+1);
                }
                else if (counter == 2) {
                    if(resultWindow.getText().charAt(0) == '-'){
                        tal2 = resultWindow.getText().substring(sNum+1);
                    }
                    else{
                        tal2 = resultWindow.getText().substring(sNum);
                    }
                }
                else if (counter == 1) {
                    tal2 = resultWindow.getText().substring(resultWindow.getText().indexOf(subtractionButton.getText()) + 1);
                }

            }

            String string = StringHandler.replaceCommasWithDots(resultWindow.getText());
            if(string.isEmpty()||state==OperatorStates.DEFAULT){}
            else{
            doubles = StringHandler.getDoubleListFromString(string);
            double1 = Double.parseDouble(tal1);
            double2 = Double.parseDouble(tal2);
            //double1 = doubles.get(0);
            //double2 = doubles.get(1);
            switch (state){
                case DEFAULT -> System.out.println("Ingen operator");
                case ADDITION -> answer = calculatorFacade.calculateAddition(double1,double2);
                case SUBTRACTION -> answer = calculatorFacade.calculateSubtraction(double1,double2);
                case MULTIPLICATION -> answer = calculatorFacade.calculateMultiplication(double1,double2);
                case DIVISION -> answer = calculatorFacade.calculateDivision(double1,double2);
                case ROOT -> answer = calculatorFacade.calculateRoot(double1,double2);
                case EXPONENT -> answer = calculatorFacade.calculateExponent(double1,double2);
            }

            answerAsString = String.valueOf(answer);
            resultWindow.setText(StringHandler.replaceDotsWithCommas(answerAsString));
            System.out.println(answerAsString);
            state = OperatorStates.DEFAULT;

        }
        }
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null, resultWindow.getText() +
                    " går inte att räkna ut.");
            n.printStackTrace();
        }
    }
}
