package trabalhomarcosvinicius;

public class Multa {
	
    private float valor;
    private boolean prazoAtrasado;

        
    //COMPARA A DATA DE DE RETIRADA DO EMPRESTIMO COM A DATA DE VENCIMENTO E CALCULA A MULTA BASEADO NO ATRAZO
    public void calcularMulta() {
        
    }
    
    //COMPARA A DATA DE DE RETIRADA DO EMPRESTIMO COM A DATA DE VENCIMENTO E COMEÇA A NOTIFICAR O EMAIL DE QUEM ATRAZOU A ENTREGA
    public void notificarAtraso() {
        
    }
    
    //QUER UM LOGADO NO SISTERMA PODE CONSULTAR SE ESTÁ EM ATRASO, E VALOR DA MULTA
    public void consultarValorMulta() {
        
    }

    
    //GETTERS
    public float getValor() {
        return this.valor;
    }
    
	public boolean isPrazoAtrasado() {
		return prazoAtrasado;
	}


    //SETTERS
    public void setValor(float valor) {
		this.valor = valor;
    }

	public void setPrazoAtrasado(boolean prazoAtrasado) {
		this.prazoAtrasado = prazoAtrasado;
	}
}
