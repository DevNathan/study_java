package marker;

public class Bear extends Animal implements CarnivoreMarker{
	String name = "��";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
