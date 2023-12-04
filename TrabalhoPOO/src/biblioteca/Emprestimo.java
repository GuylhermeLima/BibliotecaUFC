package biblioteca;

import java.time.LocalDateTime;

public class Emprestimo {
	
	private Pessoa pessoa;
	private Livro livro;
	private LocalDateTime dataReserva;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
    
    
    //GETTERS
	public Pessoa getPessoa() {
		return pessoa;
	}
	public Livro getLivro() {
		return livro;
	}
	public LocalDateTime getDataReserva() {
        return this.dataReserva;
	}

	public LocalDateTime getDataEmprestimo() {
        return this.dataEmprestimo;
	}

	public LocalDateTime getDataDevolucao() {
        return this.dataDevolucao;
	}
	
	//SETTERS
	public void setPessoa(Pessoa pessoa) {
		if(pessoa != null) {
			this.pessoa = pessoa;
		}
	}
	public void setLivro(Livro livro) {
		if(livro != null) {
    		this.livro = livro;
    	}
	}
	public void setDataReserva(LocalDateTime dataReserva) {
		if(dataReserva != null) {
			this.dataReserva = dataReserva;
        	}
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
    		if(dataEmprestimo != null) {
    			this.dataEmprestimo = dataEmprestimo;
        	}
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
    		if(dataDevolucao != null) {
    			this.dataDevolucao = dataDevolucao;
		}
	}
}
