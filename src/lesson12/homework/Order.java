package lesson12.homework;

public class Order {
    private final int id;
    private final byte[] data;

    public Order(int id) {
        this.id = id;
        this.data = new byte[1024 * 1024];
    }

    public int getId(){
        return id;
    }

    public byte[] getData(){
        return data;
    }
}
