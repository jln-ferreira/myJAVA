import java.util.List;

public class Waitress extends Staff implements I_order {

    //proprieties/ fields
    private List<Costumers> ListCostumers;



    //SETTERS
    public void setListCostumers(List<Costumers> listCostumers) {
        ListCostumers = listCostumers;
    }

    //GETTERS
    public List<Costumers> getListCostumers() {
        return ListCostumers;
    }


    //method
    public double getBill(){
        return 1.2;
    }

    public List<Item> orderToChef(){
        return null;
    }

    public void showTheMenu(List<Item> list){

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
