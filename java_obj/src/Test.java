public class Test {
 public static void main(String[] args){
	Robot aibo = new Robot();
	Robot asimo = new Robot();
	Robot pepper = new Robot();

	aibo.name = "aibo";
	asimo.name = "asimo";
	pepper.name = "pepper";

	aibo.talk();
	asimo.talk();
	pepper.talk();

	aibo.walk();
	asimo.walk();
	pepper.walk();

	aibo.run();
	asimo.run();
	pepper.run();
  }
}
