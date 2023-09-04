import javax.swing.*;

public class interfaceJava {
    public static void main(String[] args) {
        // Criando uma janela JFrame
        JFrame frame = new JFrame("Exibição de Informações");

        // Definindo o  tamanho da janela
        frame.setSize(300, 200);

        // Definindo o comportamento do fechamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um rótulo JLabel para exibir a informação
        JLabel label = new JLabel("Olá, mundo!");

        // Adicionando o rótulo à janela
        frame.getContentPane().add(label);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}