package buttons;

//Interface comum entre os produtos criados pela fábrica.
//Define o contrato que todos os botões devem seguir
public interface Button {
    void render(); //método para desenhar botão
    void onClick(); //método para definir o comportamento do botão ao clicar
}
