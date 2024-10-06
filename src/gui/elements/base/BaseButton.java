package gui.elements.base;

import gui.elements.interfaces.IButton;

public abstract class BaseButton extends BaseUIElement implements IButton {
    public BaseButton(String screen, String color, int width, int height) {
        super(screen, color, width, height);
    }

    @Override
    public void click() {
        System.out.println("Button clicked");
    }

}
