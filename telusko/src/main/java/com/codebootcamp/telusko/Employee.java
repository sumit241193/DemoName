package com.codebootcamp.telusko;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_table")
public class Employee {
	
	@Id
	private int emp_id;
	private FullName fn;
	
	@Column(name="emp_salary")
	private long emp_contact;
	
	@OneToMany(mappedBy="emp",fetch=FetchType.EAGER)
	private List<Laptop> lap=new ArrayList<Laptop>();
	
	public FullName getFn() {
		return fn;
	}
	public void setFn(FullName fn) {
		this.fn = fn;
	}
	
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	
	public List<Laptop> getLap() {
		return lap;
	}
	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}
	public FullName getEmp_name() {
		return fn;
	}
	public void setEmp_name(FullName emp_name) {
		this.fn = emp_name;
	}
	public long getEmp_contact() {
		return emp_contact;
	}
	public void setEmp_contact(long emp_contact) {
		this.emp_contact = emp_contact;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + fn + ", emp_contact=" + emp_contact + "]";
	}
	
	
	
}
