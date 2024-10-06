package gui.factory;

import gui.elements.DarkButton;
import gui.elements.DarkCheckbox;
import gui.elements.interfaces.IButton;
import gui.elements.interfaces.ICheckbox;

public class DarkUIElementFactory implements IUIElementFactory {
    @Override
    public IButton createButton(String screen, int width, int height) {
        return new DarkButton(screen, width, height);
    }

    @Override
    public ICheckbox createCheckbox(String screen, int width, int height) {
        return new DarkCheckbox(screen, width, height);
    }
}
