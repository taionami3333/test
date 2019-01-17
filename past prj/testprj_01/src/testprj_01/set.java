package testprj_01;
import java.util.HashSet;
import java.util.Set;

public class set{
	public static void main(String[] args){
		Set<String>set = new HashSet<String>();

		set.add("Value1");
		set.add("Value2");
		set.add("Value3");
		set.add("Value4");
		set.add("Value5");

		set.add("Value2");

		for(String s :set){
		 System.out.println(s);
		}
	}
}