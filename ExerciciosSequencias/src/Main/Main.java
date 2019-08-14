package Main;

import java.util.Scanner;

import myTasks.MyTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			boolean exit = false;
			Scanner teclado = new Scanner(System.in);
			while(exit == false) {
				String[] menu = {
						"Esculha qual tarefa deve ser realizada:",
						" 1 - Progressão aritmética;",
						" 2 - Sequencia S;",
						" 3 - Par ou impar;",
						" 4 - Os 100 valores;",
						" 0 - Sair."
					};
				Utils.say(menu);
				int option = teclado.nextInt();
				Utils.say("\n");
				if(option == 0) {
					exit = true;
					Utils.say("Execução do programa finalizado.");
				} else {
					MyTask task = MyTask.build(option);
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
