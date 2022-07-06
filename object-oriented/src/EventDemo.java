class EventImpl implements Event {

	@Override
	public void perform() {
	
		System.out.println("class-level implementation");
		
	}

}

public class EventDemo {
	class InnerEventImpl implements Event{

		@Override
		public void perform() {
			
			System.out.println("Inner-class Implementation");
			
		}
		
	}
	static class StaticInnerEventImpl implements Event{

		@Override
		public void perform() {
			System.out.println("StaticInner-class Implementation");
			
		}
		
	}
	public void nestedEvent() {
		class NestedEventImpl implements Event{

			@Override
			public void perform() {
				System.out.println("Nested class IMplementation");
				
			}
			
		};
		new NestedEventImpl().perform();
	}
	public void oneMoreEvent() {
		new Event() {

			@Override
			public void perform() {
				System.out.println("Annoymus class implementation");
				
			}
			
		}.perform();
	}
		
	public void oneLastEvent() {
		Event e = () -> System.out.println("Lambda evnet implementation");
		e.perform();
		
	}
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		
		e1.perform();
		
		EventDemo demo = new EventDemo();
		InnerEventImpl e2 = demo.new InnerEventImpl();
		e2.perform();
		EventDemo.StaticInnerEventImpl e3 = new EventDemo.StaticInnerEventImpl();
		e3.perform();
		demo.nestedEvent();
		demo.oneMoreEvent();
		demo.oneLastEvent();
	}
}
