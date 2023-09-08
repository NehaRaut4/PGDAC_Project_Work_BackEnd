package com.groupproject.rentnstore.model;

import com.groupproject.rentnstore.model.Role;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userid;
	private String useremail;
	private String userpassword;
	private String userphone;
	private String useraddress;
	private String usercity;
	
	//Role and User Relationship
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(name="user_role",joinColumns = @JoinColumn(name="user",referencedColumnName = "userid"), inverseJoinColumns =  @JoinColumn(name="role",referencedColumnName = "roleid"))
	Set<Role> roles = new HashSet<>();
	
	@OneToOne(mappedBy = "user")
	private Cart cart;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<SimpleGrantedAuthority> authorities = this.roles.stream().map((role)->new SimpleGrantedAuthority(role.getRolename())).collect(Collectors.toList());
				
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.userpassword;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.useremail;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//constructors and getters setters
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String useremail, String userpassword, String userphone, String useraddress,
			String usercity) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.usercity = usercity;
	}
	
	//constructor without userid
	public User(String useremail, String userpassword, String userphone, String useraddress, String usercity) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.usercity = usercity;
	}
	
	//
	
	public int getUserid() {
		return userid;
	}
	public User(int userid, String useremail, String userpassword, String userphone, String useraddress,
			String usercity, Set<Role> roles) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.usercity = usercity;
		this.roles = roles;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(int userid, String useremail, String userpassword, String userphone, String useraddress,
			String usercity, Set<Role> roles, Cart cart) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.usercity = usercity;
		this.roles = roles;
		this.cart = cart;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
	
	
	

}
