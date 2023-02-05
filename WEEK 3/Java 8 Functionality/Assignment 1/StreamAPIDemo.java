import java.util.*;

class StreamAPIDemo
{
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        strings.stream()
       .filter(s -> s.length() > 5 && s.length() < 8)
       .forEach(System.out::println);

    
    }
}
