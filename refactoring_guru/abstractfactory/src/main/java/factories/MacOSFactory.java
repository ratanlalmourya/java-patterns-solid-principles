package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxs.Checkbox;
import checkboxs.MacOsCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
    
}
