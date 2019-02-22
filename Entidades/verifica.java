package Entidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class verifica {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users/mathe/Desktop/Lanche/nomes.txt"); // C:\ferramentas.txt
		  List<String[]> lista = new ArrayList<>();    
		    try {

		            FileReader fr = new FileReader("C:\\Users/mathe/Desktop/Lanche/nomes.txt");
		            BufferedReader br = new BufferedReader(fr);

		            String str;
		            while((str = br.readLine()) != null){
		                lista.add(str.split(";"));
		            } 

		     } catch(IOException e) {
		           System.out.println("Arquivo não encontrado!");
		     } 
		     lista.forEach(a -> System.out.println(Arrays.toString(a)));
		
	}

}
