enum Size {
    SMALL("S", "Маленький"),
    MEDIUM("M", "Средний"),
    LARGE("L", "Большой"),
    EXTRA_LARGE("XL", "Очень большой");

    private String abbreviation;
    private String description;

    Size(String abbreviation, String description) {
        this.abbreviation = abbreviation;
        this.description = description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        for (Size size : Size.values()) {
            System.out.println(size + ": " + size.getAbbreviation() + " - " + size.getDescription());
        }
    }
}
