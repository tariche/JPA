package quickstart.demo.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity

public class Address implements Serializable {

	@Id
	@Column(name = "ADDRESS_ID")
	private Long id;
	private String city;
	private String country;
	@Column(name = "PROVINCE")
	private String stateOrProvince;
	@Column(name = "P_CODE")
	private String postalCode;
	private String street;
	private static final long serialVersionUID = 1L;

	public Address() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
	public String getStateOrProvince() {
		return this.stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}   
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}   
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
   
}
