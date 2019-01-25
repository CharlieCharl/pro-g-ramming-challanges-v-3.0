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
    private String[] weightUnits = {"kilogram", "gram", "milligram", "pound", "ounce", "carat"};
    private String category;


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

            try {
                model.setInputData(mainFrame.getDataInput());
            }catch (NumberFormatException ex){
                mainFrame.displayErrorMessage("You must enter integer or double value");
            }catch (NullPointerException ex){
                mainFrame.displayErrorMessage("You must enter data");
            }

            model.setFromIndex(mainFrame.getLengthUnitsFrom().getSelectedIndex());
            model.setToIndex(mainFrame.getLengthUnitsTo().getSelectedIndex());

            String value = "";

          try {
                switch (category){
                    case "Length":
                        value = String.valueOf(model.convertLength());
                        break;
                    case "Temperature":
                        value = String.valueOf(model.convertTemperature());
                        break;
                    case "Weight":
                        value = String.valueOf(model.convertWeight());
                        break;
                }
            }catch (NullPointerException ex){
                mainFrame.displayErrorMessage("You must select units");
            }
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
            category = (String) cb.getSelectedItem();

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


