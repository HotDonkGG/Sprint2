class WeatherCalendar {
    String month = "Октябрь";
    int numberOfDays = 31;
    int rainyDays;
    int year = 2020;
    boolean isRainyMonth;
    public WeatherCalendar(String monthName, int monthNumberOfDays) {
        monthName = month;
        monthNumberOfDays = numberOfDays;

    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays = rainyDays + 1;
    }
}