package tasks;

public abstract class Tasks {

	public static final int TASK_AGE = 1;
	public static final int TASK_AVERAGES = 2;
	public static final int TASK_EVEN_OR_ODD = 3;
	public static final int TASK_VALUE_INVERSION = 4;
	public static final int TASK_BELONGING_TO_AREA = 5;
	
	public static Tasks build(int who) {
		try {

			switch (who) {
			case Tasks.TASK_AGE:
				return new Age();
				
			case Tasks.TASK_AVERAGES:
				return new Averages();
				
			case Tasks.TASK_EVEN_OR_ODD:
				return new EvenOrOdd();
				
			case Tasks.TASK_VALUE_INVERSION:
				return new ValueInversion();
				
			case Tasks.TASK_BELONGING_TO_AREA:
				return new BelongingToArea();

			default:
				return null;
			}

		} catch (Exception exception) {
			return null;
		}
	};
	
	public abstract void run();

}
