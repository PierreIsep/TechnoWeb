package com.isep.miga.model;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue	
	private int id;
	@NotBlank
	private String first_Name;
	@NotBlank
	private String last_Name;
	@NotBlank
	private String password;
	@NotBlank
	private int number_vote;
	
	public User(){
        super();
    }
	
	public User(String first_Name, String last_Name, String password, int number_vote) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.password = password;
		this.number_vote = number_vote;
	}
	
	public String getFirstName() {
		return first_Name;
	}
	public void setFirstName(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLastName() {
		return last_Name;
	}
	public void setLastName(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumberVote() {
		return number_vote;
	}
	public void setNumberVote(int number_vote) {
		this.number_vote = number_vote;
	}
}
