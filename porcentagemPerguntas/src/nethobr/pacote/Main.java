package nethobr.pacote;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner ( System.in );
		
		System.out.print("Informe a quantidade das perguntas: ");
		int qtd = input.nextInt();	
		
		input.nextLine();
		
		Pergunta [] resposta = new Pergunta [qtd];
		
		System.out.println();
		
		for (int i = 0; i < resposta.length; i++)
		{		
			System.out.println ("Pergunta "+ (i + 1));
			System.out.println ("Quantidade opção 1:");
			int s = input.nextInt();
			System.out.println ("Quantidade opção 2:");
			int n = input.nextInt();
			System.out.println ("Quantidade sem resposta:");
			int sem = input.nextInt();
			
			Pergunta res = new Pergunta ();
			res.numPergunta = i + 1;
			res.sim = s;
			res.nao = n;
			res.noResp = sem;
			
			resposta [i] = res;
			System.out.println();
		}	//fim for
		
		System.out.println("------------------");
		
		for(int i = 0; i < resposta.length; i++)
		{
			Pergunta a = resposta [i];
			System.out.println("Nº pergunta: "+ a.numPergunta);
			System.out.println("Quantidade: "+ a.qtdResp());
			System.out.println("Opção 1: "+ a.getPercentS() +"%");
			System.out.println("Opção 2: "+ a.getPercentN() +"%");
			System.out.println("Sem resposta: "+ a.getPercentResp() +"%");
			System.out.println();
		}	//fim for
		
		input.close();
	}	//fim método main
}	//fim main
