package com.swarna.webservice.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name ="users", uniqueConstraints = @UniqueConstraint(columnNames="email"))
public class UserN {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String frirstName;
	private String lastName;
	private String email;
	private String password;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="users_roles",
			joinColumns=@JoinColumn(name="user_id",referencedColumnName="id"),
	inverseJoinColumns =@JoinColumn(name="role_id",referencedColumnName="id"))
	private Collection<Role> roles;
	public UserN(String frirstName, String lastName, String email, String password, Collection<Role> roles) {
		super();
		
		this.frirstName = frirstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrirstName() {
		return frirstName;
	}
	public void setFrirstName(String frirstName) {
		this.frirstName = frirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
 
}
