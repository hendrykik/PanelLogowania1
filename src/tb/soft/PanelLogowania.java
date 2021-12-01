package tb.soft;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;

public class PanelLogowania implements ActionListener {
    JFrame frame = new JFrame();
    JButton przypiskZaloguj = new JButton("Zaloguj");
    JButton przyciskReset = new JButton("Reset");
    JTextField poleLogin = new JTextField();
    JPasswordField poleHaslo = new JPasswordField();
    JLabel napisLogin = new JLabel("Login: ");
    JLabel napisaHaslo = new JLabel("Haslo: ");
    JPanel panel = new JPanel();

    HashMap<String,String> logininfo = new HashMap<String,String>();

    PanelLogowania(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
        panel.setLayout(null);

        przypiskZaloguj.setBounds(150,275,100,25);
        przypiskZaloguj.setFocusable(false);
        przypiskZaloguj.addActionListener(this);

        przyciskReset.setBounds(250,275,100,25);
        przyciskReset.setFocusable(false);
        przyciskReset.addActionListener(this);

        napisLogin.setBounds(100,175,75,25);
        napisaHaslo.setBounds(100,225,75,25);

        poleLogin.setBounds(150,175,200,25);
        poleHaslo.setBounds(150,225,200,25);

        panel.setPreferredSize(new Dimension(500,500));

        panel.add(napisLogin);
        panel.add(napisaHaslo);
        panel.add(poleLogin);
        panel.add(poleHaslo);
        panel.add(przypiskZaloguj);
        panel.add(przyciskReset);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==przyciskReset){
            poleLogin.setText("");
            poleHaslo.setText("");
            panel.setBackground(Color.lightGray);
        }
        if (e.getSource()==przypiskZaloguj){
            String userID = poleLogin.getText();
            String password = String.valueOf(poleHaslo.getPassword());
            if (logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    panel.setBackground(Color.green);
                }
                else{
                    panel.setBackground(Color.red);
                }
            }
            else{
                panel.setBackground(Color.red);
            }
        }
    }
}
