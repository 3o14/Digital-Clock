import javax.swing.JFrame;
import javax.swing.JLabel;

// 남은 작업: 시계 랜덤한 좌표에 배치하기
// 			그걸 10초마다 반복하기
 
public class RandomDigitalClock extends JFrame {
	public RandomDigitalClock(JLabel clock, Clock ck) {
		int x=(int)(Math.random()*450);
		int y=(int)(Math.random()*450);
		
		clock.setBounds(x, y, 200, 50);
	}
}