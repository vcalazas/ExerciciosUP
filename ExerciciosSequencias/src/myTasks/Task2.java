package myTasks;

public class Task2 extends MyTask{

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			// 2 - Dado que a sequencia S é iterada de acordo com an = 2n-1.  Imprima os 10 primeiros valores
			int an = 1;
			for(int i = 1; i <= 10; i++) {
				an = 2 * 2 * an-1;
				MyTaskUtil.say( an+( i == 10 ? "" : " - " ));
			}
		} catch(Exception e) {
			MyTaskUtil.say("ERROR - TASK2");
		}
	}

}