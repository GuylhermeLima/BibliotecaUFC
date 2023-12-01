package trabalhomarcosvinicius;

public class Servidor extends Pessoa{
	
    private long sipac;
    private String dataEfetivacao;
        
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
    
    
    //GETTERS


    public long getSipac() {
        return this.sipac;
    }

    public String getDataEfetivacao() {
        return this.dataEfetivacao;
    }

    
    //SETTERS


    public void setSipac(long sipac) {
        this.sipac = sipac;
    }

    public void setDataEfetivacao(String dataEfetivacao) {
        this.dataEfetivacao = dataEfetivacao;
    }
    
    
}
