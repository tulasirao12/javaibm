@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String sayBye() {
		return "Asta la vista";
	}
	static void greet() {
		System.out.println("happy holidays");
	}
}
