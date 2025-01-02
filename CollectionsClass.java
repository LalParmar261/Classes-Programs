package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionsClass{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,4,2,6,3,8,7,9);
		
		long count = list.stream().count();
		System.out.println("Totals: " +count);// counts the number----
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println( "Max: " + max.get()); // max using stream-----------
		
		List<Integer> distnict = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distnicts Elements: " + distnict); //distnict elements--------
		
		System.out.println(Collections.max(list)); // max
		
		Collections.reverse(list);
		System.out.println(list);// reverse
		
		Collections.sort(list);
		System.out.println("Sorted: " + list);// sorting
		
		Collections.shuffle(list);
		System.out.println(list);// shuffling
		
		List<Integer> unmodifiable = Collections.unmodifiableList(list); // immutable list----
		System.out.println(list);
		
		
	}
}
