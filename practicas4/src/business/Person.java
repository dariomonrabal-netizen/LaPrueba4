package business;

public class Person {
	public enum Departamento {
		Marketing, TIC, Administrativo
	}

	private Departamento department;

	private static int contador = 1;
	private int id;
	private String name;
	private String geographic_data;
	private String fechaIncorporacion;
	private String dob;
	private String phone;
	private String email;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String ssn;
	private String imageTxt; // Health plan beneficiary number
	private String bankAccNum; // Bank account numbers

//Full face photos and comparable images
//Any unique identifying number, characteristic or code
	public Person() {
		this.id = contador++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeographic_data() {
		return geographic_data;
	}

	public void setGeographic_data(String geographic_data) {
		this.geographic_data = geographic_data;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getImagetxt() {
		return imageTxt;
	}

	public void setImageTxt(String imageTxt) {
		this.imageTxt = imageTxt;
	}

	public String getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(String bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

	public Departamento getDepartment() {
		return department;
	}

	public void setDepartment(Departamento department) {
		this.department = department;
	}

	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

}
