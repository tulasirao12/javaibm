public class Person implements Cloneable{
	private String name;
	private int age;
	public Person(){
		this("Anonymas",-1);
	}
	public  Person(String pname, int page) {
		name = pname;
		age = page;
	}
	public void print() {
		System.out.println("Name: "+ name +"\tAge: "+ age);
	}
	
	@Override
	public String toString() {
		
		return "Name: "+ name +"\tAge: "+ age;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.name.equals(this.name) && p.age== this.age)
				return true;
		
		else 
			return false;
		
	 }
		return false;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("polo", 21); // Object defination;
		//declaration  // instanation
		
		//p.print();
		
		Person p2 = new Person("polo", 21);
		//p2.print();
		
		
		System.out.println(p2);
		
		
		Person pc = (Person) p.clone();
		System.out.println(p);
		System.out.println(pc);
		System.out.println(p.equals(p2));
	}
}