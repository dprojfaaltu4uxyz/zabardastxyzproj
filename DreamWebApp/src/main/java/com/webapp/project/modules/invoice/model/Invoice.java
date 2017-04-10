package com.webapp.project.modules.invoice.model;
// Generated Apr 3, 2017 12:57:15 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Invoice generated by hbm2java
 */
@Entity
@Table(name = "invoice", catalog = "webapp")
public class Invoice implements java.io.Serializable {

	private Integer invoiceId;
	private int schoolyearId;
	private int classesId;
	private int studentId;
	private String feetype;
	private double amount;
	private double discount;
	private Integer userId;
	private Integer usertypeId;
	private String uname;
	private Date date;
	private String day;
	private String month;
	private Date year;
	private Integer paidstatus;
	private int deletedAt;
	private Date createDate;
	private Date modifyDate;
	private int createUserId;
	private String createUsername;
	private String createUsertype;

	public Invoice() {
	}

	public Invoice(int schoolyearId, int classesId, int studentId, String feetype, double amount, double discount,
			Date date, Date year, int deletedAt, Date createDate, Date modifyDate, int createUserId,
			String createUsername, String createUsertype) {
		this.schoolyearId = schoolyearId;
		this.classesId = classesId;
		this.studentId = studentId;
		this.feetype = feetype;
		this.amount = amount;
		this.discount = discount;
		this.date = date;
		this.year = year;
		this.deletedAt = deletedAt;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	public Invoice(int schoolyearId, int classesId, int studentId, String feetype, double amount, double discount,
			Integer userId, Integer usertypeId, String uname, Date date, String day, String month, Date year,
			Integer paidstatus, int deletedAt, Date createDate, Date modifyDate, int createUserId,
			String createUsername, String createUsertype) {
		this.schoolyearId = schoolyearId;
		this.classesId = classesId;
		this.studentId = studentId;
		this.feetype = feetype;
		this.amount = amount;
		this.discount = discount;
		this.userId = userId;
		this.usertypeId = usertypeId;
		this.uname = uname;
		this.date = date;
		this.day = day;
		this.month = month;
		this.year = year;
		this.paidstatus = paidstatus;
		this.deletedAt = deletedAt;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.createUserId = createUserId;
		this.createUsername = createUsername;
		this.createUsertype = createUsertype;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "invoiceID", unique = true, nullable = false)
	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	@Column(name = "schoolyearID", nullable = false)
	public int getSchoolyearId() {
		return this.schoolyearId;
	}

	public void setSchoolyearId(int schoolyearId) {
		this.schoolyearId = schoolyearId;
	}

	@Column(name = "classesID", nullable = false)
	public int getClassesId() {
		return this.classesId;
	}

	public void setClassesId(int classesId) {
		this.classesId = classesId;
	}

	@Column(name = "studentID", nullable = false)
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Column(name = "feetype", nullable = false, length = 128)
	public String getFeetype() {
		return this.feetype;
	}

	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}

	@Column(name = "amount", nullable = false, precision = 22, scale = 0)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "discount", nullable = false, precision = 22, scale = 0)
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Column(name = "userID")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "usertypeID")
	public Integer getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Integer usertypeId) {
		this.usertypeId = usertypeId;
	}

	@Column(name = "uname", length = 60)
	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "day", length = 20)
	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Column(name = "month", length = 20)
	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "year", nullable = false, length = 0)
	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	@Column(name = "paidstatus")
	public Integer getPaidstatus() {
		return this.paidstatus;
	}

	public void setPaidstatus(Integer paidstatus) {
		this.paidstatus = paidstatus;
	}

	@Column(name = "deleted_at", nullable = false)
	public int getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(int deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date", nullable = false, length = 19)
	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Column(name = "create_userID", nullable = false)
	public int getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(int createUserId) {
		this.createUserId = createUserId;
	}

	@Column(name = "create_username", nullable = false, length = 40)
	public String getCreateUsername() {
		return this.createUsername;
	}

	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername;
	}

	@Column(name = "create_usertype", nullable = false, length = 20)
	public String getCreateUsertype() {
		return this.createUsertype;
	}

	public void setCreateUsertype(String createUsertype) {
		this.createUsertype = createUsertype;
	}

}
