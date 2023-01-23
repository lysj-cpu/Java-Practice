package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> someStrings = List.of("a", "bo", "c", "dab");

        var lengthsDoubled = someStrings.stream()
                .map(String::length)
                .map(item -> 2 * item)
                .toList();

//        lengthsDoubled.add(20);
        System.out.println(lengthsDoubled);
    }

}

