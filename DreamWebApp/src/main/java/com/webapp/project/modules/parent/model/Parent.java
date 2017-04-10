package com.webapp.project.modules.parent.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.webapp.project.framework.model.User;

@Entity
@Table(name="PARENT")
public class Parent implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PARENTID", nullable=false)
	private Integer parentId;
	
	
	@NotEmpty
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	

	@Column(name="MIDDLE_NAME", nullable=false)
	private String middleName;

	@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;
	
	@NotEmpty
	@Column(name="FATHER_NAME", nullable=false)
	private String fatherName;
	
	@NotEmpty
	@Column(name="MOTHER_NAME", nullable=false)
	private String motherName;
	
	@NotEmpty
	@Column(name="FATHER_PROFESSION", nullable=false)
	private String fatherProfession;
	
	@NotEmpty
	@Column(name="MOTHER_PROFESSION", nullable=false)
	private String motherProfession;

	/*@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;*/

	@NotEmpty
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	
	@NotEmpty
	@Column(name="USERNAME", nullable=false)
	private String userName;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable=false)
	private String password;

	@NotEmpty
	@Column(name="PHONE", nullable=false)
	private String phone;
	
	@NotEmpty
	@Column(name="ADDRESS", nullable=false)
	private String address;
	
	/*@NotEmpty
	@Column(name="DOB", nullable=false)
	private Date dob;
	
	@NotEmpty
	@Column(name="JOD", nullable=false)
	private Date jod;
	*/

	@Column(name="USERTYPE", nullable=false)
	private String userType;
	
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;
	
	@Column(name="MODIFY_DATE", nullable=false)
	private Date modifyDate;
	
	@Column(name="CREATE_USERID", nullable=false)
	private Date createUserId;
	
	@Column(name="CREATE_USERNAME", nullable=false)
	private String createUserName;
	
	@Column(name="CREATE_USERTYPE", nullable=false)
	private String createUserType;
	
	@Column(name="PARENTACTIVE", nullable=false)
	private Integer parentActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user; 

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Date getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Date createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateUserType() {
		return createUserType;
	}

	public void setCreateUserType(String createUserType) {
		this.createUserType = createUserType;
	}

	public Integer getParentActive() {
		return parentActive;
	}

	public void setParentActive(Integer parentActive) {
		this.parentActive = parentActive;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	


	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherProfession() {
		return fatherProfession;
	}

	public void setFatherProfession(String fatherProfession) {
		this.fatherProfession = fatherProfession;
	}

	public String getMotherProfession() {
		return motherProfession;
	}

	public void setMotherProfession(String motherProfession) {
		this.motherProfession = motherProfession;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((fatherProfession == null) ? 0 : fatherProfession.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result + ((motherProfession == null) ? 0 : motherProfession.hashCode());
		result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (fatherProfession == null) {
			if (other.fatherProfession != null)
				return false;
		} else if (!fatherProfession.equals(other.fatherProfession))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (motherProfession == null) {
			if (other.motherProfession != null)
				return false;
		} else if (!motherProfession.equals(other.motherProfession))
			return false;
		if (parentId == null) {
			if (other.parentId != null)
				return false;
		} else if (!parentId.equals(other.parentId))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", firstName=" + firstName +", middleName=" + middleName +", lastName=" + lastName + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", fatherProfession=" + fatherProfession + ", motherProfession="
				+ motherProfession + ", email=" + email + ", phone=" + phone
				+ ", address=" + address +  "]";
	}

	
}
