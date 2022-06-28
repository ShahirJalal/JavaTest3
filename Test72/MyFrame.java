package Test72;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            
        }     
    }
    
}
