package trabalhomarcosvinicius;

public class Livro {
    private String titulo;
    private Autor autor;
    private long isbn;
    private String edicao;
    private String anoDeLancamento;
    private String categoria;
    private boolean statusEmprestado;
    

    //GETTERS
    public String getTitulo() {
    	return titulo;
    }
    
    public Autor getAutor() {
    	return autor;
    }
    
    public long getIsbn() {
    	return isbn;
    }
    
    public String getEdicao() {
    	return edicao;
    }    
    
    public String getAnoDeLancamento() {
    	return anoDeLancamento;
    }
    
    public String getCategoria() {
    	return categoria;
    }
    
    public boolean getStatusEmprestado() {
    	return statusEmprestado;
    }
    
    //SETTERS
    
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public void setAutor(Autor autor) {
    	this.autor = autor;
    }
    
    public void setIsbn(long isbn) {
    	this.isbn = isbn;
    }
    
    public void setEdicao (String edicao) {
    	this.edicao = edicao;
    }
    
    public void setAnoDeLancamento(String anoDeLancamento) {
    	this.anoDeLancamento = anoDeLancamento;
    }
    
    public void setCategoria(String categoria) {
    	this.categoria = categoria;
    }
    
    public void setStatusEmprestado(boolean statusEmprestado) {
    	this.statusEmprestado = statusEmprestado;
    }
}
