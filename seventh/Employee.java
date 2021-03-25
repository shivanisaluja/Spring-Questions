package seventh;

public class Employee {
	
	String name;
	Address add;
	Department dep;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Hno=" + add.getHno() + ", City=" + add.getCity() + ", dep=" + dep.getDepName() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}

}
