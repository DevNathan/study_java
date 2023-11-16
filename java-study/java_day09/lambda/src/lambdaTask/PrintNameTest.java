package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
		PrintName printName = (family, name) -> family + name;
		
		System.out.println(printName.getFullName("Á¶", "³²È£"));
	}
}
