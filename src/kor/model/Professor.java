package kor.model;

/**
 * @author  koles
 */
public class Professor {

	private String fname;
	private String sname;
	private Boolean married;
	private Integer age;
	private Address address;
	private String title;
	private Integer pensum;
	
	public Professor(String fname, String sname, Boolean married, Integer age,
			Address address, String title, Integer pensum) {
		this.fname = fname;
		this.sname = sname;
		this.married = married;
		this.age = age;
		this.address = address;
		this.title = title;
		this.pensum = pensum;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPensum() {
		return pensum;
	}
	public void setPensum(Integer pensum) {
		this.pensum = pensum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((married == null) ? 0 : married.hashCode());
		result = prime * result + ((pensum == null) ? 0 : pensum.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (!(obj instanceof Professor)) {
			return false;
		}
		Professor other = (Professor) obj;
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
		if (pensum == null) {
			if (other.pensum != null) {
				return false;
			}
		} else if (!pensum.equals(other.pensum)) {
			return false;
		}
		if (sname == null) {
			if (other.sname != null) {
				return false;
			}
		} else if (!sname.equals(other.sname)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Professor [fname=" + fname + ", sname=" + sname + ", married="
				+ married + ", age=" + age + ", address=" + address
				+ ", title=" + title + ", pensum=" + pensum + "]";
	}

	
}
