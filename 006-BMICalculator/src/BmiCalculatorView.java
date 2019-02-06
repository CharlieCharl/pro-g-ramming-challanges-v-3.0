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
    JButton calculateButton;
    JLabel result;

    public BmiCalculatorView(){
        this.setTitle("BMI calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        GridLayout layout = new GridLayout(4,1);
        setLayout(layout);
        this.setSize(300,150);

        menButton = new JRadioButton("Men");
        womanButton = new JRadioButton("Woman");

        heightLabel = new JLabel("Height:");
        weightLabel = new JLabel("Weight");

        heightTextField = new JTextField();
        weightTextField = new JTextField();

        calculateButton = new JButton("Calculate");
        result = new JLabel("0");
        Container c = getContentPane();

        c.add(menButton);
        c.add(womanButton);
        c.add(heightLabel);
        c.add(heightTextField);
        c.add(weightLabel);
        c.add(weightTextField);
        c.add(calculateButton);
        c.add(result);

        genderGroup = new ButtonGroup();
        genderGroup.add(menButton);
        genderGroup.add(womanButton);

    }

}
