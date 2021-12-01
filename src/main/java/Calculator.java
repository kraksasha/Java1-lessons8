import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private int a;
    private int b;
    private int RES;
    private String allString = "";
    private String stringBeforeZnak = "";
    private String stringAfterZnak = "";
    private char v[];
    private int n = 0;


    public Calculator(){
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300, 360,360);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonSum = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonYmn = new JButton("*");
        JButton buttonDel = new JButton("/");
        JButton buttonRav = new JButton("=");
        JButton buttonZero = new JButton("C");
        setLayout(null);
        button1.setBounds(10,10,50,50);
        add(button1);
        button2.setBounds(60,10,50,50);
        add(button2);
        button3.setBounds(110,10,50,50);
        add(button3);
        button4.setBounds(10,60,50,50);
        add(button4);
        button5.setBounds(60,60,50,50);
        add(button5);
        button6.setBounds(110,60,50,50);
        add(button6);
        button7.setBounds(10,110,50,50);
        add(button7);
        button8.setBounds(60,110,50,50);
        add(button8);
        button9.setBounds(110,110,50,50);
        add(button9);
        button0.setBounds(10,160,50,50);
        add(button0);
        buttonRav.setBounds(60,160,50,50);
        add(buttonSum);
        buttonSum.setBounds(160,10,50,50);
        add(buttonMinus);
        buttonMinus.setBounds(160,60,50,50);
        add(buttonYmn);
        buttonYmn.setBounds(160,110,50,50);
        add(buttonDel);
        buttonDel.setBounds(110,160,50,50);
        add(buttonRav);
        buttonZero.setBounds(160,160,50,50);
        add(buttonZero);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10,210,200,50);
        add(jTextField);


            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        allString = allString + button1.getText();
                        jTextField.setText(allString);
                }
            });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    allString = allString + button2.getText();
                    jTextField.setText(allString);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button3.getText().equals("=")){
                    allString = allString + button3.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button4.getText().equals("=")){
                    allString = allString + button4.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button5.getText().equals("=")){
                    allString = allString + button5.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button6.getText().equals("=")){
                    allString = allString + button6.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button7.getText().equals("=")){
                    allString = allString + button7.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button8.getText().equals("=")){
                    allString = allString + button8.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button9.getText().equals("=")){
                    allString = allString + button9.getText();
                    jTextField.setText(allString);
                }

            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!button0.getText().equals("=")){
                    allString = allString + button0.getText();
                    jTextField.setText(allString);
                }

            }
        });

        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!buttonSum.getText().equals("=")){
                    allString = allString + buttonSum.getText();
                    jTextField.setText(allString);
                }

            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!buttonMinus.getText().equals("=")){
                    allString = allString + buttonMinus.getText();
                    jTextField.setText(allString);
                }

            }
        });

        buttonYmn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!buttonYmn.getText().equals("=")){
                    allString = allString + buttonYmn.getText();
                    jTextField.setText(allString);
                }

            }
        });

        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!buttonDel.getText().equals("=")){
                    allString = allString + buttonDel.getText();
                    jTextField.setText(allString);
                }

            }
        });

        buttonRav.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    v = allString.toCharArray();
                    for (int i = 0; i < v.length; i++){
                        if ((!String.valueOf(v[i]).equals("+")) && (!String.valueOf(v[i]).equals("-"))
                                && (!String.valueOf(v[i]).equals("*")) && (!String.valueOf(v[i]).equals("/"))){
                            stringBeforeZnak = stringBeforeZnak + String.valueOf(v[i]);
                            n = n + 1;
                        } else {
                            for (int j = n + 1; j < v.length; j++){
                                stringAfterZnak = stringAfterZnak + String.valueOf(v[j]);
                            }
                            a = Integer.parseInt(stringBeforeZnak);
                            b = Integer.parseInt(stringAfterZnak);
                            if (String.valueOf(v[i]).equals("+")){
                                RES = sum(a,b);
                            } else if (String.valueOf(v[i]).equals("-")){
                                RES = minus(a,b);
                            } else if (String.valueOf(v[i]).equals("*")){
                                RES = ymnozh(a,b);
                            } else if (String.valueOf(v[i]).equals("/")){
                                RES = delen(a,b);
                            }
                            jTextField.setText("= " + RES);
                            n = 0;
                            break;
                        }
                    }
            }
        });

        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allString = "";
                stringBeforeZnak = "";
                stringAfterZnak = "";
                jTextField.setText(allString);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public int ymnozh(int a, int b){
        return a * b;
    }

    public int delen(int a, int b){
        return a / b;
    }

}
