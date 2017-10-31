package br.edu.ifrs.canoas.Pojo;

import java.util.ArrayList;
import java.util.List;

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
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Visita> visitas = new ArrayList<Visita>();
	
	public Usuario (String nome, String login, String senha, String cidade, String celular, String area, 
  		  String operadora, String fixo, String horario_contato, String email)
    {
		 
	      if (nome == null || login == null || senha == null || cidade == null || celular == null || area == null || email == null){
		      throw new NullPointerException("Campo obrigatório.");
	      }
	      if (nome.isEmpty() || login.isEmpty() || senha.isEmpty() || cidade.isEmpty() || celular.isEmpty() || area.isEmpty() || email.isEmpty()){
		      throw new IllegalArgumentException("Campo obrigatório.");
	      }
	      if (!nome.matches("[a-zA-Z]+") || !cidade.matches("[a-zA-Z]+")){
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
	  
	  usuarios.add(this);
	
	}
	
	public static List<Usuario> getUsuarios() {
		return usuarios;
	}
	public static void setUsuarios(List<Usuario> usuarios) {
		Usuario.usuarios = usuarios;
	}
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
	
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
      
      
      public void listaDadosUsuario(){
    	 
    	  System.out.println("Nome: "+nome);
	      System.out.println("Login: "+login);
		  System.out.println("Senha: "+senha);
		  System.out.println("cidade: "+cidade);
		  System.out.println("celular: "+celular);
		  System.out.println("area: "+area);
		  System.out.println("operadora: "+operadora);
		  System.out.println("fixo: "+fixo);
		  System.out.println("Horario de contato: "+horario_contato);
		  System.out.println("Email: "+email);
      }
      
      public void listaDadosUsuarios(){
  		
  		for(Usuario user : usuarios){
  			
  			user.listaDadosUsuario();
  			
  		}
  		
  	}
      
    public void salvaVisita(Visita visita){
    	
    	visitas.add(visita);
    	
    }
    
    public void excluirVisita(String data, int hora){
		
		for(Visita visita: visitas){
			
			if(visita.getDtVisita() == data && visita.getHora() == hora){
					
				visitas.remove(visita);
				return;
			}
		}
		
		throw new RuntimeException("Visita não encontrada");
		
	}
	
public void editarVisita(String data, int hora, Visita visitaEditada){
		
		
		for(Visita visita: visitas){
			
			if(visita.getDtVisita() == data && visita.getHora() == hora){
				
				visita = visitaEditada;
				return;
			}
		}
		
		throw new RuntimeException("Visita não encontrada");
	}
	    
	public void consultarVisita(){
			
		this.listaDadosUsuario();
		for(Visita visita : visitas){
			visita.listaDados();
		}
	}
	
	public List<Visita> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}
	
}