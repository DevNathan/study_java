package optionalTest;

public class User {
	private long id;
	private String userName;
	private String userID;
	private String userPassword;
	private static long seq;
	
	static {
		seq = 0;
	}
	{
		seq++;
	}
}
