package trabalhomarcosvinicius;

public class Teste {
	
	public static void main(String[]Args) {
		Aluno alu = new Aluno();
		alu.setNome("João");
		alu.setMatricula(123456);
		alu.setSenha("000");
		System.out.println(alu.getNome()+" "+ alu.getMatricula() +" "+ alu.getSenha());
	}
}
