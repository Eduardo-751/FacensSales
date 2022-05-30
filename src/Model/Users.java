package Model;

import javax.swing.Spring;

public class Users {
	
	private int idUser;
	private Spring name;
	private Spring sex;
	private String profile;
	private String login;
	private String password;

	public Users(Spring name, Spring sex, String profile, String login, String password) {
		this.name = name;
		this.sex = sex;
		this.profile = profile;
		this.setLogin(login);
		this.setPassword(password);
	}
	
	//Gets and Sets
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public Spring getName() {
		return name;
	}
	public void setName(Spring name) {
		this.name = name;
	}
	public Spring getSex() {
		return sex;
	}
	public void setSex(Spring sex) {
		this.sex = sex;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}	
}
