//Marchella Sylvadenta Lastetria
//123180133

package formbio;
import javax.swing.*;

public class Akhir extends JFrame{
    String nama, jk, agama, hobi;
    
    JLabel namalengkap = new JLabel(" Nama Lengkap : ");
    JLabel jkelamin = new JLabel(" Jenis Kelamin : ");
    JLabel agamanya = new JLabel(" Agama : ");
    JLabel hobinya = new JLabel(" Hobi : ");
    JLabel akhirNama = new JLabel();
    JLabel akhirJk = new JLabel();
    JLabel akhirAgama = new JLabel();
    JLabel akhirHobi = new JLabel();
    
    public Akhir(String nama, String jk, String agama, String hobi){
    
    this.nama = nama;
    this.jk = jk;
    this.agama = agama;
    this.hobi = hobi;
    akhirNama.setText(nama);
    akhirJk.setText(jk);
    akhirAgama.setText(agama);
    akhirHobi.setText(hobi);
    
    setTitle("Biodata");
    setSize(350,350);
    setLocation(500, 50);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    add(namalengkap);
    add(akhirNama);
    add(jkelamin);
    add(akhirJk);
    add(agamanya);
    add(akhirAgama);
    add(hobinya);
    add(akhirHobi);
    
    namalengkap.setBounds(10,10,120,20);
    akhirNama.setBounds(130,10,150,20);
    jkelamin.setBounds(10,35,120,20);
    akhirJk.setBounds(130,35,120,20);
    agamanya.setBounds(10,60,120,20);
    akhirAgama.setBounds(130,60,120,20);
    hobinya.setBounds(10,85,120,20);
    akhirHobi.setBounds(130,85,120,20);
    
    setVisible(true); 
}

}


