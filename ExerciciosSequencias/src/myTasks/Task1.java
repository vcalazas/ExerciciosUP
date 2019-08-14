package myTasks;

public class Task1 extends MyTask{

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			// 1 - Imprimir os 30 primeiros valores de uma sequencia de primeiro termo 2 e razão 3
			for(int i = 1; i <= 30; i++) {
				MyTaskUtil.say(( 2 + (i - 1) * 3 )+" - ");
			}
		} catch(Exception e) {
			MyTaskUtil.say("ERROR - TASK1");
		}
	}

}
