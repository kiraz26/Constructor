package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.age=28;
		person.name="Talha";
		person.job="cok fena hasta yaniyor";
		Person person2 = new Person();
		Person person3 = new Person();
		System.out.println(person.name+" "+person.age+" "+person.job);
		
		Person p = new Person("Halil");
		
		Person p1 = new Person("Ali", 28, "Banker");
		
		System.out.println(p1.age+" "+p1.name+" "+p1.job);
		
		
	}

}
