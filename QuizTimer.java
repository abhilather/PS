package training.sapient.publicis;

import java.util.Timer;
import java.util.TimerTask;

public class QuizTimer {

	Timer timer;
	boolean flag = false;


	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public QuizTimer(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
	}

	class RemindTask extends TimerTask {
		@Override
		public void run() {
			if (flag == false) {
				System.out.println("TIMEOUT");
				timer.cancel(); // Terminate the timer thread
				System.exit(0);
			} else {
				timer.cancel();
			}

		}
	}


}
