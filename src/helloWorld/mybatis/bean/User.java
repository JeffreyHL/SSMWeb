package helloWorld.mybatis.bean;

public class User {

	private int userID;
	private String name;
	private String age;
	private String sex;
	private String remark;

	@Override
	public String toString() {
		return "-------\nUserID:" + userID + "\nName:" + name + "\nAge:" + age + "\nSex:" + sex + "\nRemark:" + remark;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
