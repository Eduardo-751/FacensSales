package Model;

public class ClientPJ extends Client  {
	
	private String razaoSocial;
	private String cnpj;
	private String ie;
	private String im;
	
	public ClientPJ(String razaoSocial, String cnpj, String ie, String im) {
		this.setRazaoSocial(razaoSocial);
		this.setCnpj(cnpj);
		this.setIe(ie);
		this.setIm(im);
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
	}

}
