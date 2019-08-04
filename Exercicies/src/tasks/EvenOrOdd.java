package tasks;

import java.util.Scanner;

public class EvenOrOdd extends Tasks {

	@Override
	public void run() {
		try {
			Scanner keyboard = new Scanner(System.in);
			float number = 0;
			Utils.say("Par ou Impar");
			Utils.say("Digite um n�mero para a valida��o:");
			number = keyboard.nextFloat();
			if(number % 2 == 0) {
				Utils.say("Este n�mero � par.");
			} else {
				Utils.say("Este n�mero � impar.");
			}
		} catch(Exception exception) {
			Utils.say("Erro de Execu��o");
			exception.printStackTrace();
		}
	}

}
