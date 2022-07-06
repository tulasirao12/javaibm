
public class ChildDemo<Z,S> extends Demo<Z> {
	private S temp;
	
	public ChildDemo(Z data, S temp) {
		super(data);
		this.temp = temp;
	}
	
	public S getTemp() {
		return temp;
	}
	public void setTemp(S temp) {
		this.temp = temp;
	}

	
	public static void main(String[] args) {
		ChildDemo<String,Integer> cd = new ChildDemo<String, Integer>("polo", 21);
		System.out.println(cd.getData()+"\t"+cd.getTemp());
	}
	
	
	
}
