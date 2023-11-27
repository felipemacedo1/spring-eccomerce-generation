package suplementos;

import java.util.Scanner;

import suplementos.model.Creatina;
import suplementos.model.WheyProtein;
import suplementos.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int option;
		
		// Teste da Classe WHEY PROTEIN (int id , String nomeProduto, float produtopreco, float peso)
				WheyProtein wh1 = new WheyProtein(123,"MAX TITANIUM",158,10);
				wh1.visualizar();
				wh1.getProdutopreco();
				wh1.visualizar();
				wh1.getPeso();
				wh1.visualizar();
		
				// Teste da Classe CREATIN (int id , String nomeProduto, float produtopreco, float peso)
				WheyProtein cr1 = new WheyProtein(123,"MAX TITANIUM",158,10);
				cr1.visualizar();
				cr1.getProdutopreco();
				cr1.visualizar();
				cr1.getPeso();
				cr1.visualizar();
		
		
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
							 + "************************************************************************");
			System.out.println("                                                                       *");
			System.out.println("                      Macedo Suplementos                               *");
			System.out.println("                                                                       *");
			System.out.println("************************************************************************");
			System.out.println("                                                                       *");
			System.out.println("        1 - Adicionar Produto                                          *");
			System.out.println("        2 - Listar todos os Produto                                    *");
			System.out.println("        3 - Buscar Produto por ID                                      *");
			System.out.println("        4 - Atualizar Produto no Estoque                               *");
			System.out.println("        5 - Apagar produto no estoque                                  *");
			System.out.println("                                                                       *");
			System.out.println("        0 - Sair                                                       *");
			System.out.println("                                                                       *");
			System.out.println("**********************?*************************************************");
			System.out.println("Entre com a opção desejada:                                            *");
			option = leia.nextInt();
			System.out.println("                                                                       *"+ Cores.TEXT_RESET);
			
			if (option == 0) {
				System.out.println( Cores.TEXT_WHITE_BOLD + "\n Macedo Suplementação, Ficar maromba é nossa missão");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (option) {
					case 1:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Adicionar Produto \n\n");
						
						break;
					case 2:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Listar todos os Produto\n\n");
						
						break;
					case 3:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Buscar Produto por ID\n\n");
					
						break;
					case 4:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");
					
						break;
					case 5:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Atualizar Produto no Estoque\n\n");
					
						break;
	
					default:
						System.out.println( Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
						
						break;	
			}
		}
	}

	private static void sobre() {
		System.out.println("\n**********************************************");
		System.out.println("                                            ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Felipe Macedo - felipealexandrej@gmail.com");
		System.out.println("https://github.com/FelipeAJdev");
		System.out.println("\n**********************************************");
		
	}
}

