package Enum;

public enum Weekday {
        MONDAY ("Понедельник", "WeekDay"),
        TUESDAY ("Вторник", "WeekDay"),
        WEDNESDAY ("Среда", "WeekDay"),
        THURSDAY ("Четверг", "WeekDay"),
        FRIDAY ("Пятница", "WeekDay"),
        SATURDAY ("Суббота", "Holiday"),
        SUNDAY ("Воскресенье", "Holiday");

        private String name;
        private String day;

        Weekday(String name, String day) {
            this.name = name;
            this.day = day;
        }

        boolean isWeekDay() {
            return day.equals("WeekDay");
        }

        boolean isHoliday() {
            return day.equals("Holiday");
        }

        @Override
        public String toString() {
            return name;
        }

        public static void main(String[] args) {
            for (Weekday weekday : Weekday.values()) {
                if (weekday.isWeekDay()) {
                System.out.println(weekday + " является рабочим днём");
                } else if (weekday.isHoliday()){
                System.out.println(weekday + " является выходным днём");
            }
        }
    }
}



