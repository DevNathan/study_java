package marker;

public class Cow extends Animal implements HerbivoreMarker{
	String name = "��";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
