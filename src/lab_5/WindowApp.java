package lab_5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class WindowApp extends JFrame {
    static JSpinner text1;
    static JSpinner text2;
    static JSpinner text1_1;
    static JSpinner text2_1;
    static JTextField text3;
    static JTextField text3_1;
    static JTextArea text5;
    String s;
    int a1;
    int a2;
    int a3;
    int a4;
    String[] S1;
    int[][] A;
    int[][] B;
    int[][] C;
    public WindowApp(){
        super("Операции над матрицами");
        setBounds(230, 120, 500, 370);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1));
        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(new FlowLayout());
        JButton button1 = new JButton(" Сложение матриц ");
        buttonPanel.add(button1);
        JButton button2 = new JButton("Вычитание матриц");
        buttonPanel.add(button2);
        JButton button3 = new JButton("Умножение матриц");
        buttonPanel.add(button3);
        JButton button4 = new JButton("Выход");
        buttonPanel.add(button4);
        button1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                s = WindowApp.text1.getValue().toString();
                a1=Integer.parseInt(s);

                s = WindowApp.text2.getValue().toString();
                a2=Integer.parseInt(s);

                s = WindowApp.text1_1.getValue().toString();
                a3=Integer.parseInt(s);

                s = WindowApp.text2_1.getValue().toString();
                a4=Integer.parseInt(s);

                s = WindowApp.text2_1.getValue().toString();
                a4=Integer.parseInt(s);
                S1=WindowApp.text3.getText().split(" ");
                A=new int[a1][a2];
                int i=0;
                int i1=0;
                int i2=0;
                while (i<a1)
                {
                    while (i1<a2)
                    {
                        A[i][i1]=Integer.parseInt(S1[i2]);
                        i1=i1+1;
                        i2=i2+1;
                    }
                    i1=0;
                    i=i+1;
                }
                B=new int[a3][a4];
                S1=WindowApp.text3_1.getText().split(" ");
                i=0;
                i1=0;
                i2=0;
                while (i<a3)
                {
                    while (i1<a4)
                    {
                        B[i][i1]=Integer.parseInt(S1[i2]);
                        i1=i1+1;
                        i2=i2+1;
                    }
                    i1=0;
                    i=i+1;
                }
                C=new int[a1][a2];
                C=Matrix.add_sub_matr(A,B,a1,a2,1);
                i=0;
                int k=0;
                i=0;
                i1=0;
                WindowApp.text5.append("Сложение матриц\n");
                while (i<a1)
                {
                    while (i1<a2)
                    {	k=C[i][i1];
                        WindowApp.text5.append(Integer.toString(k)+" ");
                        i1=i1+1;
                    }
                    WindowApp.text5.append("\n");
                    i1=0;
                    i=i+1;
                }
            }
        });

        button2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                s = WindowApp.text1.getValue().toString();
                a1=Integer.parseInt(s);

                s = WindowApp.text2.getValue().toString();
                a2=Integer.parseInt(s);

                s = WindowApp.text1_1.getValue().toString();
                a3=Integer.parseInt(s);

                s = WindowApp.text2_1.getValue().toString();
                a4=Integer.parseInt(s);

                s = WindowApp.text2_1.getValue().toString();
                a4=Integer.parseInt(s);
                S1=WindowApp.text3.getText().split(" ");
                A=new int[a1][a2];
                int i=0;
                int i1=0;
                int i2=0;
                while (i<a1)
                {
                    while (i1<a2)
                    {
                        A[i][i1]=Integer.parseInt(S1[i2]);
                        i1=i1+1;
                        i2=i2+1;
                    }
                    i1=0;
                    i=i+1;
                }
                B=new int[a3][a4];
                S1=WindowApp.text3_1.getText().split(" ");
                i=0;
                i1=0;
                i2=0;
                while (i<a3)
                {
                    while (i1<a4)
                    {
                        B[i][i1]=Integer.parseInt(S1[i2]);
                        i1=i1+1;
                        i2=i2+1;
                    }
                    i1=0;
                    i=i+1;
                }
                C=new int[a1][a2];
                C=Matrix.add_sub_matr(A,B,a1,a2,-1);
                i=0;
                int k=0;
                i=0;
                i1=0;
                WindowApp.text5.append("Вычитание матриц\n");
                while (i<a1)
                {
                    while (i1<a2)
                    {	k=C[i][i1];
                        WindowApp.text5.append(Integer.toString(k)+" ");
                        i1=i1+1;
                    }
                    WindowApp.text5.append("\n");
                    i1=0;
                    i=i+1;
                }
            }
        });

        button3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                s = WindowApp.text1.getValue().toString();
                a1=Integer.parseInt(s);
                s = WindowApp.text2.getValue().toString();
                a2=Integer.parseInt(s);
                s = WindowApp.text1_1.getValue().toString();
                a3=Integer.parseInt(s);
                s = WindowApp.text2_1.getValue().toString();
                a4=Integer.parseInt(s);
                s = WindowApp.text2_1.getValue().toString();
                a4=Integer.parseInt(s);
                S1=WindowApp.text3.getText().split(" ");
                A=new int[a1][a2];
                int i=0;
                int i1=0;
                int i2=0;
                while (i<a1)
                {
                    while (i1<a2)
                    {
                        A[i][i1]=Integer.parseInt(S1[i2]);
                        i1=i1+1;
                        i2=i2+1;
                    }
                    i1=0;
                    i=i+1;
                }
                B=new int[a3][a4];
                S1=WindowApp.text3_1.getText().split(" ");
                i=0;
                i1=0;
                i2=0;
                while (i<a3)
                {
                    while (i1<a4)
                    {
                        B[i][i1]=Integer.parseInt(S1[i2]);
                        i1=i1+1;
                        i2=i2+1;
                    }
                    i1=0;
                    i=i+1;
                }
                C=new int[a1][a2];
                C=Matrix.mul_matr(A,B,a1,a2,a3,a4);
                i=0;
                int k=0;
                i=0;
                i1=0;
                WindowApp.text5.append("Умножение матриц\n");
                while (i<a1)
                {
                    while (i1<a4)
                    {	k=C[i][i1];
                        WindowApp.text5.append(Integer.toString(k)+" ");
                        i1=i1+1;
                    }
                    WindowApp.text5.append("\n");
                    i1=0;
                    i=i+1;
                }
            }
        });
        buttonPanel3.add(buttonPanel);
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new BoxLayout(buttonPanel2,BoxLayout.Y_AXIS));
        JLabel label1=new JLabel("Матрица А");
        buttonPanel2.add(label1);
        JLabel label2=new JLabel("Число строк");
        buttonPanel2.add(label2);
        SpinnerModel sm = new SpinnerNumberModel(1, 1, 5, 1);
        text1=new JSpinner(sm);
        buttonPanel2.add(text1);
        JLabel label3=new JLabel("Число столбцов");
        buttonPanel2.add(label3);
        SpinnerModel sm1 = new SpinnerNumberModel(1, 1, 5, 1);
        text2=new JSpinner(sm1);
        buttonPanel2.add(text2);
        JLabel label4=new JLabel("Элементы");
        buttonPanel2.add(label4);
        text3=new JTextField(10);
        buttonPanel2.add(text3);
        buttonPanel3.add(buttonPanel2);

        JPanel buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(new BoxLayout(buttonPanel4,BoxLayout.Y_AXIS));
        JLabel label1_1=new JLabel("Матрица В");
        buttonPanel4.add(label1_1);
        JLabel label2_1=new JLabel("Число строк");
        buttonPanel4.add(label2_1);
        SpinnerModel sm3 = new SpinnerNumberModel(1, 1, 5, 1);
        text1_1=new JSpinner(sm3);
        buttonPanel4.add(text1_1);
        JLabel label3_1=new JLabel("Число столбцов");
        buttonPanel4.add(label3_1);
        SpinnerModel sm4 = new SpinnerNumberModel(1, 1, 5, 1);
        text2_1=new JSpinner(sm4);
        buttonPanel4.add(text2_1);
        JLabel label4_1=new JLabel("Элементы");
        buttonPanel4.add(label4_1);
        text3_1=new JTextField(10);
        buttonPanel4.add(text3_1);
        buttonPanel3.add(buttonPanel4);

        JPanel buttonPanel5 = new JPanel();
        buttonPanel5.setLayout(new BoxLayout(buttonPanel5,BoxLayout.LINE_AXIS));
        text5=new JTextArea(10,20);
        JScrollPane scrollPane = new JScrollPane(text5);
        buttonPanel5.add(text5);
        buttonPanel3.add(buttonPanel5);
        add(buttonPanel3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        WindowApp app = new WindowApp();
        app.setVisible(true);
    }
}