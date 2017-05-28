package lasl321.spikes;

public class Item {
    private int id;

    public Item(final int id) {
        this.id = id;
    }

    public Item getFoo() {
        System.out.printf("Item.getFoo:%d:%d%n", id, Thread.currentThread().getId());
        return this;
    }

    public Item getBar() {
        System.out.printf("Item.getBar:%d:%d%n", id, Thread.currentThread().getId());
        return this;
    }

    @Override
    public String toString() {
        return String.format("Item:%d", id);
    }

    public int getId() {
        return id;
    }
}
