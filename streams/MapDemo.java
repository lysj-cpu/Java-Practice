package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo {

  static Map<String, Integer> stringToLength(List<String> strings) {
  // Produce a map that maps each string to its length
  // Using stream
    return strings.stream().collect(Collectors.toMap(
            // A key mapper
            Function.identity() // identity function
            ,
            String::length
            // A value mapper
    ));
  }

  public static void main(String[] args) {
    System.out.println(stringToLength(List.of("Hello", "Everyone", "Welcome")));
    // When done with a stream, duplicates in a map will fail
  }

}


