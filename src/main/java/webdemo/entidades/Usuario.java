package webdemo.entidades;

import java.util.ArrayList;

public class Usuario{	
    private Integer id;
	private String nome;
	private String sobrenome;
	private boolean ativo;
    	
	public Usuario(Integer id, String nome, String sobrenome) {
        this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ativo = true;
	}
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public boolean getAtivo(){
		return this.ativo;
	}
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
}