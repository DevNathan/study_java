package castingTask2;

public class Character {
	public void hunt(Monster monster) {
		if (monster instanceof Ork) {
			Ork ork = (Ork)monster;
			ork.drop();
		}
		if (monster instanceof Human) {
			Human human = (Human)monster;
			human.drop();
		}
		if (monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.drop();
		}
	}
	public static void main(String[] args) {
		Character character = new Character();
		character.hunt(new Ork());
		character.hunt(new Human());
		character.hunt(new Fairy());
	}
}
