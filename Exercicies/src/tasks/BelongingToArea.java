package tasks;

import java.util.Scanner;

import scope.Utils;

public class BelongingToArea  extends Tasks {

	@Override
	public void run() {
		try {
			Scanner keyboard = new Scanner(System.in);
			float x   = 0, y  = 0, aux = 0;
			Utils.say("Pertencente a área");
			
			Utils.say("Digite um número para x:");
			x = keyboard.nextFloat();
			
			Utils.say("Digite um número para y:");
			y = keyboard.nextFloat();
			
			float res = ((x*x)+(y*y));
			
			if(x > 0 && res < 1) {
				Utils.say("As coordenadas informadas estão dentro da área.");
			} else {
				Utils.say("As coordenadas informadas não estão dentro da área.");
			}
		} catch(Exception exception) {
			Utils.say("Erro de Execução");
			exception.printStackTrace();
		}
	}

}