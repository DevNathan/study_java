package marker;

public class Dog extends Animal implements OmnivoreMarker{
	String name = "��";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
