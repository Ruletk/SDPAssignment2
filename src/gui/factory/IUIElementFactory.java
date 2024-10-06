package gui.factory;

import gui.elements.interfaces.IButton;
import gui.elements.interfaces.ICheckbox;

public interface IUIElementFactory {
    IButton createButton(String screen, int width, int height);
    ICheckbox createCheckbox(String screen, int width, int height);
}
