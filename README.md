# Weather Forecast Application

## 🌦️ Description
This is a Spring Boot-based web application that fetches real-time weather data using the OpenWeatherMap API. It allows users to search for a city and view:
- Current temperature
- Humidity
- 5-day forecast

## 🚀 Features
- Search weather by city
- Display temperature in Celsius
- Show humidity levels
- 5-day forecast using OpenWeatherMap API
- Responsive UI using Thymeleaf

## 🧰 Technologies Used
- Java
- Spring Boot
- REST API integration
- JSON parsing with Jackson
- Thymeleaf for frontend

## 🔌 Setup Instructions

### 1. Clone or Download the Project
```bash
git clone https://github.com/YOUR_USERNAME/WeatherForecastApp.git
```
Or download the ZIP and extract it.

### 2. Get OpenWeatherMap API Key
- Go to [https://openweathermap.org/api](https://openweathermap.org/api)
- Create an account and get a **free API key**

### 3. Configure API Key
Open `WeatherService.java` and replace:

```java
private static final String API_KEY = "YOUR_API_KEY";
```

with your actual API key.

### 4. Run the Application
```bash
./mvnw spring-boot:run
```
or run the `main` class from your IDE.

### 5. Access the App
Go to [http://localhost:8080](http://localhost:8080) and search for any city.

## 📷 Screenshots
- Home page with city input
- Result page showing forecast in a table

## 🤖 Example Cities to Try
- London
- New York
- Delhi
- Tokyo
- Sydney
