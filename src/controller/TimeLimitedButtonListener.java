package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by koallen on 26/8/17.
 */
public class TimeLimitedButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Time limited button pressed");
    }
}