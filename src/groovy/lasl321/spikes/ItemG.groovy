package lasl321.spikes

class ItemG {
    private int id

    ItemG(int id) {
        this.id = id
    }

    ItemG getFoo() {
        System.out.printf("Item.getFoo:%d:%d%n", id, Thread.currentThread().getId());
        this;
    }

    ItemG getBar() {
        System.out.printf("Item.getBar:%d:%d%n", id, Thread.currentThread().getId());
        this;
    }
}