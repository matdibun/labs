import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockWriter extends JPanel {

    private final int WIDTH;

    LocalTime now = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    String timeString = now.format(formatter);

    public ClockWriter(int w) {
        WIDTH = w;
        JFrame frame = new JFrame();
        // 자신(패널)을 프레임에 끼우기
        frame.getContentPane().add(this);
        // 프레임 만들어 보여주기
        frame.setTitle(timeString);
        frame.setSize(WIDTH, WIDTH);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        // 바탕은 흰색으로
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, WIDTH);
        // 현재 시간 + 시침, 분침 각도 계산
        int minutes_angle = 90 - now.getMinute() * 6;
        int hours_angle = 90 - now.getHour() * 30;
        // 시계 크기 설정
        int x = 50;
        int y = 50;
        int diameter = 100;
        // 시계 판 그리기
        g.setColor(Color.white);
            g.drawOval(x, y, diameter, diameter);

        g.setColor(Color.white);
        g.fillArc(x+25, x+25, diameter-50, diameter-50, 0, 360);

        // 분침 그리기
        g.setColor(Color.red);
        g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 5);
        // 시침 그리기
        g.setColor(Color.blue);
        g.fillArc(x+20, x+20, diameter-40, diameter-40, hours_angle, -8);

        g.setColor(Color.YELLOW);
        g.fillArc(50, 55, 100, 90, 0, 30);

        g.setColor(Color.green);
        g.fillArc(50, 85, 100, 30, 45, 30);

//        g.setColor(Color.pink);
//        g.fillArc(50, 50, 100, 100, 0, 30);



    }

    public static void main(String[] args) {

        new ClockWriter(500);
    }
}