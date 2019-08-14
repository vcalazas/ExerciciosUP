package tasks;

import java.util.Scanner;

public class MyTask {
	
	public static void tarefa1() {
		for(int i = 2; i <= 100; i = i + 2) {
			//if(i % 2 == 0) {
				Utils.say(i+"");
			//}
		}
	}
	
	public static void tarefa2() {
		for(int i = 100; i > 0; i--) {
			if(i % 2 != 0) {
				Utils.say(i+"");
			}
		}
	}
	
	public static void tarefa3() {
		for(int i = 0; i <= 320; i++) {
			if(i % 4 == 0) {
				Utils.say("###");
			}
			else {
				Utils.say(i);
			}
		}
	}
	
	public static void tarefa4() {
		int j = 3;
		for(int i = 3; i <= 250; i++) {
			Utils.say(j);
			j = j + 5;
		}
	}
	
	public static void tarefa5() {
		try {
			Scanner keyboard = new Scanner(System.in);
			int i = keyboard.nextInt();
			int j = keyboard.nextInt();
			for(int o = ( i > j ? i : j ); o >= 0; o--) {
				Utils.say(o);
			}
			keyboard.close();
		} catch(Exception e) {}
	}
	
	public static void tarefa6() {
		try {
			Scanner keyboard = new Scanner(System.in);
			int i = keyboard.nextInt();
			int j = keyboard.nextInt();
			if(i > j) {
				for(int o = i; o >= j; o--) {
					Utils.say(o);
				}
			} else {
				for(int o = i; o <= j; o++) {
					Utils.say(o);
				}
			}
			keyboard.close();
		} catch(Exception e) {}
	}
	
	public static void tarefa7() {
		try {
			Scanner keyboard = new Scanner(System.in);
			int i = keyboard.nextInt();
			fun(i);
			keyboard.close();
		} catch(Exception e) {}
	}
	
	private static void fun(int i) {
		int o = 0, p = 1;
		while( o < i ) {
			Utils.say(o);
			int f = o+p;
			o = p;
			p = f;
		}
		
	}
	
}