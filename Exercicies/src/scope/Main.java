package scope;

import java.util.Scanner;

import tasks.Tasks;

public class Main {

	public static void main(String[] args) {
		try {
			boolean exit = false;
			Scanner teclado = new Scanner(System.in);
			while(exit == false) {
				String[] menu = {
						"Esculha qual tarefa deve ser realizada:",
						" 1 - valida��o de idade;",
						" 2 - C�lculo de m�dias;",
						" 3 - Par ou impar;",
						" 4 - Invers�o de valores;",
						" 5 - Pertencente a �rea;",
						" 0 - Sair."
					};
				Utils.say(menu);
				int option = teclado.nextInt();
				Utils.say("\n");
				if(option == 0) {
					exit = true;
					Utils.say("Execu��o do programa finalizado.");
				} else {
					Tasks task = Tasks.build(option);
					if(task == null) {
						Utils.say("tarefa n�o existente.");
					} else {
						task.run();
					}
				}
				Utils.say("\n");
			}
			teclado.close();
		} catch(Exception exception) {
			Utils.say("Erro de Execu��o");
			exception.printStackTrace();
		}
	}

}
