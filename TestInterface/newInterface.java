import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class newInterface {
    
    public static void main(String[] args) {
        // Componente JFrame
        JFrame miJFrame = new JFrame("Exemplo - Java Swing");
        miJFrame.setSize(500, 300);

        // Componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // Usamos este layout para centralizar os componentes do JPanel
        miJPanel.setLayout(new GridBagLayout());

        // Componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("O que dizer sobre JS:  ");

        // Componente JTextArea
        JTextArea miJTextArea = new JTextArea(5, 20);

        // Conecta os componentes JLabel e JTextField em JPanel
        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);

        // Conectar JPanel a JFrame
        miJFrame.add(miJPanel);

        // Tornar o JFrame visível
        miJFrame.setVisible(true);
    }
}
