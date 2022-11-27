package hasa;

public class HasaTest {
	public static void main(String[] args) {
		Car c= new Car();
		c.setCarmodel(1234);
		c.setCarname("KIA");
		
		Engine e = new Engine();
		e.setEngineno(123);
		e.setEnginecc(125);
		
		Engine e1 = new Engine();
		e1.setEngineno(135);
		e1.setEnginecc(256);
		
		Cover d = new Cover();
		d.setType("poo");
		
		c.setEngine(e1);// HAS-A concept used , c.setEngine(c)== o/p 1234 "kia"
		System.out.println(c.getCarmodel()+"\t"+c.getCarname());
		System.out.println(e1.getEngineno()+"\t"+e1.getEnginecc());
		System.out.println(d.getType());
	}
	

}
