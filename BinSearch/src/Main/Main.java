package Main;

import java.text.Collator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mNames = "Davi,Arthur,Pedro,Gabriel,Bernardo,Lucas,Matheus,Rafael,Heitor,Enzo,Guilherme,Nicolas,Lorenzo,Gustavo,Felipe,Samuel,Jo�o Pedro,Daniel,Vitor,Leonardo,Henrique,Theo,Murilo,Eduardo,Pedro Henrique,Pietro,Cau�,Isaac,Caio,Vinicius,Benjamin,Jo�o,Lucca,Jo�o Miguel,Bryan,Joaquim,Jo�o Vitor,Thiago,Ant�nio,Davi Lucas,Francisco,Enzo Gabriel,Bruno,Emanuel,Jo�o Gabriel,Ian,Davi Luiz,Rodrigo,Ot�vio,Alice,Julia,Isabella,Manuela,Laura,Luiza,Valentina,Giovanna,Maria Eduarda,Helena,Beatriz,Maria Luiza,Lara,Mariana,Nicole,Rafaela,Helo�sa,Isadora,L�via,Maria Clara,Ana Clara,Lorena,Gabriela,Yasmin,Isabelly,Sarah,Ana Julia,Let�cia,Ana Luiza,Melissa,Marina,Clara,Cec�lia,Esther,Emanuelly,Rebeca,Ana Beatriz,Lav�nia,Vit�ria,Bianca,Catarina,Larissa,Maria Fernanda,Fernanda,Amanda,Al�cia,Carolina,Agatha,Gabrielly,Zend";
		String[] mStr = sort(mNames.split(","));
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nNameSearch = keyboard.next();
		System.out.println(binSearch(mStr, 0, mStr.length, nNameSearch, 0));
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
			float asd = (left + (right - left)/2);
			int index = Math.round(asd);
			String s = array[index];
			int int1 = Collator.getInstance().compare(s, chave);
			
			if(s.equals(chave)) {
				return s;
			} else {
				System.out.println(s+": "+count+"; Index: "+ index + "; asd: "+ asd + "; left: "+left+"; right: "+right);
				if(int1 > 0) {
					return binSearch(array, left, (right-1), chave, count);
				} else {
					return binSearch(array, (index+1), right, chave, count);
				}
			}
		}
		return null;
	}
}
