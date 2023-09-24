public class Item extends GameObject {

    private int price;

    public Item(int id, String name, Position position, int price) {
        super(id, name, position);
        this.price = price;
    }
}
