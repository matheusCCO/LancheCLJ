package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LancheCLJ {
	public static void main(String[] args) {
		
		List<String> nome = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		List<String> datas = new ArrayList<>();

		Random num =new Random();
		nome.add("Andrey");
		nome.add("Leo Gomes");
		nome.add("Natasha");
		datas.add("01/01/1999");	
		int aux;
		for(int i = 0; i<3;i++) {
			aux = num.nextInt(3);
			while(Existe(list, i, aux)) {
				aux = num.nextInt(3);
			}
			list.add(aux);
		}
		System.out.println("Lanche da tarde: "+datas.get(0));
		for(int i = 0; i<3; i++) {
			
			System.out.print(nome.get(list.get(i))+", ");
		}
	}
	

	private static boolean Existe(List<Integer> list, int tam, int valor) {
		for(int i = 0; i<tam;i++) {
			if(list.get(i)==valor) {
				return true;
			}
		}
		return false;
	}
}

