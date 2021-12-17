package ru.mirea.task4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame{
    private JButton labeled=new JButton("AC Milan");
    private JButton button= new JButton("Real Madrid");
    private JLabel res=new JLabel("Result: 0 X 0");
    private JLabel sco=new JLabel("Last Scorer: N/A");
    private JLabel win=new JLabel("Winner: DRAW");
    private int Milan = 0;
    private int Madrid = 0;

    public GUI() {
        super("Футбол");
        this.setBounds(500, 200, 500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,1));
        container.add(labeled);
        container.add(button);
        container.add(res);
        container.add(sco);
        container.add(win);
        labeled.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                Milan++;
                res.setText(String.valueOf(Milan) + " X " + String.valueOf(Madrid));
                setScored(1);
                chooseWinner(Milan, Madrid);
            }
            });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                Madrid++;
                res.setText(String.valueOf(Milan) + " X " + String.valueOf(Madrid));
                setScored(2);
                chooseWinner(Milan, Madrid);
            }
        });
    }
    private void setScored(int a){
        if(a==1){
            sco.setText("Last Scorer: AC Milan");
        }else{
            sco.setText("Last Scorer: Real Madrid");
        }
    }
    private void chooseWinner(int milan,int madrid){
        if(milan>madrid){
            win.setText("Winner: AC Milan");
        }else if (madrid>milan){
            win.setText("Winner: Real Madrid");
        }else{
            win.setText("Winner: DRAW");
        }
    }
}
