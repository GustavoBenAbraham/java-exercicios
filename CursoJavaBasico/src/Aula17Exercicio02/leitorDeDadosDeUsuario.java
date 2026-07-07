package Aula17Exercicio02;

import java.util.Scanner;

public class leitorDeDadosDeUsuario {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  String usuario, senha;
	  
	  do {
		    System.out.println("Digite o nome de usuario: ");
		    usuario = scan.nextLine();
		    
		    System.out.println("Digite a senha: ");
		    senha = scan.nextLine();
		    
		    if (senha.equals(usuario)) {
		        System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
		    }
		} while (senha.equals(usuario));

		System.out.println("Cadastro realizado com sucesso!");
		
		scan.close();
		return;
	  
	  
	  
		
		
		
		
		

	}

}
