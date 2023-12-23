package observ;

import subj.Subject;

public class CurrDisplay implements Observer{
    private double temperature ;
    private double humidity ;
    private  double pressure ;

    private  Subject supplier ;

    @Override
    public void display() {
        System.out.println("The temperature : " + this.temperature );
        System.out.println("The humidity : " + this.humidity);
        System.out.println("The pressure : " + this.pressure);
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature ;
        this.pressure = pressure ;
        this.humidity = humidity ;
    }

    @Override
    public  void connect (Subject supplier) {
        this.supplier = supplier ;
        supplier.registerObserver(this);
    }

    @Override
    public void disconnect() {
        if (this.supplier ==null)
            return;
        supplier.removeObserver(this) ;
        this.supplier = null ;
    }


    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
