package factory;

import buttons.Button;
import buttons.WindowsButton;

//Subclasse concreta da classe Dialog
//Implementa o factory method para retornar um botão com interface gráfica
public class WindowsDialog extends Dialog {
    
    //implementa o factory method
    @Override
    public Button createButton() {
        return new WindowsButton(); //retorna um WindowsButton
    }
}
