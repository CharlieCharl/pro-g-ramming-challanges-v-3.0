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




        JLabel labelImperial = new JLabel("inches");
        String[] options = {"Length", "Temperature", "Area", "Volume", "Weight", "Time" };
        String[] metricLength = {"meter", "kilometer", "centimeter", "millimeter", "micrometer", "nanometer", "mile",
                                "yard", "foot", "inch", "light year"};


        JList<String> lengthUnitsFrom = new JList<String>(metricLength);
        JList<String> lengthUnitsTo = new JList<String>(metricLength);
        lengthUnitsFrom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lengthUnitsFrom.setLayoutOrientation(JList.VERTICAL);
        lengthUnitsFrom.setVisibleRowCount(4);

        lengthUnitsTo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lengthUnitsTo.setLayoutOrientation(JList.VERTICAL);
        lengthUnitsTo.setVisibleRowCount(4);

        JScrollPane listScrollerFrom =  new JScrollPane(lengthUnitsFrom);
        JScrollPane listScrollerTo =  new JScrollPane(lengthUnitsTo);
        //listScrollerFrom.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //listScrollerFrom.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

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
        c.add(listScrollerFrom, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        c.add(listScrollerTo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(button, gbc);

    }
}
