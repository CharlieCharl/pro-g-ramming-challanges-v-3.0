import javax.swing.*;
import java.awt.*;

public class BmiCalculatorView extends JFrame {

    JRadioButton menButton;
    JRadioButton womanButton;
    ButtonGroup genderGroup;

    public BmiCalculatorView(){
        this.setTitle("BMI calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        this.setSize(400,300);

        menButton = new JRadioButton("Men");
        womanButton = new JRadioButton("Woman");

        Container c = getContentPane();

        c.add(menButton);
        c.add(womanButton);

        genderGroup = new ButtonGroup();
        genderGroup.add(menButton);
        genderGroup.add(womanButton);

    }

}
