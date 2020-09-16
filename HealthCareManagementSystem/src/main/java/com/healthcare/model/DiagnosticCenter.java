package com.healthcare.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DiagnosticCenter {
	
	private String centerName;
	@Id
	private String CenterId;
	private List<Test> listOftest;
	private List<Appointment> appointmentList;
	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DiagnosticCenter(String centerName, String centerId, List<Test> listOftest,
			List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		CenterId = centerId;
		this.listOftest = listOftest;
		this.appointmentList = appointmentList;
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [centerName=" + centerName + ", CenterId=" + CenterId + ", listOftest=" + listOftest
				+ ", appointmentList=" + appointmentList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CenterId == null) ? 0 : CenterId.hashCode());
		result = prime * result + ((appointmentList == null) ? 0 : appointmentList.hashCode());
		result = prime * result + ((centerName == null) ? 0 : centerName.hashCode());
		result = prime * result + ((listOftest == null) ? 0 : listOftest.hashCode());
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
		DiagnosticCenter other = (DiagnosticCenter) obj;
		if (CenterId == null) {
			if (other.CenterId != null)
				return false;
		} else if (!CenterId.equals(other.CenterId))
			return false;
		if (appointmentList == null) {
			if (other.appointmentList != null)
				return false;
		} else if (!appointmentList.equals(other.appointmentList))
			return false;
		if (centerName == null) {
			if (other.centerName != null)
				return false;
		} else if (!centerName.equals(other.centerName))
			return false;
		if (listOftest == null) {
			if (other.listOftest != null)
				return false;
		} else if (!listOftest.equals(other.listOftest))
			return false;
		return true;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterId() {
		return CenterId;
	}
	public void setCenterId(String centerId) {
		CenterId = centerId;
	}
	public List<Test> getListOftest() {
		return listOftest;
	}
	public void setListOftest(List<Test> listOftest) {
		this.listOftest = listOftest;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	
	
}
