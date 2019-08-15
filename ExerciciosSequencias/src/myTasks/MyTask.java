package myTasks;

public abstract class MyTask {
	
	public static final int TASK1 = 1;
	public static final int TASK2 = 2;
	public static final int TASK3 = 3;
	public static final int TASK4 = 4;
	
	public static MyTask build(int who) {
		try {
			switch (who) {
			case TASK1: 
				return new Task1();
			case TASK2: 
				return new Task2();
			case TASK3: 
				return new Task3();
			case TASK4: 
				return new Task4();

			default:
				return null;
			}
		} catch(Exception e) {
			return null;
		}
	}
	
	public abstract void run();

}
