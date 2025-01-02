package classes;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String str = null;
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional);
		
		System.out.println(optional.isPresent());
		  
		// orElse prints the if the value is present in variable ->
		//like above 'str',if ablove varable is empty it will print below mentioned 'Lal PArmar'
		System.out.println(optional.orElse("Lal Parmar")); 
	}
}
