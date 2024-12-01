package enumEx;

public class EnumWithMethod {

    // Перечисление с дополнительным методом
    public enum Color {
        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255);

        private final int red;
        private final int green;
        private final int blue;

        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public String getRgb() {
            return "RGB(" + red + ", " + green + ", " + blue + ")";
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + ": " + color.getRgb());
        }
    }
}

