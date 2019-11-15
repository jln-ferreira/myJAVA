import java.util.List;

public class Costumers extends Staff implements I_order {

    //proprieties/ fields
    private int costumerID;
    private List<Item> ListItens;

    //SETTERS
    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public void setListItens(List<Item> listItens) {
        ListItens = listItens;
    }

    //GETTERS
    public int getCostumerID() {
        return costumerID;
    }

    public List<Item> getListItens() {
        return ListItens;
    }

    //method
    public void makeOrder(List<Item> ListItem){

    }

    public void billRequest(){

    }

    private double addTips(){
    return 1.1;
    }

    public double payBill(){
        return 1.1;
    }

    public void makeReservation(){

    }

    public boolean sit(){
    return false;
    }

    public void eatFood(){

    }

    public void addOrder(Item item){

    }

    public void removeItem(Item item){

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

