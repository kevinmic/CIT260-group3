package byui.cit260.oregonTrail.view;

import java.util.function.Consumer;

public class KevinMenuItem {
    String keyPress;
    String description;
    Runnable consumer;

    public KevinMenuItem(String keyPress, String description, Runnable consumer) {
        this.keyPress = keyPress;
        this.description = description;
        this.consumer = consumer;
    }

    public String getKeyPress() {
        return keyPress;
    }

    public String getDescription() {
        return description;
    }

    public Runnable getConsumer() {
        return consumer;
    }
}
