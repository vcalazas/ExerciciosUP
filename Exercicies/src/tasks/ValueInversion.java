package tasks;

import java.util.Scanner;

import scope.Utils;

public class ValueInversion extends Tasks {

	@Override
	public void run() {
		try {
			Scanner keyboard = new Scanner(System.in);
			float x   = 0, y  = 0, aux = 0;
			Utils.say("Inversão de valores");
			
			Utils.say("Digite um número para a primeira variavel:");
			x = keyboard.nextFloat();
			
			Utils.say("Digite um número para a segunda variavel:");
			y = keyboard.nextFloat();
			
			aux = x;
			x = y;
			y = aux;
			
			String[] text = {
					"Ordem informada: "+y+" para x e "+x+" para y",
					"Ordem inversa: "+x+" para x e "+y+" para y"
				};
			Utils.say(text);

		} catch(Exception exception) {
			Utils.say("Erro de Execução");
			exception.printStackTrace();
		}
	}

}