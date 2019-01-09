import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title){
        super(title);
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        JButton button = new JButton("Convert");
        JTextArea value1 = new JTextArea();
        JLabel labelMetric = new JLabel("centimeters");
        JLabel labelImperial = new JLabel("inches");
        String[] options = {"metric to imperial", "imperial to metric" };
        JComboBox unitSystem = new JComboBox(options);
        Container c = getContentPane();

        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 3;
        gbc.gridy = 0;
        c.add(unitSystem, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(value1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        c.add(labelMetric, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        c.add(labelImperial, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(button, gbc);

    }
}
