package com.webapp.project.modules.teacher.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.webapp.project.framework.model.User;
import com.webapp.project.modules.classes.model.Classes;

@Entity
@Table(name="TEACHER")
public class Teacher implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEACHERID", nullable=false)
	private Integer teacherId;
	
	
	@NotEmpty
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	

	@Column(name="MIDDLE_NAME", nullable=false)
	private String middleName;

	@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;

	@NotEmpty
	@Column(name="USERNAME", nullable=false)
	private String userName;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@NotEmpty
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	
	@NotEmpty
	@Column(name="DESIGNATION", nullable=false)
	private String designation;

	@NotEmpty
	@Column(name="RELIGION", nullable=false)
	private String religion;

	@NotEmpty
	@Column(name="PHONE", nullable=false)
	private String phone;
	
	@NotEmpty
	@Column(name="ADDRESS", nullable=false)
	private String address;
	
	@NotNull
	@Column(name="DOB", nullable=false)
	private Date dob;
	
	@NotNull
	@Column(name="JOD", nullable=false)
	private Date jod;
	
	@NotEmpty
	@Column(name="GENDER", nullable=false)
	private String gender;
	
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
	
	@Column(name="TEACHERACTIVE", nullable=false)
	private Integer teacherActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user; 
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
	private Set<Classes> classess = new HashSet<Classes>(0);
	
	@Transient
	private String status;
	
	
	public Set<Classes> getClassess() {
		return classess;
	}

	public void setClassess(Set<Classes> classess) {
		this.classess = classess;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

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

	public Date getJod() {
		return jod;
	}

	public void setJod(Date jod) {
		this.jod = jod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Integer getTeacherActive() {
		return teacherActive;
	}

	public void setTeacherActive(Integer teacherActive) {
		this.teacherActive = teacherActive;
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
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Teacher(Integer teacherId,String teacherName){
		this.teacherId = teacherId;
		this.firstName = teacherName;
	}
	
	public Teacher(){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((createUserId == null) ? 0 : createUserId.hashCode());
		result = prime * result + ((createUserName == null) ? 0 : createUserName.hashCode());
		result = prime * result + ((createUserType == null) ? 0 : createUserType.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((jod == null) ? 0 : jod.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((modifyDate == null) ? 0 : modifyDate.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((teacherActive == null) ? 0 : teacherActive.hashCode());
		result = prime * result + ((teacherId == null) ? 0 : teacherId.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		Teacher other = (Teacher) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (createUserId == null) {
			if (other.createUserId != null)
				return false;
		} else if (!createUserId.equals(other.createUserId))
			return false;
		if (createUserName == null) {
			if (other.createUserName != null)
				return false;
		} else if (!createUserName.equals(other.createUserName))
			return false;
		if (createUserType == null) {
			if (other.createUserType != null)
				return false;
		} else if (!createUserType.equals(other.createUserType))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (jod == null) {
			if (other.jod != null)
				return false;
		} else if (!jod.equals(other.jod))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (modifyDate == null) {
			if (other.modifyDate != null)
				return false;
		} else if (!modifyDate.equals(other.modifyDate))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		if (teacherActive == null) {
			if (other.teacherActive != null)
				return false;
		} else if (!teacherActive.equals(other.teacherActive))
			return false;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", designation=" + designation + ", religion=" + religion + ", phone=" + phone + ", address="
				+ address + ", dob=" + dob + ", jod=" + jod + ", gender=" + gender + ", userType=" + userType
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", createUserId=" + createUserId
				+ ", createUserName=" + createUserName + ", createUserType=" + createUserType + ", teacherActive="
				+ teacherActive + ", user=" + user + "]";
	}

}
