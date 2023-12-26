
package sourcepackage.dersiceriktakibi;

import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Component;

public class Liste extends JPanel{
    public Liste(){
    GridLayout layout = new GridLayout(10,1);
    layout.setVgap(5);
    this.setLayout(layout);    
    }
    public void indexNumarasi(){
        Component[] listComp =this.getComponents();
        for(int i =0; i< listComp.length; i++){
            if(listComp[i] instanceof Dersler){
                ((Dersler)listComp[i]).writeindexj1(i+1);
            }
        }
    }
}
