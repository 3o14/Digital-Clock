import java.util.Calendar;
import javax.swing.JLabel;

public class Clock extends Thread{
	private JLabel clock;
	
	public Clock(JLabel clock) {
		this.clock=clock;
	}
	
	public void run() {
		while(true) {
			try {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
			
			String clockText=Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(sec));
					
			clock.setText(clockText);
			sleep(1000);
			}catch(Exception e) {
				return;
			}
		}
	}
}