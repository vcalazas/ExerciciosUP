package tasks;

import java.util.Scanner;

public class Averages extends Tasks {

	@Override
	public void run() {
		try {
			Scanner keyboard = new Scanner(System.in);
			float sum = 0;
			Utils.say("Cálculo de média");
			for(int i = 0; i < 4; i++) {
				Utils.say("Digite a nota "+(i+1));
				sum = sum + keyboard.nextFloat();
			}
			float average = sum / 4;
			Utils.say("Média final é: "+average);
		} catch(Exception exception) {
			Utils.say("Erro de Execução");
			exception.printStackTrace();
		}
	}

}
