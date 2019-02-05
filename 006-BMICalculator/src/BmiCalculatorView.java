import javax.swing.*;
import java.awt.*;

public class BmiCalculatorView extends JFrame {

    public BmiCalculatorView(){
        this.setTitle("BMI calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        this.setSize(400,300);
    }
}
