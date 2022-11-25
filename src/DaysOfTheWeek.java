public enum DaysOfTheWeek {
    MONDAY("Duyshomby kunu English sabagayn okuym"),
    TUESDAY("Sheyshenbi kunu SOFT SKILLS"),
    WEDNESDAY("Sharshembi kunu OOP"),
    THURSDAY("Beyshenbi kunu EXTRA SESSION"),
    FRIDAY("Juma kunu COMPUTER LITERACY "),
    SATURDAY("Ishke baram "),
    SUNDAY("Ishke baram");
    private  String days;

    DaysOfTheWeek(String days) {
        this.days = days;
    }


    public String getDays() {
        return days;
    }

    @Override

    public String toString() {
        return days ;

    }

    public void setDays(String days) {
        this.days = days;
    }
}
