import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {

    private MainFrame mainFrame;
    private ConverterModel model;
    private String[] temperatureUnits = {"celsius", "kelvin", "fahrenheit"};
    private String[] lengthUnits = {"meter", "kilometer", "centimeter", "millimeter", "micrometer", "nanometer", "mile",
            "yard", "foot", "inch", "light year"};
    private String[] weightUnits = {"kilogram", "gram", "milligram", "pound", "ounce", "carrat"};


    MainFrameController(MainFrame mainFrame, ConverterModel model){
        this.mainFrame = mainFrame;
        this.model = model;

        this.mainFrame.addConvertButtonListener(new ConvertButtonListener());
        this.mainFrame.addLengthUnitsFromListener(new ListSelectionListenerFrom());
        this.mainFrame.addLengthUnitsToListener(new ListSelectionListenerTo());
        this.mainFrame.addComboBoxListener(new UnitsSelectComboBoxListener());
    }

    class ConvertButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setFromIndex(mainFrame.getLengthUnitsFrom().getSelectedIndex());
            model.setToIndex(mainFrame.getLengthUnitsTo().getSelectedIndex());
            model.setInputData(mainFrame.getDataInput());
            String value = String.valueOf(model.convertLegnht());
            mainFrame.setResultLabel(value);
        }
    }

    class ListSelectionListenerFrom implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()){
                 mainFrame.getLengthUnitsFrom().getSelectedIndex();
            }
        }
    }

    class ListSelectionListenerTo implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()){
                mainFrame.getLengthUnitsTo().getSelectedIndex();
            }
        }
    }

    class UnitsSelectComboBoxListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox) e.getSource();
            String category = (String) cb.getSelectedItem();

           switch (category){
               case "Length":
                   mainFrame.getLengthUnitsFrom().setListData(lengthUnits);
                   mainFrame.getLengthUnitsTo().setListData(lengthUnits);
                   break;
               case "Temperature":
                   mainFrame.getLengthUnitsFrom().setListData(temperatureUnits);
                   mainFrame.getLengthUnitsTo().setListData(temperatureUnits);
                   break;
               case "Weight":
                   mainFrame.getLengthUnitsFrom().setListData(weightUnits);
                   mainFrame.getLengthUnitsTo().setListData(weightUnits);
                   break;
           }

        }
    }
}


