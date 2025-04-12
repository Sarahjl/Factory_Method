package factory;

import buttons.Button;

//Classe abstrata
//Declara o método fábrica abstrato
public abstract class Dialog {
    
    //método que renderiza a interface da janela
    public void renderWindow() {
        //usa o método fábrica para obter botão,
        //sem saber qual classe concreta usar (HtmlButton ou WindowsButton)
        Button okButton = createButton(); //Factory Method
        okButton.render(); //renderiza botão
    }

    //factory method que será sobrescrito pelas subclasses
    //para retornar o tipo correto de botão
    public abstract Button createButton();
}
