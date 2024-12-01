package enumEx;

class EnumExample {
    public enum Day {
        MONDAY("Начало недели"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Выходной день"),
        SUNDAY("Выходной день");

        private final String description;

        Day(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}

