import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {

    private MainFrame mainFrame;
    private ConverterModel model;

    MainFrameController(MainFrame mainFrame, ConverterModel model){
        this.mainFrame = mainFrame;
        this.model = model;

        this.mainFrame.addConvertButtonListener(new ConvertButtonListener());
        this.mainFrame.addLengthUnitsFromListener(new ListSelectionListenerFrom());
        this.mainFrame.addLengthUnitsToListener(new ListSelectionListenerTo());
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
}


