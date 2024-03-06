package weatherstation.display;

import weatherstation.Observer;
import weatherstation.WeatherData;
import weatherstation.display.DisplayElement;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex = 0.0f;

    public HeatIndexDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temp, humidity);
        display();
    }

    private float computeHeatIndex(float t, float rh) {
        float c1 = -8.78469475556f;
        float c2 = 1.61139411f;
        float c3 = 2.33854883889f;
        float c4 = -0.14611605f;
        float c5 = -0.012308094f;
        float c6 = -0.0164248277778f;
        float c7 = 0.002211732f;
        float c8 = 0.00072546f;
        float c9 = -0.000003582f;

        return (c1 +
                c2 * t +
                c3 * rh +
                c4 * t * rh +
                c5 * t * t +
                c6 * rh * rh +
                c7 * t * t * rh +
                c8 * t * rh * rh +
                c9 * t * t * rh * rh);
    }

    public void display() {
        System.out.println("Heat index is " + heatIndex + "°C");
    }
}
