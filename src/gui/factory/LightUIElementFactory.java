package gui.factory;

import gui.elements.LightButton;
import gui.elements.LightCheckbox;
import gui.elements.interfaces.IButton;
import gui.elements.interfaces.ICheckbox;

public class LightUIElementFactory implements IUIElementFactory {
    @Override
    public IButton createButton(String screen, int width, int height) {
        return new LightButton(screen, width, height);
    }

    @Override
    public ICheckbox createCheckbox(String screen, int width, int height) {
        return new LightCheckbox(screen, width, height);
    }
}
