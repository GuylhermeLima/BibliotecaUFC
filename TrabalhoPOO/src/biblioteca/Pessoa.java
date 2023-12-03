package biblioteca;

public class Pessoa {
	private String nome;
    private String email;
    private long id;
    private String senha;    
    private String cpf;
    private String telefone;
    private String endereco;
    private String dataNascimento;
    private boolean statusAtivo;
    
    //MÉTODOS DE LOGIN DO SISTEMA
    
    public void login() {
    	
    }
    
    public void logoff() {
    	
    }
    
    //OPERAÇÕES PRÓPRIAS DO SISTEMA DE ADMINISTRAÇÃO DOS LIVROS
    
    //CONSULTA OS LIVROS DO SISTEMA
    public void consultarLivro() {
    	
    }
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
    
    public long getId() {
    	return this.id;
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

    public String getDataNascimento() {
        return this.dataNascimento;
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
    
    public void setId(long id) {
    	this.id = id;
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
  
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
  
    public void setStatusAtivo(boolean statusAtivo){
        this.statusAtivo = statusAtivo;
  }

}
