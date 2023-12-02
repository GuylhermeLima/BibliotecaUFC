package trabalhomarcosvinicius;

public class Bibliotecario extends Pessoa {

    private long idBibliotecario;
    private String departamento;
    private String dataEfetivacao;
    
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

    //GETTERS 
    public long getIdBibliotecario() {
        return this.idBibliotecario;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getDataEfetivacao() {
        return this.dataEfetivacao;
    }
    
    
    //SETTERS

    public void setIdBibliotecario(long idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDataEfetivacao(String dataEfetivacao) {
        this.dataEfetivacao = dataEfetivacao;
    }    
    
    
}
