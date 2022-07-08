
public class StringPatternsDemo {
	public static void main(String[] args) {
		String name = "Polo";
		String namePattern = "[A-Z]{1}[a-z]{3,}";
		
		System.out.println(name.matches(namePattern));
		
		String cell = "7438294271";
		String cellPattern = "[7-9]{1}[0-9]{9}";
		
		System.out.println(cell.matches(cellPattern));
		
		String email = "zubair@mail.com";
		String emailPattern = "[a-zA-Z0-9+_.]+@[a-z0-9.]+[a-z}{2,}";
		
		String cc = "3421943082931234";
		String ccPattern = "[1-9][0-9]{15}";
		
	}
}
