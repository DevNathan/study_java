package objectTest;

class Sports {
	private String type;
	private int total;

public Sports() {
	;
}

public Sports(String type, int total) {
	super();
	this.type = type;
	this.total = total;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

@Override
public String toString() {
	return "Sports [type=" + type + ", total=" + total + "]";
}

}

public class ToStringTest {
	public static void main(String[] args) {
		String ball = "ball";
		Sports sport_basketball = new Sports();
		Sports sport_baseball = new Sports(ball, 20);
		
		sport_basketball.setType(ball);
		sport_basketball.setTotal(10);
		System.out.println(sport_basketball);
		System.out.println(sport_baseball);
	}
}
