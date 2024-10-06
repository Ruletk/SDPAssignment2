package gui.elements.base;

import gui.elements.interfaces.ICheckbox;

public abstract class BaseCheckbox extends BaseUIElement implements ICheckbox {
    private boolean isChecked = false;

    public BaseCheckbox(String screen, String color, int width, int height) {
        super(screen, color, width, height);
    }

    @Override
    public void check() {
        setChecked(true);
        System.out.println("Checkbox checked");
    }

    @Override
    public void uncheck() {
        setChecked(false);
        System.out.println("Checkbox unchecked");
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
