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
	    	if(titulo != null) {
	    		this.titulo = titulo;
	    	}
	    }
	public void setAutor(Autor autor) {
	    	if(autor != null) {
	    		this.autor = autor;}
	    }
	    
	public void setIsbn(long isbn) {
	    	if(isbn <= 999999999) {
	    		this.isbn = isbn;
	    	}
	    }
	    
	public void setEdicao (String edicao) {
	    	if(edicao != null) {
	    		this.edicao = edicao;
	    	}
	    }
	    
	public void setAnoDeLancamento(String anoDeLancamento) {
	    	if(anoDeLancamento != null) {
	    		this.anoDeLancamento = anoDeLancamento;
	    	}
	    }
	    
	public void setCategoria(String categoria) {
	    	if(categoria != null) {
	    		this.categoria = categoria;
	    	}
	    }
	    
	public void setStatusEmprestado(boolean statusEmprestado) {
	    	this.statusEmprestado = statusEmprestado;
	    }
}
