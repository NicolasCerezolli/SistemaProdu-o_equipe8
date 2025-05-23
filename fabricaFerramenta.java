
package trabalhoEquipe5;
import java.util.*;
	public class fabricaFerramenta { 
		static Scanner entrada = new Scanner (System.in);
		static ArrayList<Integer> setores = new ArrayList<>();
		static ArrayList<Integer> maquinas = new ArrayList<>();
		static ArrayList<Integer> tipoFerramenta = new ArrayList<>();
		static ArrayList<String> consultar = new ArrayList<>();
		//-----------------------------------------------------------------
		public static int cadastrarSetor() {
			int setor = 0;
			System.out.println("Digite o numero para o setor: ");
			setor = entrada.nextInt();
			setores.add(setor);
			System.out.println("setor registrado");
			return 0;		
		}
		//--------------------------------------------------------------------
		public static int cadastrarMaquina() {
			int maquina = 0;
			System.out.println("Digite o numero para a maquina: ");
			maquina = entrada.nextInt();
			maquinas.add(maquina);
			System.out.println("maquina registrada");
			return 0;
			
			
			
			}
		//-----------------------------------------------------------------------	
			public static int ferramentas() {
			int alicate;
			int martelo;
			int chaveFenda;
			/////////////////////
			do {
			System.out.println("Registrar  a Quantidade de Alicates: ");
			alicate= entrada.nextInt();
			if(alicate<0 ){
				 System.out.println("Quantidade Invalida! ");	
			 }
			}while(alicate <0);	
			tipoFerramenta.add(alicate);
            //////////////////////////////////////////	
			do {
			System.out.println("Cadastrar a Quantidade de Martelos:");
			martelo= entrada.nextInt();
			if(martelo <0) {
				 System.out.println("Quantidade Invalida!");
			 	}
			 }while(martelo <0);
			tipoFerramenta.add(martelo);
            ///////////////////////////////////////////	
			do {
			System.out.println("Cadastrar a Quantidade de Chaves de Fendas: ");
			chaveFenda= entrada.nextInt();
			 if(chaveFenda <0) {
				 System.out.println("Quantidade Invalida!");
			  }
			 }while(chaveFenda <0);
			tipoFerramenta.add(chaveFenda);
			/////////////////////////////////////////////////////////////
			 System.out.println("Ferramentas cadastradas");
			 return 0;
		}
	//----------------------------------------------------------------------------			
		public static void mostrarRelatorio() {
		System.out.println("Relatorio da Ultima Semana: ");
		
			
			
			
		}
	//------------------------------------------------------------------------------	
		public static void maquinasOciosas() {
		System.out.println("Maquinas Ociosas: ");
			
			
			
			
			
			
		}
		
	//----------------------------------------------------------------------		
	public static void main(String[] args) {
		int opcao = 0;
		while (opcao !=6) {
		System.out.println("-----MENU-----");
		System.out.println("1- Cadastrar setores");
		System.out.println("2- Cadastrar máquinas e definir ferramenta por máquina");
		System.out.println("3- Cadastrar quantidade de ferramentas produzidas");
		System.out.println("4- Mostrar relatório");
		System.out.println("5- Verificar máquinas inativas");
		System.out.println("6- Encerrar sistema");
			opcao = entrada.nextInt();
			if (opcao<1 || opcao>6) {
				System.out.println("Numero invalido");
			}
			switch (opcao) {
			
			case 1:
				cadastrarSetor();
				
				break;
			case 2:
				cadastrarMaquina();
				ferramentas();
				break;
			case 3:
				
				break;
			case 4:
				mostrarRelatorio();
				break;
			case 5:
				maquinasOciosas();
				break;
				default:
					System.out.println("Saindo. . .");
				
			}
			
		}
		
	entrada.close();
		}
	}
