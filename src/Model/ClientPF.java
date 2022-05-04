package Model;

import java.sql.Date;

public class ClientPF extends Client{
	
	private String name;
	private String sex;
	private String cpf;
	private Date dataNasc;
	
	public ClientPF(String name, String sex, String cpf, Date dataNasc) {
		super();
		this.name = name;
		this.sex = sex;
		this.cpf = cpf;
		this.setDataNasc(dataNasc);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
}
