package tasks;

import java.util.Scanner;

import scope.Utils;

public class BelongingToArea  extends Tasks {

	@Override
	public void run() {
		try {
			Scanner keyboard = new Scanner(System.in);
			float x   = 0, y  = 0, aux = 0;
			Utils.say("Pertencente a �rea");
			
			Utils.say("Digite um n�mero para x:");
			x = keyboard.nextFloat();
			
			Utils.say("Digite um n�mero para y:");
			y = keyboard.nextFloat();
			
			float res = ((x*x)+(y*y));
			
			if(x > 0 && res < 1) {
				Utils.say("As coordenadas informadas est�o dentro da �rea.");
			} else {
				Utils.say("As coordenadas informadas n�o est�o dentro da �rea.");
			}
		} catch(Exception exception) {
			Utils.say("Erro de Execu��o");
			exception.printStackTrace();
		}
	}

}