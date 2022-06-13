package hust.soict.dsai.aims;

public class MemoryDaemon implements Runnable{

	long memory_used = 0;
	
	@Override
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		
		while (true) {
			used = rt.totalMemory() - rt.freeMemory();
			if (used != memory_used) {
				System.out.println("\tMemory used = " + used);
				memory_used = used;
			}
		}
		
	}

}
