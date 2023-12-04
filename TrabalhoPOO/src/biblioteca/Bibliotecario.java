package biblioteca;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bibliotecario extends Pessoa {

    private String departamento;
    private String dataEfetivacao;
    private ArrayList<Livro> livros;
    
    public Bibliotecario() {
    	this.livros = new ArrayList<>();
    }

    // OPERAÇÕES DE LIVROS

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void alterarLivro(Livro livro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getIsbn() == livro.getIsbn()) {
                livros.set(i, livro);
                break;
            }
        }
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

//OPERAÇÕES PRÓPRIAS DO SISTEMA DE ADMINISTRAÇÃO DOS LIVROS
    
    //OPERAÇAO DE EMPRESTIMO DO LIVRO
    public void emprestarLivro(Livro livro, Pessoa pessoa){
        if(livro.getStatusEmprestado() == false){
            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setLivro(livro);
            emprestimo.setPessoa(pessoa);
            emprestimo.setDataEmprestimo(LocalDateTime.now());
            emprestimo.setDataDevolucao(emprestimo.getDataEmprestimo().plusMonths(1));
            livro.setStatusEmprestado(true);
            //LIVRO EMPRESTADO
        }else{
            //LIVRO INDISPONIVEL
        }
        
    }
    //OPERAÇAO DE RENOVAR EMPRESTIMO DO LIVRO

    public void renovarEmprestimo(Emprestimo emprestimo){
        if(emprestimo.getDataDevolucao().isBefore(LocalDateTime.now())){
        	//LIVRO ATRASADO NAO PODE SER RENOVADO
        }else{
            emprestimo.setDataEmprestimo(LocalDateTime.now());
            emprestimo.setDataDevolucao(emprestimo.getDataEmprestimo().plusMonths(1));
        }  //EMPRESTIMO RENOVADO
        
    }
    
    //OPERAÇAO DE DEVOLVER LIVRO E CONSULRAR QUANDO MULTA SE APLICA

    public void devolverLivro(Emprestimo emprestimo){
        LocalDateTime dataDevolucao = emprestimo.getDataDevolucao();
        LocalDateTime dataAtual = LocalDateTime.now();
        
        if(dataAtual.isAfter(dataDevolucao)){
            LocalDateTime dataLimite = dataDevolucao.plusDays(1);
            if(dataAtual.isBefore(dataLimite)){
            	
            }else{}
        }else{}
        
        emprestimo.getLivro().setStatusEmprestado(false);
    }
    
    
    //OPERAÇAO DE DAR ACEITE OU BARRAR A RESERVA DO LIVRO 

    public void confirmarReservaLivro(Emprestimo emprestimo){
        if(emprestimo.getLivro().getStatusEmprestado() == false){
            emprestimo.setDataReserva(null);
        }else{}
        
    }

    //GETTERS 
    public String getDepartamento() {
        return this.departamento;
    }

    public String getDataEfetivacao() {
        return this.dataEfetivacao;
    }
    
    
    //SETTERS

    public void setDepartamento(String departamento) {
    	if(departamento != null) {
    		this.departamento = departamento;
        }
    }

    public void setDataEfetivacao(String dataEfetivacao) {
    	if(dataEfetivacao != null) {
    		this.dataEfetivacao = dataEfetivacao;
        }
    }    
    
}
