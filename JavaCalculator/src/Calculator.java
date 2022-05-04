import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double num1 = 0.0;
    private double num2 = 0.0;
    private char operator;

    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonZero;
    private JButton buttonDecimal;
    private JButton buttonEqual;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMul;
    private JButton buttonDiv;
    private JButton buttonDel;
    private JButton buttonClear;

    private JButton[] buttons = new JButton[]{buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonZero,buttonDecimal,
                                        buttonEqual,buttonPlus,buttonMinus,buttonMul,buttonDiv,buttonDel,buttonClear};

    public Calculator() {
        textDisplay.setEditable(false);

        for(JButton button : buttons){
            button.setFocusable(false);
        }

        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + buttonOne.getText();
                textDisplay.setText(btnOneText);
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + buttonTwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });

        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + buttonThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });

        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + buttonFour.getText();
                textDisplay.setText(btnFourText);
            }
        });

        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + buttonFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });

        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + buttonSix.getText();
                textDisplay.setText(btnSixText);
            }
        });

        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + buttonSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });

        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + buttonEight.getText();
                textDisplay.setText(btnEightText);
            }
        });

        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + buttonNine.getText();
                textDisplay.setText(btnNineText);
            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + buttonZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });

        buttonDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }else if(textDisplay.getText().contains(".")) {
                    buttonDecimal.setEnabled(false);
                }else {
                    textDisplay.setText(textDisplay.getText() + ".");
                }
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = '+';
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = '-';
            }
        });

        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = '*';
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num1 + Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operator = '/';
            }
        });

        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator) {
                    case '+':
                        num2 = num1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        num2 = num1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        num2 = num1 * Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        num2 = num1 / Double.parseDouble(textDisplay.getText());
                        break;
                    default:
                        return;
                }
                textDisplay.setText(Double.toString(num2));
                num1 = 0.0;
            }
        });

        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textDisplay.getText();
                textDisplay.setText(text.substring(0, text.length() - 1));
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = 0.0;
                textDisplay.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
