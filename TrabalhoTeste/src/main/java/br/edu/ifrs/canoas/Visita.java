package br.edu.ifrs.canoas;

public class Visita {

	private String nomeInstituicao;
	private String dtVisita;
	private String tipoInstituicao;
	private boolean guia;
	private String telefone;
	private boolean conteudoPlanejado;
	private boolean auxilioConteudo;
	private String cidade;
	private String hora;
	private String cursoVisitante;
	private int numVisitante;
	private int Semestre;
	private String conteudo;
	private String tempoVisita;
	
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	public String getDtVisita() {
		return dtVisita;
	}
	public void setDtVisita(String dtVisita) {
		this.dtVisita = dtVisita;
	}
	public String getTipoInstituicao() {
		return tipoInstituicao;
	}
	public void setTipoInstituicao(String tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}
	public boolean isGuia() {
		return guia;
	}
	public void setGuia(boolean guia) {
		this.guia = guia;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isConteudoPlanejado() {
		return conteudoPlanejado;
	}
	public void setConteudoPlanejado(boolean conteudoPlanejado) {
		this.conteudoPlanejado = conteudoPlanejado;
	}
	public boolean isAuxilioConteudo() {
		return auxilioConteudo;
	}
	public void setAuxilioConteudo(boolean auxilioConteudo) {
		this.auxilioConteudo = auxilioConteudo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getCursoVisitante() {
		return cursoVisitante;
	}
	public void setCursoVisitante(String cursoVisitante) {
		this.cursoVisitante = cursoVisitante;
	}
	public int getNumVisitante() {
		return numVisitante;
	}
	public void setNumVisitante(int numVisitante) {
		this.numVisitante = numVisitante;
	}
	public int getSemestre() {
		return Semestre;
	}
	public void setSemestre(int semestre) {
		Semestre = semestre;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getTempoVisita() {
		return tempoVisita;
	}
	public void setTempoVisita(String tempoVisita) {
		this.tempoVisita = tempoVisita;
	}
}
