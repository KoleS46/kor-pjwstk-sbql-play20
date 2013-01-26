package model;

/**
 * @author  koles
 */
public class Person {
	private String fname;
	private String sname;
	private Boolean married;
	private Integer age;
	private Address address;
	
	public Person(String fname, String sname, Boolean married, Integer age,
			Address address) {
		this.fname = fname;
		this.sname = sname;
		this.married = married;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", sname=" + sname + ", married="
				+ married + ", age=" + age + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getfname() {
		return fname;
	}

	public void setfname(String fname) {
		this.fname = fname;
	}

	public String getsname() {
		return sname;
	}

	public void setsname(String sname) {
		this.sname = sname;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((married == null) ? 0 : married.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
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
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (age == null) {
			if (other.age != null) {
				return false;
			}
		} else if (!age.equals(other.age)) {
			return false;
		}
		if (fname == null) {
			if (other.fname != null) {
				return false;
			}
		} else if (!fname.equals(other.fname)) {
			return false;
		}
		if (married == null) {
			if (other.married != null) {
				return false;
			}
		} else if (!married.equals(other.married)) {
			return false;
		}
		if (sname == null) {
			if (other.sname != null) {
				return false;
			}
		} else if (!sname.equals(other.sname)) {
			return false;
		}
		return true;
	}
}
