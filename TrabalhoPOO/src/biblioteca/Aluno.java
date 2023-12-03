package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	
	private List<Aluno> alunos;
	
	public Aluno() {
        alunos = new ArrayList<>();
    }
	
    // AQUI OS ALUNOS PODEM APLICAR UMA CADASTRO NO SISTEMA
	public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    // AQUI OS ALUNOS PODEM APLICAR TER SEU CADASTRO TERMINADO NO SISTEMA SE ATENDER OS REQUISITOS PARA A OPERAÇÃO
    public void removerAluno(long id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }

    //AQUI OS ALUNOS ATUALIZAM DADOS COMO ENDEREÇO, EMAIL, TELEFONE 
    public void alterarDadosAluno(long id, String nome, String senha, String email, String cpf, String telefone, String endereco, String dataNascimento) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                aluno.setNome(nome);
                aluno.setSenha(senha);
                aluno.setEmail(email);
                aluno.setCpf(cpf);
                aluno.setTelefone(telefone);
                aluno.setEndereco(endereco);
                aluno.setDataNascimento(dataNascimento);
                break;
            }
        }
    }
}
