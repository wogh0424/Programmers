package dummy;


public class Main {
	public static void main(String[] args) {
		Question ob1 = new Question();
		Timer ob2 = new Timer();
		
		ob1.setTimer(ob2);
		ob2.setQuestion(ob1);
		
		Thread th1 = new Thread(ob1);
		Thread th2 = new Thread(ob2);
		
		th1.start();
		th2.start();
	}
}