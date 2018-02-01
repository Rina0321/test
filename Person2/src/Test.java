
public class Test {

	public static void main(String[] args) {
		Person p=new Person(0);

		Person tarou=new Person(0);
		tarou.name="tarou";
		tarou.age=18;

		System.out.println(tarou.name);
		System.out.println(tarou.age);


		Person jiro=new Person("jiro",20);

		System.out.println("jiro.name");
		System.out.println(jiro.age);


		Person saburo=new Person("saburo");

		System.out.println(saburo.name);
		System.out.println(saburo.age);


		Person noname=new Person(25);

		System.out.println(noname.name);
		System.out.println(noname.age);


		Person hanako3=new Person(17,"hanako");

		System.out.println(hanako3.name);
		System.out.println(hanako3.age);
	}

}
