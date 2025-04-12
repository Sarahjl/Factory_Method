package padrao;

import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

//Classe cliente que usa o padrão
//Usa as fábricas (Dialog) sem saber as classes dos produtos
public class Principal {

    //Armazena a fábrica que vai ser usada (Dialog é abstrato)
    private static Dialog dialog;
    
    public static void main(String[] args) {
        configure(); //decide qual tipo de fábrica será usada
        runBusinessLogic(); //roda a lógica principal usando a fábrica
    }
    
    //configura o tipo de botão (qual tipo de fábrica) será usada
    //com base no sistema operacional
     static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

     //usa fábrica para criar e renderizar o botão
    static void runBusinessLogic() {
        //é usado apenas o método da classe abstrata Dialog sem precisar se 
        //importar com o tipo do botão
        dialog.renderWindow();
    }
}
