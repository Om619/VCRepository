package com.vc.models;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MF_Amcs {
	
	@Id
	private BigInteger amc_id;	
	private String amc_full_name;	
	private String owner_type;	
	private String cio;	
	private String investors_relations_officer;	
	private String amc_short_name;	
	private String ceo;	
	private String management_trustee;	
	private Date start_date;	
	private Boolean is_excluded;	
	private String website;	
	private String address1;
	private String address2;	
	private String address3;
	private String city;
	private int pin;	
	private String phone;
	private String fax;	
	private String email;
	private Boolean modified_ts;
	public BigInteger getAmc_id() {
		return amc_id;
	}
	public void setAmc_id(BigInteger amc_id) {
		this.amc_id = amc_id;
	}
	public String getAmc_full_name() {
		return amc_full_name;
	}
	public void setAmc_full_name(String amc_full_name) {
		this.amc_full_name = amc_full_name;
	}
	public String getOwner_type() {
		return owner_type;
	}
	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}
	public String getCio() {
		return cio;
	}
	public void setCio(String cio) {
		this.cio = cio;
	}
	public String getInvestors_relations_officer() {
		return investors_relations_officer;
	}
	public void setInvestors_relations_officer(String investors_relations_officer) {
		this.investors_relations_officer = investors_relations_officer;
	}
	public String getAmc_short_name() {
		return amc_short_name;
	}
	public void setAmc_short_name(String amc_short_name) {
		this.amc_short_name = amc_short_name;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getManagement_trustee() {
		return management_trustee;
	}
	public void setManagement_trustee(String management_trustee) {
		this.management_trustee = management_trustee;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Boolean getIs_excluded() {
		return is_excluded;
	}
	public void setIs_excluded(Boolean is_excluded) {
		this.is_excluded = is_excluded;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(Boolean modified_ts) {
		this.modified_ts = modified_ts;
	}
	public MF_Amcs(BigInteger amc_id, String amc_full_name, String owner_type, String cio,
			String investors_relations_officer, String amc_short_name, String ceo, String management_trustee,
			Date start_date, Boolean is_excluded, String website, String address1, String address2, String address3,
			String city, int pin, String phone, String fax, String email, Boolean modified_ts) {
		this.amc_id = amc_id;
		this.amc_full_name = amc_full_name;
		this.owner_type = owner_type;
		this.cio = cio;
		this.investors_relations_officer = investors_relations_officer;
		this.amc_short_name = amc_short_name;
		this.ceo = ceo;
		this.management_trustee = management_trustee;
		this.start_date = start_date;
		this.is_excluded = is_excluded;
		this.website = website;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.pin = pin;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.modified_ts = modified_ts;
	}
	public MF_Amcs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "amcs [amc_id=" + amc_id + ", amc_full_name=" + amc_full_name + ", owner_type=" + owner_type + ", cio="
				+ cio + ", investors_relations_officer=" + investors_relations_officer + ", amc_short_name="
				+ amc_short_name + ", ceo=" + ceo + ", management_trustee=" + management_trustee + ", start_date="
				+ start_date + ", is_excluded=" + is_excluded + ", website=" + website + ", address1=" + address1
				+ ", address2=" + address2 + ", address3=" + address3 + ", city=" + city + ", pin=" + pin + ", phone="
				+ phone + ", fax=" + fax + ", email=" + email + ", modified_ts=" + modified_ts + "]";
	}

}
