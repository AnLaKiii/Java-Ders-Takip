
package sourcepackage.dersiceriktakibi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dersler extends JPanel{
        private JLabel index;
        private JTextField dersAdi;
        private JButton yapildi;
        private JButton kaldir;
        private JButton dersIcerigi;
        
        public Dersler(){
            GridLayout dersArkaPlan = new GridLayout(1,4);
            dersArkaPlan.setHgap(5);
            this.setPreferredSize(new Dimension(300,20));
            this.setBackground(new Color(51,245,103));
            this.setLayout(dersArkaPlan);
            
            index = new JLabel("");
            index.setPreferredSize(new Dimension(10,20));  
            index.setHorizontalAlignment(JLabel.LEFT);
            index.setBackground(new Color(165,197,240));
            this.add(this.index);
            
            dersAdi = new JTextField("Ders Adi Girin");
            dersAdi.setPreferredSize(new Dimension(10,20));
            dersAdi.setBorder(BorderFactory.createEmptyBorder());
            dersAdi.setBackground(new Color(165,197,240));
            this.add(this.dersAdi);
            
            yapildi = new JButton("Tamamlandi");
            yapildi.setPreferredSize(new Dimension(10,20));
            this.add(this.yapildi);
            
            kaldir = new JButton("Dersi Kaldir");
            kaldir.setPreferredSize(new Dimension(10,20));
            this.add(this.kaldir);
            
            dersIcerigi = new JButton("Ders icerigi");
            dersIcerigi.setPreferredSize(new Dimension(10,20));
            this.add(this.dersIcerigi);
        }
        public void writeindexj1(int n){
            this.index.setText(String.valueOf(n));
            this.revalidate();            
        }
        public JButton getyapildij(){
            return this.yapildi;
        }
        public JButton getkaldirj(){
            return this.kaldir;
        }
        public void yapilmadurumu(){
            this.dersAdi.setBackground(Color.green);
            this.index.setBackground(Color.green);
            this.kaldir.setBackground(Color.green);
            this.yapildi.setBackground(Color.green);
            this.setBackground(Color.green);
            revalidate();
        }
}
