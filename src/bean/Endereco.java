package bean;

import java.io.Serializable;

public class Endereco implements Serializable{
	
	private static final long serialVersionUID = -5213432283663042828L;
	
	private String logradouro, bairro, cidade, estado;
	
	public Endereco(){};
	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String toJSON(){
		
		StringBuffer sbJson = new StringBuffer();
		
		sbJson.append("endereco { ");
		sbJson.append("\"logradouro': '" + logradouro +"\", ");
		sbJson.append("\"bairro': '" + bairro +"\", ");
		sbJson.append("\"cidade': '" + cidade +"\", ");
		sbJson.append("\"estado': '" + estado +"\", ");
		sbJson.append(" }");
		
		return sbJson.toString();
	}
	
	

}
