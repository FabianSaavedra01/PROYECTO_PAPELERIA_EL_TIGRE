package VIEWS;

import VIEWS.PANELS.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;

public class IOManager extends JFrame {

    private InitPanel initPanel;
    private MenuPanel menuPanel;

    public IOManager(ActionListener actionListener){
        this.setBackground(Color.BLUE);
        this.setLayout(new GridBagLayout());
        this.initComponents(actionListener);

    }

    private void initComponents(ActionListener actionListener) {
        initPanel = new InitPanel(actionListener);
        //menuPanel = new MenuPanel(actionListener);
        GridBagConstraints gbc = new GridBagConstraints();
        this.add(initPanel);
    }
}
