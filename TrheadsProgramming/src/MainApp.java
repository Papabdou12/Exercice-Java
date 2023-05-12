
public class MainApp {
	
//	Cycle d'un  Thread
//	 -New: Creation of a new Thread
//	-Runnable: ready to be executed
//	-Started: our Thread is running
//	-Break/Pause: The  Thread break the execution
//	-Terminated/ End : end of the Tread 

	

	public static void main(String[] args) throws InterruptedException  {
		//Start task 1
		Threads1 th= new Threads1();
		th.start();
		//join: bloc l'excecution de notre application
		// wait permettre de bloquer l'execution du thread
		th.wait();
		Thread.yield(); //permet de liberer le processeur du thread
		//Start task 2
		System.out.println("\n Start Task 2");
		for(int i = 51; i<101; i++) {
			System.out.println(i+ " ");
		}
		System.out.println("\n End Task 2");

	}

}
