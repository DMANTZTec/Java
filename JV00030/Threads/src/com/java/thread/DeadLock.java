package com.java.thread;

public class DeadLock {
	String s1="Java";
	String s2="Python";
	Thread t1=new Thread() {
		public void run() {
			while(true) {
				synchronized(s1) {
					try {
						System.out.println(Thread.currentThread().getName()+"locked"+s1);
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(s2) {
						System.out.println(Thread.currentThread().getName()+"locked"+s2);
						System.out.println( s1+s2);
					}
				}
			}
		}
	};
	Thread t2=new Thread() {
		public void run() {
			while(true) {
				synchronized(s2) {
					try {
						System.out.println(Thread.currentThread().getName()+"locked"+s2);
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(s1) {
						System.out.println(Thread.currentThread().getName()+"locked"+s1);
						System.out.println( s1+s2);
					}
				}
			}
		}
	};
	public static void main(String[] args) {
		
		DeadLock obj=new DeadLock();
		obj.t1.start();
		obj.t2.start();
	}

}
