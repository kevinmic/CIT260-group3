package byui.cit260.oregonTrail.view;

public class KevinMenu {
    private String description;
    private KevinMenuItem[] options;

    public KevinMenu(String description, KevinMenuItem[] options) {
        this.description = description;
        this.options = options;
    }

    public String getDescription() {
        return description;
    }

    public KevinMenuItem[] getOptions() {
        return options;
    }
}
