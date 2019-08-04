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
						" 1 - validação de idade;",
						" 2 - Cálculo de médias;",
						" 3 - Par ou impar;",
						" 4 - Inversão de valores;",
						" 5 - Pertencente a área;",
						" 0 - Sair."
					};
				Utils.say(menu);
				int option = teclado.nextInt();
				Utils.say("\n");
				if(option == 0) {
					exit = true;
					Utils.say("Execução do programa finalizado.");
				} else {
					Tasks task = Tasks.build(option);
					if(task == null) {
						Utils.say("tarefa não existente.");
					} else {
						task.run();
					}
				}
				Utils.say("\n");
			}
			teclado.close();
		} catch(Exception exception) {
			Utils.say("Erro de Execução");
			exception.printStackTrace();
		}
	}

}
