package SWAG;

/**
 *
 * @author Pablo
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeOserver(Observer o);
    public void notifyObsevers();
    
}
