package Collection;

public class StudentClass {
      int id ;
      String name;
      String city;
	public StudentClass(int id, String name, String cityString) {
		super();
		this.id = id;
		this.name = name;
		this.city = cityString;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
      
}
