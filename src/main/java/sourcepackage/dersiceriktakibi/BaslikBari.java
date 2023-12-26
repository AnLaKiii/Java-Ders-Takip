package sourcepackage.dersiceriktakibi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BaslikBari extends JPanel{
    
    JLabel Baslik = new JLabel("Ders Takip");
    public BaslikBari(){
        this.setPreferredSize(new Dimension(300,50));
        this.setBackground(new Color(0,216,250));
        Baslik.setPreferredSize(new Dimension(150,40));
        Baslik.setFont(new Font("Rockwell",Font.BOLD,20));
        Baslik.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.Baslik);
    }
}
