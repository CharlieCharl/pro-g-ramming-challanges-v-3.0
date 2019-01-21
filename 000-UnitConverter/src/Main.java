import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                ConverterModel model = new ConverterModel();
                MainFrameController controller = new MainFrameController(frame,model);
                frame.setVisible(true);
            }
        });


    }
}
