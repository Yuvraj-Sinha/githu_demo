package githu_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer>  al=new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
	//	Stream<Integer> s=Stream.of(99,999,9999,99999);
		al.stream().forEach(System.out::println);
		List<Integer> l=al.stream().map(i->i*i).collect(Collectors.toList());
		List<Integer> l2=al.stream().filter(i->true).collect(Collectors.toList());
	      l2.forEach(System.out::println);
		//s.close();
	     Predicate<Integer> b=i->i%2==0;
	     Predicate<Integer> B=i->i%3==0;
	     System.out.println(b.test(4));
	      boolean c=b.and(B).test(12);
	         System.out.println(b.negate().test(4));
	        System.out.println(c);
	        Function<Integer, Double> half = a -> a / 2.0;
	                half=half.andThen(a -> 3 * a);
	                
	                System.out.println(half.apply(4));
	                Function<Integer, Double> halff = a -> a / 2.0;    
	                halff = halff.compose(a -> 3 * a);
	                System.out.println(halff.apply(4));
	                
		}

}
