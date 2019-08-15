package Main;

import java.util.Scanner;

import myTasks.MyTask;

public class Main {

	// Github: https://github.com/vcalazas/ExerciciosUP/tree/master/ExerciciosSequencias
	// Aluno: Vitor Gabriel Calazas Dalmolin
	// Matricula: 1914454
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			boolean exit = false;
			Scanner teclado = new Scanner(System.in);
			while(exit == false) {
				String[] menu = {
						"Esculha qual tarefa deve ser realizada:",
						" 1 - 1� exerc�cio;",
						" 2 - 2� exerc�cio;",
						" 3 - 3� exerc�cio;",
						" 4 - 4� exerc�cio;",
						" 0 - Finalizar o programa."
					};
				Utils.say(menu);
				int option = teclado.nextInt();
				Utils.say("\n");
				if(option == 0) {
					exit = true;
					Utils.say("Execu��o do programa finalizado.");
				} else {
					MyTask task = MyTask.build(option);
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
