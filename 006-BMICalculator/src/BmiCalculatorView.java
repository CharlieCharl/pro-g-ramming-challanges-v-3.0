import javax.swing.*;
import java.awt.*;

public class BmiCalculatorView extends JFrame {

    JRadioButton menButton;
    JRadioButton womanButton;
    ButtonGroup genderGroup;
    JLabel heightLabel;
    JLabel weightLabel;
    JTextField heightTextField;
    JTextField weightTextField;

    public BmiCalculatorView(){
        this.setTitle("BMI calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        GridLayout layout = new GridLayout(4,2);
        setLayout(layout);
        this.setSize(400,300);

        menButton = new JRadioButton("Men");
        womanButton = new JRadioButton("Woman");

        heightLabel = new JLabel("Height:");
        weightLabel = new JLabel("Weight");

        heightTextField = new JTextField();
        weightTextField = new JTextField();

        Container c = getContentPane();

        c.add(menButton);
        c.add(womanButton);
        c.add(heightLabel);
        c.add(heightTextField);
        c.add(weightLabel);
        c.add(weightTextField);

        genderGroup = new ButtonGroup();
        genderGroup.add(menButton);
        genderGroup.add(womanButton);

    }

}
