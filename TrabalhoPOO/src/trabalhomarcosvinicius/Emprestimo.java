package trabalhomarcosvinicius;
import java.time.LocalDateTime;

public class Emprestimo {
	
	private Pessoa pessoa;
	private Livro livro;
	private LocalDateTime dataReserva;
  private LocalDateTime dataRetiradaEmprestimo;
  private LocalDateTime dataVencimento;
    
    
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

  public LocalDateTime getDataRetiradaEmprestimo() {
        return this.dataRetiradaEmprestimo;
    }

  public LocalDateTime getDataVencimento() {
        return this.dataVencimento;
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

  public void setDataRetiradaEmprestimo(LocalDateTime dataRetiradaEmprestimo) {
    	if(dataRetiradaEmprestimo != null) {
    		this.dataRetiradaEmprestimo = dataRetiradaEmprestimo;
        }
    }

  public void setDataVencimento(LocalDateTime dataVencimento) {
    	if(dataVencimento != null) {
    		this.dataVencimento = dataVencimento;
        }
    }
  
}
