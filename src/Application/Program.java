package Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o diretorio dos arquivos: ");
		String path = sc.nextLine();
		
	 
		File file = new File(path);
		
		
		if(file.exists()) {
			System.out.println("O arquivo Existe");
			double bytes =  file.length();  
			String name = file.getName();
			
			System.out.println("Tamanho: " + bytes);
			System.out.println("Nome do arquivo: " + name);
			
			System.out.println();
			
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}
		    catch(IOException e) {
				System.out.println("Arquivo nao existente");
			}
		}else {
			System.out.println("O arquivo não existe!");
		}
		

	}

}
