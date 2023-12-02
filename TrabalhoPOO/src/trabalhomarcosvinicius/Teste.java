package trabalhomarcosvinicius;

public class Teste {
	
	public static void main(String[]Args) {
		Aluno alu = new Aluno();
		alu.setNome("João");
		alu.setId(123456);
		alu.setSenha("000");
		System.out.println(alu.getNome()+" "+ alu.getId() +" "+ alu.getSenha());
	}
}
