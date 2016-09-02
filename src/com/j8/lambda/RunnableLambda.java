package com.j8.lambda;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() +": "+i);
				}
			}

		};
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() +": "+i);
			}
		});
		Thread t2 = new Thread(()->{for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() +": "+i);
		}});
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
	}
}
