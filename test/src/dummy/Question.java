package dummy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question implements Runnable {
	private int input = 0;
	private int num1, num2, answer;
	private Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	boolean complete = false;
	Timer timer;
	ArrayList<String> list = new ArrayList<String>();

	public boolean isComplete() {
		return complete;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public Question() {
		num1 = ran.nextInt(10) + 1;
		num2 = ran.nextInt(10) + 1;
		answer = num1 + num2;
	}

	@Override
	public void run() {
		System.out.printf("%d + %d = ", num1, num2);
		input = Integer.parseInt(sc.nextLine());
		complete = true;
		if (timer.isOver()) { // isOver이 true니까 실행
			System.out.println("시간 초과");
		} else if (answer != input) {
			System.out.println("오답");
		} else {
			System.out.println("정답");
		}
		sc.close();
	}
}
