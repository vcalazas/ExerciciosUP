package myTasks;

public class Task3 extends MyTask{

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			// 3 - Qual � a soma dos 10 primeiros termos de uma sequencia cujos primeiros valores s�o {a,3a/2,...)?
			int sum = 0;
			for(int i = 1; i <= 10; i++) {
				//sum = sum + ();
				MyTaskUtil.say(( (2 * i) - 1 )+" - ");
			}
		} catch(Exception e) {
			MyTaskUtil.say("ERROR - TASK3");
		}
	}

}