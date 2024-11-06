import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    public Screen(){
        setTitle("PJBL Programação Orientada a Objetos");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JButton jButton = new JButton("Clique aqui para continuar. ");
        jButton.setBounds(0, 0, 250, 70);
        jButton.setFont(new Font("Arial", Font.ITALIC, 40));
        jButton.setForeground(new Color(252, 252, 252));
        jButton.setBackground((new Color(0, 0, 0)));

        add(jButton);
    }
}
