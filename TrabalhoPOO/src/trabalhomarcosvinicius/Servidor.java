package trabalhomarcosvinicius;

public class Servidor {
    private String nome;
    private long sipac;
    private String email;
    private String senha;    
    private String cpf;
    private String endereco;
    private String tefelone;
    private String dataNacimento;
    private String dataEfetivacao;
    private boolean statusAtivo;
        
    //METODOS PARA LOGIN E LOGOFF NO SISTEMA
       
    public void loginServidor() {
        
    }
    
    public void logoffServidor() {
        
        
    }
    
    // AQUI OS SERVIDORES PODEM APLICAR UMA CADASTRO NO SISTEMA

    public void cadastarServidor() {
        
    }
    public void removerServidor() {
        
    }
    public void alterarDadosServidor() {
        
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

    public long getSipac() {
        return this.sipac;
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

    public String getEndereco() {
        return this.endereco;
    }

    public String getTefelone() {
        return this.tefelone;
    }

    public String getDataNacimento() {
        return this.dataNacimento;
    }

    public String getDataEfetivacao() {
        return this.dataEfetivacao;
    }

    public boolean getStatusAtivo() {
        return this.statusAtivo;
    }
    
    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSipac(long sipac) {
        this.sipac = sipac;
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

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTefelone(String tefelone) {
        this.tefelone = tefelone;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public void setDataEfetivacao(String dataEfetivacao) {
        this.dataEfetivacao = dataEfetivacao;
    }

    public void setStatusAtivo(boolean statusAtivo) {
        this.statusAtivo = statusAtivo;
    }
    
    
}
