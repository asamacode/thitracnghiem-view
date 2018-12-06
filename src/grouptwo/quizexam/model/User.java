package grouptwo.quizexam.model;

/**
 * Users generated by hbm2java
 */
public class User {

	private Integer userId;
	private String userName;
	private int idCardNumber;
	public int getIdCardNumber() {
		return idCardNumber;
	}



	public void setIdCardNumber(int idCardNumber) {
		this.idCardNumber = idCardNumber;
	}



	public void setRoleuser(Integer roleuser) {
		this.roleuser = roleuser;
	}

	private Integer roleuser;
	private String email;
	private String password;
	private boolean activate;

	public User() {
	}



	public User(String userName, String email, String password, Integer roleuser, boolean activate,int id) {
		this.userName = userName;
		this.roleuser = roleuser;
		this.email = email;
		this.password = password;
		this.activate = activate;
		this.userId=id;
	}
	public User(String userName, String email, String password, Integer roleuser, boolean activate) {
		this.userName = userName;	
		this.email = email;
		this.password = password;
		this.roleuser = roleuser;
		this.activate = activate;
	
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRoleuser() {
		return this.roleuser;
	}

	public void setRoleusers(Integer roleuser) {
		this.roleuser = roleuser;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getActivate() {
		return this.activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


}