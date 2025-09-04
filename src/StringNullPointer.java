import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringNullPointer {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("hello", "world", null, "java", "8");
		
		List<String> wordList = words.stream().filter(word -> word != null && word.length()> 4).map(String::toUpperCase)
		.collect(Collectors.toList());
		
		System.out.println(wordList);
	}

}
