package factory;

import buttons.Button;
import buttons.HtmlButton;

//Subclasse concreta da classe Dialog
//Implementa o factory method para retornar um botão HTML
public class HtmlDialog extends Dialog {
    
    //implementa concretamente o factory method
     @Override
    public Button createButton() {
        return new HtmlButton(); //retorna um botão HTML
    }
}
