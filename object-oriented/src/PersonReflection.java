import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class PersonReflection {
	public static void main(String[] args) throws ClassNotFoundException {
	//	Person p = new Person("Kim",29);
		
//		Class pc = p.getClass(); // getting class of the obj created.
	Class pc = Class.forName("Person");
		System.out.println(pc.getName());
		
		System.out.println(" --List of constructors:");
		int i=0,j=0;
		Constructor[] constructors = pc.getConstructors();
		for(Constructor c:constructors ) {
			System.out.println(c);
			i++;
		}
		System.out.println(i);
		System.out.println("--List of methods:");
		Method[] methods = pc.getMethods();
		for(Method m: methods) {
			System.out.println(m);
			j++;
		}
		System.out.println(j);
		
		System.out.println("--List of methods of person class");
		Method[] decmethods = pc.getDeclaredMethods();
		for(Method m:decmethods) {
			System.out.println(m);
		}
		//print all the fields
		System.out.println("--List of fields");
		Field[] fields = pc.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
	}
}
