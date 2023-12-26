
package sourcepackage.dersiceriktakibi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Butonlar extends JPanel{
        private JButton dersEkle;
        private JButton kaldir;
        
        Border bosTahta = BorderFactory.createEmptyBorder();
        public Butonlar(){
            setPreferredSize(new Dimension(300,80));
            this.setBackground(new Color(250,241,80));
            
            dersEkle = new JButton("Ders Ekle");
            dersEkle.setBorder(bosTahta);
            dersEkle.setFont(new Font("Matrix",Font.PLAIN,15));
            this.add(dersEkle);
            
            this.add(Box.createHorizontalStrut(20));
            
            kaldir = new JButton("Butun Dersleri Sil");
            kaldir.setBorder(bosTahta);
            kaldir.setFont(new Font("Matrix",Font.PLAIN,15));
            this.add(kaldir);
        }
        
        public JButton getDersEkleButonu(){
            return dersEkle;
        }
        
        public JButton getKaldirButonu(){
            return kaldir;
        }
}
