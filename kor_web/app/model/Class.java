package model;

/**
 * @author  koles
 */
public class Class {
	private String name;
	private String shortname;
	private Professor leader;
	
	public Class(String name, String shortname, Professor leader) {
		this.name = name;
		this.shortname = shortname;
		this.leader = leader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public Professor getLeader() {
		return leader;
	}

	public void setLeader(Professor leader) {
		this.leader = leader;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leader == null) ? 0 : leader.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((shortname == null) ? 0 : shortname.hashCode());
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
		if (!(obj instanceof Class)) {
			return false;
		}
		Class other = (Class) obj;
		if (leader == null) {
			if (other.leader != null) {
				return false;
			}
		} else if (!leader.equals(other.leader)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (shortname == null) {
			if (other.shortname != null) {
				return false;
			}
		} else if (!shortname.equals(other.shortname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", shortname=" + shortname + ", leader="
				+ leader + "]";
	}

	
}
