
import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;

public class GUI extends JFrame {

    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 x 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    private int milanScore = 0;
    private int madridScore = 0;

    GUI() {
        super("Соревнование");
        setLayout(new GridLayout(3, 2));
        setSize(400, 400);
        add(milan);
        add(madrid);
        add(result);
        add(lastScorer);
        add(winner);

        milan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                milanScore++;
                String txt = "Result: " + milanScore + " x " + madridScore;
                result.setText(txt);
                lastScorer.setText("Last Scorer: Milan");
                if(milanScore > madridScore) {
                    winner.setText("Winner: Milan");
                }
                else if (milanScore < madridScore) {
                    winner.setText("Winner: Madrid");
                }
                else {
                    winner.setText("Winner: EQUAL SCORE");
                }
            }
        });

        madrid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                madridScore++;
                String txt = "Result: " + milanScore + " x " + madridScore;
                result.setText(txt);
                lastScorer.setText("Last Scorer: Madrid");
                if(milanScore > madridScore) {
                    winner.setText("Winner: Milan");
                }
                else if (milanScore < madridScore) {
                    winner.setText("Winner: Madrid");
                }
                else {
                    winner.setText("Winner: EQUAL SCORE");
                }

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

}