package Main;

import java.text.Collator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mNames = "Davi,Arthur,Pedro,Gabriel,Bernardo,Lucas,Matheus,Rafael,Heitor,Enzo,Guilherme,Nicolas,Lorenzo,Gustavo,Felipe,Samuel,Jo�oPedro,Daniel,Vitor,Leonardo,Henrique,Theo,Murilo,Eduardo,PedroHenrique,Pietro,Cau�,Isaac,Caio,Vinicius,Benjamin,Jo�o,Lucca,Jo�oMiguel,Bryan,Joaquim,Jo�oVitor,Thiago,Ant�nio,DaviLucas,Francisco,EnzoGabriel,Bruno,Emanuel,Jo�oGabriel,Ian,DaviLuiz,Rodrigo,Ot�vio,Alice,Julia,Isabella,Manuela,Laura,Luiza,Valentina,Giovanna,MariaEduarda,Helena,Beatriz,MariaLuiza,Lara,Mariana,Nicole,Rafaela,Helo�sa,Isadora,L�via,MariaClara,AnaClara,Lorena,Gabriela,Yasmin,Isabelly,Sarah,AnaJulia,Let�cia,AnaLuiza,Melissa,Marina,Clara,Cec�lia,Esther,Emanuelly,Rebeca,AnaBeatriz,Lav�nia,Vit�ria,Bianca,Catarina,Larissa,MariaFernanda,Fernanda,Amanda,Al�cia,Carolina,Agatha,Gabrielly,Zend";
		String[] mStr = sort(mNames.split(","));
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nNameSearch = keyboard.next();
		System.out.println(binSearch(mStr, 0, (mStr.length-1), nNameSearch, 0));
	}
	
	private static String[] sort(String[] str) {
		String temp;
		for (int j = 0; j < str.length; j++) {
	         for (int i = j + 1; i < str.length; i++) {
	            // comparing strings
	            if (str[i].compareTo(str[j]) < 0) {
	               temp = str[j];
	               str[j] = str[i];
	               str[i] = temp;
	            }
	         }
	        // System.out.println(str[j]);
	      }
		return str;
	}

	private static String binSearch(String[] array, int left, int right, String chave, int count) {
		count++;
		if(right >= left ){
			double calculated = (left + (right - left)/2.0);
			int index = arredondar(calculated);//Math.round(asd);
			String s = array[index];
			int int1 = Collator.getInstance().compare(s, chave);
			
			if(s.equals(chave)) {
				return s;
			} else {
				// System.out.println(count+" - Nome: "+ s +": index: "+index+ ";\n calculated: "+ calculated + "; left: "+left+"; right: "+right+"\n==========================================================");
				System.out.println(count+" - Nome: "+ s +"\n==========================================================");
				if(int1 > 0) {
					return binSearch(array, left, (right-1), chave, count);
				} else {
					return binSearch(array, (index+1), right, chave, count);
				}
			}
		}
		return null;
	}

	public static int arredondar ( double num ) {
		if ( ( num - (int)num ) > 0.0 ) {
			num += 1;
		}
		return (int)num;
	}
}
