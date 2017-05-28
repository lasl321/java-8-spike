package Main2

import lasl321.spikes.ItemG

class Main2 {
    static void main(String[] args) {
        final long start = System.currentTimeMillis();

        final List<ItemG> result = (0..9).collect { Integer i -> new ItemG(i) }
                .collect { it.foo }
                .collect { it.bar }

        System.out.println(result.size());

        final long difference = System.currentTimeMillis() - start;

        System.out.printf("%d ms%n", difference);
    }
}
