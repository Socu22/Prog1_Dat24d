package MyTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Jframe_Frame implements ActionListener {
    JFrame frame = new JFrame();
    Random random = new Random();
    int[] numbers=new int[10];;
    int numbersSum;


    public void setFrame() {
        frame.setTitle("frame");
        frame.setSize(400,400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
        frame.setLocationRelativeTo(null);

        Button actionButtton = new Button("Action");
        Button resetButton = new Button("Reset");
        Button sumButton = new Button("Sum");
        Button textAreaButton = new Button("Print");
        TextArea textArea = new TextArea(20,20);
        JScrollPane scrollPane =new JScrollPane(textArea);
        Label arrayLabel = new Label("                                                                                                             ");

        frame.add(actionButtton);
        frame.add(resetButton);
        frame.add(sumButton);
        frame.add(textAreaButton);
        frame.add(textArea);
        frame.add(scrollPane);
        frame.add(arrayLabel);




        textAreaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                System.out.println(text);
                JOptionPane.showMessageDialog(textArea,text);
            }
        });
        actionButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame,"Action is pressed");
               String arrayOfRandomNumbersToString = Arrays.toString(randomNumbers(numbers));

                System.out.println("Array: "+arrayOfRandomNumbersToString);
                arrayLabel.setText("Array: "+arrayOfRandomNumbersToString);


            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame,"Reset is pressed");
                String arrayOfResetRandomNumbersToString = Arrays.toString(ResetRandomNumbers(numbers));
                System.out.println("Array: "+arrayOfResetRandomNumbersToString);
                arrayLabel.setText("Array: "+arrayOfResetRandomNumbersToString);



            }


        });
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame,"Sum is pressed");
                String arrayIndexToSum =Integer.toString(SumNumbers(numbersSum));
                System.out.println("Sum: "+arrayIndexToSum);
                arrayLabel.setText(arrayIndexToSum);




            }
        });



    }



    public int[] randomNumbers(int[] numbers){

        for (int i = 0; i < 10 ; i++) {

            numbers[i] = random.nextInt(10);


        }


        return numbers;

    }
    public int[] ResetRandomNumbers(int[] numbers){

        for (int i = 0; i < 10 ; i++) {
            numbers[i] = 0;




        }


        return numbers;
    }

    public int SumNumbers(int numbersSum){
        for (int number : numbers) {
            numbersSum = numbersSum+ number;
            //System.out.println(numbersSum);


        }

        return numbersSum;
    }







    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
