package SWAGClass;

/**
 *
 * @author Pablo
 */

public class Observable extends java.util.Observable{
    
    Observable(){
        setChanged();
        notifyObservers();
    };
    
}
