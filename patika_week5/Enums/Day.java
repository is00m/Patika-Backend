package Enums;

public enum Day {
    SUNDAY("9:00 AM - 5:00 PM"),
    MONDAY("9:00 AM - 5:00 PM"),
    TUESDAY("9:00 AM - 5:00 PM"),
    WEDNESDAY("9:00 AM - 5:00 PM"),
    THURSDAY("9:00 AM - 5:00 PM"),
    FRIDAY("9:00 AM - 5:00 PM"),
    SATURDAY("9:00 AM - 5:00 PM");

    private String workHours;

    Day(String workHours) {
        this.workHours = workHours;
    }

    public String getWorkHours() {
        return workHours;
    }
}



