package gui.elements.base;

import gui.elements.interfaces.UIElement;

public abstract class BaseUIElement implements UIElement {
    protected String screen; // Let's assume that it's a screen with class Screen or something like that
    protected String color;
    protected int width;
    protected int height;

    public BaseUIElement(String screen, String color, int width, int height) {
        this.screen = screen;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(int x, int y) {
        System.out.println("Rendering element on screen: " + screen + " with color: " + color + " at left-top corner (" + x + ", " + y + ") and size: " + width + "x" + height);
    }
}
