package com.ecommerce.microcommerce.model;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue	
	public int id;
	@NotBlank
	public String firstName;
	@NotBlank
	public String lastName;
	@NotBlank
	public String password;
	@NotBlank
	public int numberVote;
	
	public User(){
        super();
    }
	
	public User(String firstName, String lastName, String password, int numberVote) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.numberVote = numberVote;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumberVote() {
		return numberVote;
	}
	public void setNumberVote(int numberVote) {
		this.numberVote = numberVote;
	}
}
