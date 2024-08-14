package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxs.Checkbox;
import checkboxs.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
    
}
