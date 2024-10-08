import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main implements ActionListener {

    JFrame frame = new JFrame();
    JLabel timeLabel = new JLabel();
    JButton startbutton = new JButton("START");
    JButton resetbutton = new JButton("RESET");
    Font font = new Font("Times New Roman", Font.PLAIN, 20);

    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean start = false;
    
    String secondString = String.format("%02d", seconds);
    String minuteString = String.format("%02d", minutes);
    String hourString = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 1000;
            hours = (elapsedTime/3600000);
            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            secondString = String.format("%02d", seconds);
            minuteString = String.format("%02d", minutes);
            hourString = String.format("%02d", hours);
            timeLabel.setText(hourString + ":" + minuteString + ":" + secondString);


        }
    });

    Main(){
        timeLabel.setText(hourString + ":" + minuteString + ":" + secondString);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        timeLabel.setFont(font);
        timeLabel.setBounds(100,100,200,50);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        frame.setLayout(null);
        timeLabel.setOpaque(true);

        startbutton.setBounds(100,200,100,50);
        startbutton.setFont(font);
        startbutton.setFocusable(false);
        startbutton.addActionListener(this);

        resetbutton.setBounds(200,200,100,50);
        resetbutton.setFont(font);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        frame.add(timeLabel);
        frame.add(startbutton);
        frame.add(resetbutton);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startbutton) {
            if (start==false){
                start = true;
                startbutton.setText("STOP");
                start();
            }else{
                start = false;
                startbutton.setText("START");
                stop();
            }
        }

        if (e.getSource() == resetbutton) {
            start = false;
            startbutton.setText("START");
            reset();
        }

    }
    void start(){
        timer.start();

    }
    void stop(){
        timer.stop();
    }

    void reset(){
        stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        secondString = String.format("%02d", seconds);
        minuteString = String.format("%02d", minutes);
        hourString = String.format("%02d", hours);
        timeLabel.setText(hourString + ":" + minuteString + ":" + secondString);
    }

    public static void main(String[] args) {
        new Main();
    }
}