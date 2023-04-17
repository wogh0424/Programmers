package dummy;

public class Timer implements Runnable {
	private int second = 5;
	Question question;
	boolean over = false;
	

	public void setQuestion(Question question) {
		this.question = question;
	}
	public boolean isOver() {
		return over;
	}
	@Override
	public void run() {
		try {
			for (int i = second; question.isComplete()== false && i != -1; i--) {
				Thread.sleep(1000);
				System.out.printf("[%02d : %02d]\n", i / 60, i % 60);
			}
			over = true;
		} catch (InterruptedException e) {
		}
		
	}
	

}
