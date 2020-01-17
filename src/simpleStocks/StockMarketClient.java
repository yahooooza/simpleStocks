package simpleStocks;
 
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
 
public class StockMarketClient {
    public static void main(String[] args) throws Exception {
        StockMarket market =
            (StockMarket) Naming.lookup("rmi://localhost/NASDAQ");
        System.out.println("The price of MY COMPANY is "
            + market.get_price("MY_COMPANY"));
    }
}
