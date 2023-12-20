package contents.seventeen.myanswer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class FixedAnswer017 {
	public static void main(String[] args) throws InterruptedException {
		int count = 1_000_000;
		CountDownLatch latch = new CountDownLatch(2);
		ExecutorService es = Executors.newFixedThreadPool(2);
		AtomicLong atom = new AtomicLong();

		System.out.println(Thread.currentThread().getName());

		// threadA
		es.submit(() -> {
			for (int i = 0; i < count; i++) {
				System.out.println(Thread.currentThread().getName());
				if (i % 2 == 0) {
					atom.set(0);
				} else {
					atom.set(-1);
				}
			}
			latch.countDown();
		});

		// threadB
		es.submit(() -> {
			for (int i = 0; i < count; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(atom.get());
			}
			latch.countDown();
		});

		latch.await();
		es.shutdown();
	}
}
