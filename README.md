# Weather Station
This is a simple weather station that uses the observer pattern to notify the display elements when the weather data changes.

## TODO
1. Implement the methods inherited from the `Subject` interface in the `WeatherData` class.
2. Complete the `Observer` interface by adding the `update` method.
3. Add a new display `CurrentConditionsDisplay` that displays the current temperature and humidity.
4. Update the `main` method in the `WeatherStation` class to set the measurements to:
   1. 27°C, 65% humidity and 30.4 inHg pressure.
   2. 28°C, 70% humidity and 29.2 inHg pressure.
   3. 26°C, 90% humidity and 29.2 inHg pressure.
5. Before setting the third set of measurements, remove one observer from the List of observers in the `WeatherData` class using the `removeObserver` method.

## How to add a new display
To add a new display, simply create a new class that implements the `DisplayElement` interface. Then, create a new instance of the display and pass it to the `WeatherData` class using the `registerObserver` method.

## How to run
To run the weather station, simply run the `WeatherStation` class. This will create a new weather station and display the weather data in the console.