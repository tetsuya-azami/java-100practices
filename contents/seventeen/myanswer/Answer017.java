package contents.seventeen.myanswer;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Answer017 {
	public static void main(String[] args) {
		AtomicLong number = new AtomicLong(0);
		Random random = new Random();
		int forCount = 1000000;

		Thread threadA = new Thread(() -> {
			for (int i = 0; i < forCount; i++) {
				synchronized (number) {
					System.out.println("ThreadA: " + number.get());
				}
			}
		});

		Thread threadB = new Thread(() -> {
			for (int i = 0; i < forCount; i++) {
				synchronized (number) {
					number.set(random.nextLong(2) - 1);
				}
			}
		});

		System.out.println("Start threads");
		threadA.start();
		threadB.start();
	}
}
