package model;

import java.util.Date;
import java.util.List;

/**
 * @author  koles
 */
public class Student {

	private String fname;
	private String sname;
	private Boolean married;
	private Integer age;
	private Address address;
	private Integer indexnum;
	private Date startdate;
	private Date graddate;
	private Double average;
	private Professor promoter;
	private Integer year;
	private List<Class> classes;
	
	public Student(String fname, String sname, Boolean married, Integer age,
			Address address, Integer indexnum, Date startdate, Date graddate,
			Double average, Professor promoter, Integer year,
			List<Class> classes) {
		this.fname = fname;
		this.sname = sname;
		this.married = married;
		this.age = age;
		this.address = address;
		this.indexnum = indexnum;
		this.startdate = startdate;
		this.graddate = graddate;
		this.average = average;
		this.promoter = promoter;
		this.year = year;
		this.classes = classes;
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

	public Integer getIndexnum() {
		return indexnum;
	}

	public void setIndexnum(Integer indexnum) {
		this.indexnum = indexnum;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getGraddate() {
		return graddate;
	}

	public void setGraddate(Date graddate) {
		this.graddate = graddate;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Professor getPromoter() {
		return promoter;
	}

	public void setPromoter(Professor promoter) {
		this.promoter = promoter;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<Class> getClasses() {
		return classes;
	}

	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((average == null) ? 0 : average.hashCode());
		result = prime * result + ((classes == null) ? 0 : classes.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result
				+ ((graddate == null) ? 0 : graddate.hashCode());
		result = prime * result
				+ ((indexnum == null) ? 0 : indexnum.hashCode());
		result = prime * result + ((married == null) ? 0 : married.hashCode());
		result = prime * result
				+ ((promoter == null) ? 0 : promoter.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result
				+ ((startdate == null) ? 0 : startdate.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
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
		if (average == null) {
			if (other.average != null) {
				return false;
			}
		} else if (!average.equals(other.average)) {
			return false;
		}
		if (classes == null) {
			if (other.classes != null) {
				return false;
			}
		} else if (!classes.equals(other.classes)) {
			return false;
		}
		if (fname == null) {
			if (other.fname != null) {
				return false;
			}
		} else if (!fname.equals(other.fname)) {
			return false;
		}
		if (graddate == null) {
			if (other.graddate != null) {
				return false;
			}
		} else if (!graddate.equals(other.graddate)) {
			return false;
		}
		if (indexnum == null) {
			if (other.indexnum != null) {
				return false;
			}
		} else if (!indexnum.equals(other.indexnum)) {
			return false;
		}
		if (married == null) {
			if (other.married != null) {
				return false;
			}
		} else if (!married.equals(other.married)) {
			return false;
		}
		if (promoter == null) {
			if (other.promoter != null) {
				return false;
			}
		} else if (!promoter.equals(other.promoter)) {
			return false;
		}
		if (sname == null) {
			if (other.sname != null) {
				return false;
			}
		} else if (!sname.equals(other.sname)) {
			return false;
		}
		if (startdate == null) {
			if (other.startdate != null) {
				return false;
			}
		} else if (!startdate.equals(other.startdate)) {
			return false;
		}
		if (year == null) {
			if (other.year != null) {
				return false;
			}
		} else if (!year.equals(other.year)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", sname=" + sname + ", married="
				+ married + ", age=" + age + ", address=" + address
				+ ", indexnum=" + indexnum + ", startdate=" + startdate
				+ ", graddate=" + graddate + ", average=" + average
				+ ", promoter=" + promoter + ", year=" + year + ", classes="
				+ classes + "]";
	}

}
