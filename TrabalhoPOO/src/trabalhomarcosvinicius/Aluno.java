package trabalhomarcosvinicius;


public class Aluno {
    private String nome;
    private long matricula;
    private String email;
    private String senha;    
    private String cpf;
    private String telefone; //ADICIONAR AO DIAGRAMA
    private String endereco;
    private String dataNacimento;
    private boolean statusAtivo;
        
    //METODOS PARA LOGIN E LOGOFF NO SISTEMA
    public void loginAluno() {
        
    }

    public void logoffAluno() {
        
        
    }
    
    
    // AQUI OS ALUNOS PODEM APLICAR UMA CADASTRO NO SISTEMA
    public void cadastarAluno() {
        
    }
    // AQUI OS ALUNOS PODEM APLICAR TER SEU CADASTRO TERMINADO NO SISTEMA SE ATENDER OS REQUISITOS PARA A OPERAÇÃO
    public void removerAluno() {
        
    }
    //AQUI OS ALUNOS ATUALIZAM DADOS COMO ENDEREÇO, EMAIL, TELEFONE 
    public void alterarDadosAluno() {
        
    }
    
    //OPERAÇÕES PRÓPRIAS DO SISTEMA DE ADMINISTRAÇÃO DOS LIVROS
    
    //SOLICITA O EMPRESTIMO ONLINE PARA PEGAR NO DIA
    public void solicitarEmprestimo() {
        
    }
    // RESERVA PARA UMA DATA FUTURA
    public void reservarLivro() {
        
    }
    
    //ESTÁ PRÓXIMO DA DATA DE DEVOLUÇÃO E PRETENDE MANTER O LIVRO POR MAIS TEMPO
    public void renovarEmprestimo() {
        
    }
    
    //GETTERS
    public String getNome() {
        return this.nome;
    }

    public long getMatricula() {
        return this.matricula;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getDataNacimento() {
        return this.dataNacimento;
    }

    public boolean getStatusAtivo() {
        return this.statusAtivo;
    }
    
    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public void setStatusAtivo(boolean statusAtivo) {
        this.statusAtivo = statusAtivo;
    }
    
    
}
