package simpleStocks;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StockMarketImpl extends UnicastRemoteObject implements StockMarket {
    public StockMarketImpl() throws RemoteException {
        super();
    }
    
    public float get_price(String symbol) throws RemoteException {
        /* 'magical' computation of 'some' stock price */
        float price = 0;
        for (int i = 0; i < symbol.length(); i++) {
            price += (int) symbol.charAt(i);
        }
        price /= 5;
        return price;
    }
}