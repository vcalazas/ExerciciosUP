package myTasks;

import java.util.Scanner;

public class Task4 extends MyTask{

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			// 4 - Imprima 100 os valores da sequencia dada por
			// a2 =  a1 * q
			// a3 = a2 + q
			
			
			Scanner keyboard = new Scanner(System.in);
			
			MyTaskUtil.say("Informe um numero real para definir o valor inicial: \n");
			float last = keyboard.nextFloat();
			
			MyTaskUtil.say("Informe um numero real para definir a constante: \n");
			float q =  keyboard.nextFloat();
			
			MyTaskUtil.say("Número inicial: "+last+", constante definida: "+q+".\n","Inicio da sequencia:\n" );
			for(int i = 1; i <= 100; i++) {
				MyTaskUtil.say(last+" - ");
				last = last * q;
			}
		} catch(Exception e) {
			MyTaskUtil.say("ERROR - TASK4");
		}
	}
}
