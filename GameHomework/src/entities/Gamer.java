package entities;

import abstracts.Entity;

public class Gamer implements Entity{
	private int id;
	private String lastName;
	private String firstName;
	private String nationalityId;
	private int dateOfYear;
	public Gamer() {
		super();
	}
	public Gamer(int id, String firstName, String lastName, String nationalityId, int dateOfYear) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.nationalityId = nationalityId;
		this.dateOfYear = dateOfYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getDateOfYear() {
		return dateOfYear;
	}
	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}
}
