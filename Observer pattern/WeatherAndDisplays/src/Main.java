import observ.CurrDisplay;
import subj.WeatherData;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData() ;
        CurrDisplay curDisplay = new CurrDisplay();

        weatherData.setMeasurements(1,2,3);

        curDisplay.display();
        curDisplay.connect(weatherData);

        curDisplay.display();

        weatherData.setMeasurements(20,10,5);

        curDisplay.display();

        curDisplay.disconnect();
        weatherData.setMeasurements(20,10,50);

        curDisplay.display();

        curDisplay.connect(weatherData);
        curDisplay.display();


    }
}