package model;

/**
 * @author  koles
 */
public class Address {
	private String city;
	private String street;
	private String zip;
	private Integer housenum;
	
	public Address(String city, String street, String zip, Integer housenum) {
		this.city = city;
		this.street = street;
		this.zip = zip;
		this.housenum = housenum;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", zip=" + zip
				+ ", housenum=" + housenum + "]";
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHousenum() {
		return housenum;
	}
	
	public void setHousenum(Integer housenum) {
		this.housenum = housenum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((housenum == null) ? 0 : housenum.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (housenum == null) {
			if (other.housenum != null) {
				return false;
			}
		} else if (!housenum.equals(other.housenum)) {
			return false;
		}
		if (street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!street.equals(other.street)) {
			return false;
		}
		if (zip == null) {
			if (other.zip != null) {
				return false;
			}
		} else if (!zip.equals(other.zip)) {
			return false;
		}
		return true;
	}
	
}
