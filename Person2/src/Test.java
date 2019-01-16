
public class Test {
	public static void main(String[] args){
		Person saburo = new Person("saburo");
		Person nobody = new Person(25);
		Person hanako = new Person("hanako", 17);

		System.out.println(saburo.name);
		System.out.println(saburo.age);
		System.out.println(nobody.name);
		System.out.println(nobody.age);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}
