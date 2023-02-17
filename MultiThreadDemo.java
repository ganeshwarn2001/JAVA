package collections;

import java.util.Iterator;

public class MultiThreadDemo {

		//                Multithreding or Concurrent Programming
		// process -> application running environment 
		// multiprocessing -> running multiple softwares at the same time
		// Thread -> single task or job
		// Thread also known as light weight process
		
		// how to create thread in java
		// by extending Thread class
		// by implementing Runnable Interface

		public static void main(String[] args) {
			
			System.out.println(Thread.currentThread().getName());

			ThreadClassEx t = new ThreadClassEx();
			t.setName("class");
			t.start();
			
			RunnableEx r = new RunnableEx();
			
			Thread t2 = new Thread(r);
			t2.setName("interface");
			t2.start();
		}

	}
