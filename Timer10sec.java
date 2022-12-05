import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer10sec extends JFrame {
	private Timer timer;
	private JLabel clock = new JLabel();
	private Clock ck;
	
	public Timer10sec() {
		setTitle("10초마다 랜덤위치로 이동하는 디지털 시계");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		ck = new Clock(clock);
		add(clock);
		timer = new Timer();
		timer.schedule(timerTask, 0, 10000);
		
		ck.start();			
		setVisible(true);
		setSize(500,500);
	}
	
	TimerTask timerTask = new TimerTask() {
		public void run() {
			new RandomDigitalClock(clock, ck);
		}
	};
}
