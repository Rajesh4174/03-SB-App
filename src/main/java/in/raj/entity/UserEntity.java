package in.raj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARJUN_REDDY")
public class UserEntity {
	
	@Id
	@Column(name="USER_ID")
	private Integer userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_EMAIL")
	private String userEmail;
	@Column(name="USER_AGE")
	private Integer age;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

	public UserEntity(Integer userId, String userName, String userEmail, Integer age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.age = age;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", age=" + age
				+ "]";
	}
	
	

}
