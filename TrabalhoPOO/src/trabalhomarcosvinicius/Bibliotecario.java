package trabalhomarcosvinicius;


public class Bibliotecario {

    private String nome;
    private long idBibliotecario;
    private String departamento; 
    private boolean statusAtivo; 
    private String email;
    private String senha; //ADICIONAR AO DIAGRAMA
    private String dataEfetivacao;
    private Multa multa; //ADICIONAR AO DIAGRAMA
    
    //METODOS PARA LOGIN E LOGOFF DO OPERADOR 
    public void login() {
        
        
    }

    public void logoff() {
        
        
    }
    //CRUD LIVRO
    public void adicionarLivros(){
         
        
    }
    public void alterarLivro() {
        
        
    }
    public void removerLivro() {
        
        
    }

    //OPERAÇÕES PRÓPRIAS DO SISTEMA DE ADMINISTRAÇÃO DOS LIVROS
    
    //OPERAÇAO DE EMPRESTIMO DO LIVRO
    public void emprestarLivro(){
        
        
    }
    //OPERAÇAO DE RENOVAR EMPRESTIMO DO LIVRO

    public void renovarEmprestimo() {

        
    }
    
    //OPERAÇAO DE DEVOLVER LIVRO E CONSULRAR QUANDO MULTA SE APLICA

    public void devolverLivro() {

        
    }
    
    
    //OPERAÇAO DE DAR ACEITE OU BARRAR A RESERVA DO LIVRO 

    public void confirmarReservaLivro() {

        
    }

    
    public void consultarLivro() {
        
        
    }
    
    //CRUD ALUNO
    public void cadastarAluno() {

    }
    public void alterarDadosAluno() {

        
    }
    public void removerAluno(){

        
    }
    
    //CRUD SERVIDOR
    public void cadastrarServidor() {

        
    }
    public void alterarDadosServidor() {

        
    }
    public void removerServidor(){

        
    }  

    //GETTERS 
    public String getNome() {
        return this.nome;
    }

    public long getIdBibliotecario() {
        return this.idBibliotecario;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public boolean getStatusAtivo() {
        return this.statusAtivo;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getDataEfetivacao() {
        return this.dataEfetivacao;
    }

    public Multa getMulta() {
        return this.multa;
    }
    
    
    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdBibliotecario(long idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setStatusAtivo(boolean statusAtivo) {
        this.statusAtivo = statusAtivo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataEfetivacao(String dataEfetivacao) {
        this.dataEfetivacao = dataEfetivacao;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    
    
    
}
