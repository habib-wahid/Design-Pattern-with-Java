import java.util.ArrayList;
import java.util.List;

interface Order{
    void execute();
}

class Stock{
    private String name = "ABC";
    private int quality = 10;

    public void buy(){
        System.out.println("Stock [Name: "+name+", Quantity: "+quality+" ] bought");
    }

    public void sell(){
        System.out.println("Stock [Name: "+name+", Quantity: "+quality+" ] sold");
    }
}

class BuyStock implements Order{
    private Stock abcStock;
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    public void execute(){
        abcStock.buy();
    }
}

class SellStock implements Order{
    private Stock abcStock;
    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute(){
        abcStock.sell();
    }
}

class Broker{
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
    }
}
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
