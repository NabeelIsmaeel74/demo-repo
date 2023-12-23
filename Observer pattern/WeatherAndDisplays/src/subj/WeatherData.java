package subj;

import observ.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements  Subject{
    private double temperature ;
    private double humidity ;
    private  double pressure ;

    private List<Observer> observerList = new ArrayList<>() ;

    public void notifyAllObservers() {
        for (int i  = 0 ; i<observerList.size() ; i++) {
            observerList.get(i).update(this.temperature ,this.pressure , this.humidity );
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer) ;
        observer.update(this.temperature ,this.pressure , this.humidity );
    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = observerList.indexOf(observer) ;
        if (idx>=0)
            observerList.remove(idx) ;
    }

    @Override
    public void notifyObservers() {
        notifyAllObservers();
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public double getPressure() {
        return this.pressure;
    }

    public  void setMeasurements(float temperature, float humidity , float pressure) {
        this.temperature  = temperature ;
        this.humidity = humidity ;
        this.pressure = pressure ;
        notifyObservers();
    }
}
