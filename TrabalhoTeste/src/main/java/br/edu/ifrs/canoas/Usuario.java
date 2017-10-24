package br.edu.ifrs.canoas;

public class Usuario {

	private String nome;
	private String login;
	private String senha;
	private String area;
	private String celular;
	private String cidade;
	private String fixo;
	private String horario_contato;
	private String operadora;
	private String email;
	
	public String getTelefone() {
		return celular;
	}
	public void setTelefone(String telefone) {
		this.celular = telefone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getFixo() {
		return fixo;
	}
	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	public String getHorario_contato() {
		return horario_contato;
	}
	public void setHorario_contato(String horario_contato) {
		this.horario_contato = horario_contato;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public String getEmail() {
		return email;
	}
   
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
      public Usuario (String nome, String login, String senha, String cidade, String celular, String area, String operadora, String fixo, String horario_contato, String email){
		 
    	  if (nome == null || login == null || senha == null || cidade == null || celular == null || area == null || email == null){
    		  throw new NullPointerException("Campo obrigatório.");
    	  }
    	  if (nome.isEmpty() || login.isEmpty() || senha.isEmpty() || cidade.isEmpty() || celular.isEmpty() || area.isEmpty() || email.isEmpty()){
    		  throw new IllegalArgumentException("Campo obrigatório.");
    	  }
    	  if (!nome.matches("[a-zA-Z]+") || !nome.matches("[a-zA-Z]+")){
    		  throw new IllegalArgumentException("Campo não aceita caracteres especiais.");
    		  
    	  }
    	  if (!celular.matches("[0-9]+") || !area.matches("[0-9]+") || !fixo.matches("[0-9]+")){
    		  throw new IllegalArgumentException("Campo não aceita caracteres especiais.");
    		  
    	  }
    	  
    	  this.nome = nome;
		  this.area = area;
		  this.celular = celular;
		  this.cidade = cidade;
		  this.fixo = fixo;
		  this.horario_contato = horario_contato;
		  this.login = login;
		  this.operadora = operadora;
		  this.senha = senha;
		  this.email = email;
		
	
	}
	
}
