package entities;

public class Aluno {
	private int RA;
	private String nome;
	private String sexo;
	private String curso;
	private String dataIngresso;
	private int periodo;
	private double coeficiente;
	
	public int getRA() {
		return RA;
	}
	
	public void setRA(int rA) {
		RA = rA;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getDataIngresso() {
		return dataIngresso;
	}
	
	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public double getCoeficiente() {
		return coeficiente;
	}
	
	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	
	
}
