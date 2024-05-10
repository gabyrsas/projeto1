package projetojava;

import java.util.InputMismatchException;
import java.util.Scanner;
import projetojava.repository.ProjetoJavaRepository;
import projetojava.controller.ProjetoJavaController;
import java.io.IOException;

public class menu {

	public static void main(String[] args) {
		ProjetoJavaController projetojava = new ProjetoJavaController();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, quantidade, valor;
		String nome;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               CADASTRE SEUS PRODUTOS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Lista de todos os produtos           ");
			System.out.println("            3 - Buscar produtos ID                   ");
			System.out.println("            4 - Quantidade		                     ");
			System.out.println("            5-  Deletar cadastro                     ");
			System.out.println("            6-  Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
		
			
			 try {
	                opcao = leia.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("\nDigite somente valores inteiros!");
	                leia.nextLine();
	                opcao = 0;
	            }

	            if (opcao == 6) {
	                System.out.println("\nBem vindo!!");
	                leia.close();
	                System.exit(0);
	            }

	            switch (opcao) {
	                case 1:
	                    System.out.println("Cadastrar produto ");

	                    System.out.println("Digite o nome do produto: ");
	                    leia.skip("\\R?");
	                    nome = leia.nextLine();
	                    System.out.println("Digite a quantidade do produto: ");
	                    quantidade = leia.nextInt();
	                    keyPress();
	                    break;
	                case 2:
	                    System.out.println("Listar todos os produtos\n\n");
	                    projetojava.listarTodos();
	                    keyPress();
	                    break;
	                case 3:
	                    System.out.println("Procurar produto por ID\n\n");

	                    System.out.println("Digite o ID do produto: ");
	                    numero = leia.nextInt();

	                    projetojava.procurarPorNumero(numero);

	                    keyPress();
	                    break;
	                case 4:

	                    System.out.println("Digite o ID do produto: ");
	                    numero = leia.nextInt();

	                    var buscarProduto = projetojava.buscarNaCollection(numero);

	                    if (buscarProduto != null) {
	                        System.out.println("Digite o nome do produto: ");
	                        leia.skip("\\R?");
	                        nome = leia.nextLine();
	                        System.out.println("Digite a quantidade do produto: ");
	                        quantidade = leia.nextInt();

	        
	                    } else {
	                        System.out.println("O produto não foi encontrado!");
	                    }

	                    keyPress();
	                    break;
	                case 5:
	                    System.out.println("Deletar produto\n\n");
	                
	                    keyPress();
	                    break;
	               default:
	                    
	            	    System.out.println("\nDigite uma opção válida!\n");
	                	keyPress();
	                    break;
	            }
		}
	}
	
	            public static void sobre() {
	            	System.out.println("\n*********************************************************");
	            	System.out.println("Projeto Desenvolvido por: Gabriela Rosa ");
	            	System.out.println("Generation Brasil - ");
	            	System.out.println("https://github.com/gabyrsa");
	            	System.out.println("*********************************************************");
	            	}
	             
				public static void keyPress() {
				
					try {
				
						System.out.println("\n\nPressione Enter para Continuar...");
						System.in.read();
				
					} catch (IOException e) {
				
						System.out.println("Você pressionou uma tecla diferente, tente novamente");
					}
				}
	            }
	                