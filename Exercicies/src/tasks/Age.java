package tasks;

import java.util.Scanner;

public class Age extends Tasks {

	@Override
	public void run() {
		try {
			Scanner teclado = new Scanner(System.in);
			
			Utils.say("Diga a sua idade.");
			int age = teclado.nextInt();
			
			if(age > 17) {
				Utils.say("� maior de idade.");
			} else {
				Utils.say("� menor de idade.");
			}
		} catch(Exception exception) {
			Utils.say("Erro de Execu��o");
			exception.printStackTrace();
		}
	}
	
}
