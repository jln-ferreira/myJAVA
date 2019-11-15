import java.util.List;

public class Chef extends Staff implements I_order {

    //method
    public boolean prepareTheOrder(){
        return true;
    }


    //methods from INTERFACE class I_order
    @Override
    public void takeOrder(List<Item> restItem, int constID) {

    }

    @Override
    public List sendOrder() {
        return null;
    }

    @Override
    public void clean() {

    }
}
