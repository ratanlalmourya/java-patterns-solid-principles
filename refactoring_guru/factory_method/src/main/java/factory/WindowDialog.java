package factory;


import buttons.Button;
import buttons.WindowsButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
       return new WindowsButton();
    }
    
}
