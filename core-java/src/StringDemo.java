
public class StringDemo {
public static void main(String[] args) {
		
		String s1 = "Hello";	// Primitive style
		String s2 = new String("Hello");	// Object style
		String s3 = "Hello";
		
		// Compare locations
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Compare values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		System.out.println(s1.replace('e', 'a'));
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days = week.split("-");
		for (String day : days) 
			System.out.println(day);
		
		
	}
}
