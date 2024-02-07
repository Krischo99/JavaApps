import javax.swing.*;
import java.awt.*;

public class TestJpanel extends MainTest {

    public TestJpanel(){}

    @Override
    public void initGui(StringBuilder storeInfo) {
        setBackground(Color.BLACK);

        TextField username = new TextField();
        username.setBounds(0,50,150,20);
        add(username);

        JButton extractText = new JButton("extract");
        extractText.setBounds(160, 50, 50,20);
        extractText.addActionListener(e-> {
            extract(username, storeInfo);
        });
        add(extractText);
    }

    public void extract(TextField username, StringBuilder order){
        order.append("First test ");
        if(username.getText() != null || !username.getText().equals(" ")) {
            order.append(username.getText() + "\n");
            username.setText("");
        }else {
            System.out.println("Nothing!");
        }
    }
}
