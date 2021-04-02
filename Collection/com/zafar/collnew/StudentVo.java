package com.zafar.collnew;

public class StudentVo {
	static String a;
	private String name;
	private String city;
	private int age;
	private String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", city=" + city + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
