package myTasks;

public class Task2 extends MyTask{

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			// 2 - Dado que a sequencia S é iterada de acordo com an = 2n-1.  Imprima os 10 primeiros valores
			for(int i = 1; i <= 10; i++) {
				MyTaskUtil.say(( (2 * i) - 1 )+" - ");
			}
		} catch(Exception e) {
			MyTaskUtil.say("ERROR - TASK2");
		}
	}

}