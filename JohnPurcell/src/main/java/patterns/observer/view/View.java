package patterns.observer.view;

import patterns.observer.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Model model;
    private JButton helloButton;
    private JButton goodbyeButton;

    public View(Model model){
        super("MVC Pattern");
        this.model = model;

        // Add button to demonstrate Observer Patterns
        helloButton = new JButton("Hallo");
        goodbyeButton = new JButton("Tot ziens!");
        helloButton.setBackground(new Color(255, 125, 125));

        // GUI
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        // Add button to demonstrate Observer Patterns
        add(helloButton, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        add(goodbyeButton, gc);

        helloButton.addActionListener(this); // goodbyeButton.addActionListener(e -> actionPerformed(e));
        goodbyeButton.addActionListener(this);


        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if(source == helloButton){
            System.out.println("Button Clicked!");
        } else {
            System.out.println("some other button");
        }
    }
}
