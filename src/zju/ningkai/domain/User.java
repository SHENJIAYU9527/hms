package zju.ningkai.domain;

public class User {
	
    private String userId;
	private String userName;
	private String password;
	private int auth;
	private int status;
	private String hospital;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	@Override
	public String toString() {
		
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", auth=" + auth
				+ ", status=" + status + ", hospital=" + hospital + "]";
	}

	
	


	

}
