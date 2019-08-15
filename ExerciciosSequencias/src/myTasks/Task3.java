package myTasks;

import java.util.Scanner;

public class Task3 extends MyTask{

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			// 3 - Qual é a soma dos 10 primeiros termos de uma sequencia cujos primeiros valores são {a,3a/2,...)?
			Scanner keyboard = new Scanner(System.in);
			MyTaskUtil.say("Informe um numero real para definir o valor inicial: \n");
			float sum = keyboard.nextFloat();
			for(int i = 1; i <= 10; i++) {
				sum = sum + ( (3 * sum) / 2 );
			}
			MyTaskUtil.say("Soma total: "+sum);
		} catch(Exception e) {
			MyTaskUtil.say("ERROR - TASK3");
		}
	}

}