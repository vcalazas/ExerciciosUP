package tasks;

import java.util.Scanner;

public class EvenOrOdd extends Tasks {

	@Override
	public void run() {
		try {
			Scanner keyboard = new Scanner(System.in);
			float number = 0;
			Utils.say("Par ou Impar");
			Utils.say("Digite um número para a validação:");
			number = keyboard.nextFloat();
			if(number % 2 == 0) {
				Utils.say("Este número é par.");
			} else {
				Utils.say("Este número é impar.");
			}
		} catch(Exception exception) {
			Utils.say("Erro de Execução");
			exception.printStackTrace();
		}
	}

}
