package com.example.SpringHibernate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.common.base.Objects;

@Entity
public class Person {
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private String ssn;
      
	public Person() {}
	
	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public int hashCode(){
	    return Objects.hashCode(name, ssn);
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj != null && obj instanceof Person) {
			final Person other = (Person) obj;
			return Objects.equal(name, other.name) && Objects.equal(ssn, other.ssn);
		}
		return false;
	}
}
