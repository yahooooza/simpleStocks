package simpleStocks;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

public class StockMarketServer {
    public static void main(String[] args) throws Exception {
        StockMarketImpl stockMarketImpl = new StockMarketImpl();
        try {
        	LocateRegistry.createRegistry( 1099 );
            Naming.rebind("NASDAQ", stockMarketImpl);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
