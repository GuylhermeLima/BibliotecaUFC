package trabalhomarcosvinicius;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Multa {
    
    private Aluno aluno;
    private Servidor servidor;
    private Livro livro;
    private BigDecimal valorMulta;
    private LocalDateTime dataReserva;
    private LocalDateTime dataRetiradaEmprestimo; //ADICIONAR NO DIAGRAMA
    private LocalDateTime dataVencimento;    
    private boolean emprestimoAtivo;

        
    //COMPARA A DATA DE DE RETIRADA DO EMPRESTIMO COM A DATA DE VENCIMENTO E CALCULA A MULTA BASEADO NO ATRAZO
    public void calculoMulta() {
        
    }
    
    //COMPARA A DATA DE DE RETIRADA DO EMPRESTIMO COM A DATA DE VENCIMENTO E COMEÇA A NOTIFICAR O EMAIL DE QUEM ATRAZOU A ENTREGA
    public void notificarAtraso() {
        
    }
    
    //QUER UM LOGADO NO SISTERMA PODE CONSULTAR SE ESTÁ EM ATRASO, E VALOR DA MULTA
    public void consultarValorMulta() {
        
    }

    
    //GETTERS
    public Aluno getAluno() {
        return this.aluno;
    }

    public Servidor getServidor() {
        return this.servidor;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public BigDecimal getValorMulta() {
        return this.valorMulta;
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

    public boolean getEmprestimoAtivo() {
        return this.emprestimoAtivo;
    }


    //SETTERS

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setValorMulta(BigDecimal valorMulta) {
        this.valorMulta = valorMulta;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    public void setDataRetiradaEmprestimo(LocalDateTime dataRetiradaEmprestimo) {
        this.dataRetiradaEmprestimo = dataRetiradaEmprestimo;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setEmprestimoAtivo(boolean emprestimoAtivo) {
        this.emprestimoAtivo = emprestimoAtivo;
    }
    
    
}
