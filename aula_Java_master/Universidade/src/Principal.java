import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args)
	{	
		
		
		List<Aluno> lista = CriaLista();
		
		for(Aluno a : lista)
		{
			System.out.println(a.toString());
		}
		
	}
	
	public static List<Aluno> CriaLista()
	{
		List<Aluno> listA = new ArrayList<Aluno>();		
		try
		{
		System.out.print("Numero de alunos : ");
		int n = System.in.read();
		
		for(int cont = 0; cont < n; cont++)
		{	
			System.out.print("Nome do aluno : ");
			String nome = System.console().readLine();
			System.out.print("Cpf do aluno : ");
			String cpf = System.console().readLine();
			System.out.print("RM do aluno : ");
			int rm = System.in.read();
			
			listA.add(new AlunoBuilder().setNome(nome)
										.setCpf(cpf)
										.setRm(rm)
										.Build());
		}
		
		}catch(Exception x)
		{
			
		}
		return listA;
	}

}
