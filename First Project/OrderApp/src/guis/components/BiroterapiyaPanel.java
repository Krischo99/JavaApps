package guis.components;

import guis.MainJpanel;

import javax.swing.*;
import java.util.List;

public class BiroterapiyaPanel extends MainJpanel {

    boolean isPrinted = false;
    public BiroterapiyaPanel(String title, List<String> printOrder) {
        super(title, printOrder);
    }

    @Override
    protected void initCustomComponents(List<String> printOrder, JButton addOrder, JButton reset) {

        //String bira = "Биротерапия заявка\n\n";
        //printOrder.add(bira);
        // This is Test block for now--------------------------------------------
        //print.setBackground();
        //print.setBorderPainted(false);
    }
}
