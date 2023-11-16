package marker;

public class Lab {
	public void checkKinds(Animal[] arAnimal) {
		for (int i = 0; i < arAnimal.length; i++) {
			if(arAnimal[i] instanceof CarnivoreMarker) {
				CarnivoreMarker carnivore = (CarnivoreMarker) arAnimal[i];
				System.out.println("육식동물");
			} else if(arAnimal[i] instanceof HerbivoreMarker) {
				HerbivoreMarker herbivore = (HerbivoreMarker) arAnimal[i];
				System.out.println("초식동물");
			} else {
				OmnivoreMarker omnivore = (OmnivoreMarker) arAnimal[i];
				System.out.printf("잡식동물");
			}
		}
	}
	
	public static void main(String[] args) {
		new Lab().checkKinds(new Animal[] {new Bear(), new Cow(), new Tiger(), new Dog()});
	}
}