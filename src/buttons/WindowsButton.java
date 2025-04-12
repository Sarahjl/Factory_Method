package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

//Produto concreto
//O botão usa JAVA GUI pra criar butão real com clique
//O Factory Method permite usar esse tipo de botão sem deixar que o cliente saiba

//Implementação concreta da interface Button com interface gráfica do Windows
public class WindowsButton implements Button {
    //componentes da interface gráfica
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;
    
    //método que renderiza o botão e janela
     public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }
     
    //método que define o comportsmento do clique para fechar a aplicação
     public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
