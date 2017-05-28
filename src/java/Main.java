import lasl321.spikes.Item;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final long start = System.currentTimeMillis();

        final List<Item> result = IntStream.range(0, 10)
                .mapToObj(Item::new)
                .map(Item::getFoo)
                .map(Item::getBar)
                .collect(Collectors.toList());


        System.out.println(result.size());

        final long difference = System.currentTimeMillis() - start;

        System.out.printf("%d ms%n", difference);
    }
}
