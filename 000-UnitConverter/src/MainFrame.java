import javax.lang.model.element.NestingKind;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton button;
    private JTextField inputData;
    private JLabel resultLabel;
    private JList<String> lengthUnitsFrom;
    private JList<String> lengthUnitsTo;


    public MainFrame(){
        this.setTitle("Unit converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        this.setSize(400,300);

        button = new JButton("Convert");
        inputData = new JTextField();


        resultLabel = new JLabel();
        String[] options = {"Length", "Temperature", "Area", "Volume", "Weight", "Time" };
        String[] metricLength = {"meter", "kilometer", "centimeter", "millimeter", "micrometer", "nanometer", "mile",
                                "yard", "foot", "inch", "light year"};
        String[] temperatureUnits = {"celsius", "kelvin", "fahrenheit"};


        lengthUnitsFrom = new JList<String>(metricLength);
        lengthUnitsTo = new JList<String>(metricLength);

        lengthUnitsFrom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lengthUnitsFrom.setLayoutOrientation(JList.VERTICAL);
        lengthUnitsFrom.setVisibleRowCount(4);


        lengthUnitsTo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lengthUnitsTo.setLayoutOrientation(JList.VERTICAL);
        lengthUnitsTo.setVisibleRowCount(4);

        JScrollPane listScrollerFrom =  new JScrollPane(lengthUnitsFrom);
        JScrollPane listScrollerTo =  new JScrollPane(lengthUnitsTo);


        resultLabel.setText("test");

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
        c.add(inputData, gbc);

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

        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(resultLabel, gbc);

    }

    public int getResult(){
        return Integer.parseInt(resultLabel.getText());
    }

    public double getDataInput(){
        return Integer.parseInt(inputData.getText());
    }

    public void setResultLabel(String value){
        resultLabel.setText(value);
    }

    void addConvertButtonListener(ActionListener listenForConvertButton){
        button.addActionListener(listenForConvertButton);
    }

    void addLengthUnitsFromListener(ListSelectionListener ListSelectionListenerFrom){
        lengthUnitsFrom.addListSelectionListener(ListSelectionListenerFrom);
    }

    void addLengthUnitsToListener(ListSelectionListener ListSelectionListenerTo){
        lengthUnitsTo.addListSelectionListener(ListSelectionListenerTo);
    }

    public JList<String> getLengthUnitsFrom() {
        return lengthUnitsFrom;
    }

    public JList<String> getLengthUnitsTo() {
        return lengthUnitsTo;
    }
}
