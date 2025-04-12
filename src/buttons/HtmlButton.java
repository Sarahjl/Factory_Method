package buttons;

//Implementação concreta do produto Button
//o botão simula um botão HTML sem GUI
public class HtmlButton implements Button {
    
    //simula renderização do botão HTML
    public void render(){
        System.out.println("<button>Teste Botão</button>");
        onClick(); //chama o comportamento do botão ao clicar
    }
    
    //método que simula a ação do botão ao clicar
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
