package trabalhomarcosvinicius;

import java.time.LocalDateTime;

public class Reserva {
	private Pessoa pessoa;
	private Livro livro;
	private LocalDateTime dataReserva;
    
    
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
	
}
