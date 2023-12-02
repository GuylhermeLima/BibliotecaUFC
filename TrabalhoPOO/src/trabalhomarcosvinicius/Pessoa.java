package trabalhomarcosvinicius;

public class Pessoa {
	  private String nome;
    private String email;
    private String senha;    
    private String cpf;
    private String telefone;
    private String endereco;
    private String dataNacimento;
    private boolean statusAtivo;
    
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
  
    public void setStatusAtivo(boolean statusAtivo){
        this.statusAtivo = statusAtivo;
  }

}
