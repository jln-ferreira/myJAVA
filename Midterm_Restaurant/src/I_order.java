import java.util.List;

public interface I_order {

    //methods for interface
    public void takeOrder(List<Item> restItem, int constID);
    public List sendOrder();
    public void clean();
}
