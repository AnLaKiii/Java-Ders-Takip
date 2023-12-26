package sourcepackage.dersiceriktakibi;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UygulamaArayuzu extends JFrame {
    
    BaslikBari baslik = new BaslikBari();
    Butonlar butonlar = new Butonlar();
    Liste liste = new Liste();
    
    private JButton dersEkle;
    private JButton kaldir;
    
    
    public UygulamaArayuzu(){
        this.setSize(700, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.baslik,BorderLayout.NORTH);
        this.add(this.butonlar, BorderLayout.SOUTH);
        this.add(this.liste, BorderLayout.CENTER);
        
        dersEkle = butonlar.getDersEkleButonu();
        kaldir = butonlar.getKaldirButonu();
        
        ListeEkle();
        
    }
    
    public void ListeEkle(){
        dersEkle.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                Dersler dersler = new Dersler();
                liste.add(dersler);
                revalidate();
                
                JButton yapildi = dersler.getyapildij();
                yapildi.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e) {
                        dersler.yapilmadurumu();
                        revalidate();
                    }                    
                });
                
                JButton kaldir = dersler.getkaldirj();
                kaldir.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e) {
                        liste.remove(dersler);
                        liste.indexNumarasi();
                        revalidate();
                        repaint();
                    }                    
                });
            }            
        });
        
        kaldir.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                Component[] dersListesi =liste.getComponents();
                for(int i = 0; i < dersListesi.length; i++){
                    if (dersListesi[i] instanceof Dersler) {
                        liste.remove((Dersler)dersListesi[i]);
                    }
                }
                revalidate();
                repaint();
            }            
        });
    }    
}
