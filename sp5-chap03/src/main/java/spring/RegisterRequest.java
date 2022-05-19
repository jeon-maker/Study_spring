package spring;

public class RegisterRequest {

	private String email;
	private String password;
	private String confirmPassword;
	private String name;

	public String getEmail() {
		System.out.println("RegisterRequest - getEmail 실행 완료.\n");
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		System.out.println("RegisterRequest - getPassword 실행 완료.\n");

		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		System.out.println("RegisterRequest - getName 실행 완료.\n");

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
}