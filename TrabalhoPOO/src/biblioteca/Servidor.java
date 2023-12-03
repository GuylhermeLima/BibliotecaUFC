package biblioteca;

public class Servidor extends Pessoa{

    private String dataEfetivacao;
	    
	private List<Servidor> servidores;

	public Servidor() {
	        servidores = new ArrayList<>();
	}

	    // AQUI OS SERVIDORES PODEM APLICAR UMA CADASTRO NO SISTEMA
	    
	public void cadastrarServidor(Servidor servidor) {
	        servidores.add(servidor);
	}

	public void removerServidor(long id) {
	        servidores.removeIf(servidor -> servidor.getId() == id);
	}


	public void alterarDados(long id, String nome, String senha, String email, String cpf, String telefone, String dataNascimento, String dataEfetivacao) {
	        for (Servidor servidor : servidores) {
	            if (servidor.getId() == id) {
	                servidor.setNome(nome);
	                servidor.setSenha(senha);
	                servidor.setEmail(email);
	                servidor.setCpf(cpf);
	                servidor.setTelefone(telefone);
	                servidor.setDataNascimento(dataNascimento);
	                servidor.setDataEfetivacao(dataEfetivacao);
	                break;
	            }
	        }
	}

	    // METODOS PARA LOGIN E LOGOFF NO SISTEMA
	    
	public Servidor loginServidor(long id, String senha) {
	        for (Servidor servidor : servidores) {
	            if (servidor.getId() == id && servidor.getSenha().equals(senha)) {
	                return servidor;
	            }
	        }
	        return null;
	}
	    //GETTERS

	public String getDataEfetivacao() {
	        return this.dataEfetivacao;
	}

	    //SETTERS
	    
	public void setDataEfetivacao(String dataEfetivacao) {
	        this.dataEfetivacao = dataEfetivacao;
	}
}
