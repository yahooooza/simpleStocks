package simpleStocks;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StockMarket extends Remote {
    float get_price(String symbol) throws RemoteException;
}
