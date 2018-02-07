package jd.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;
    private JDialog resp;
    private JLabel etiqueta2;

    public Ventana() {
        super("Numeros Magicos");
        etiqueta = new JLabel("Dime un Numero >> ");
        campo = new JTextField(5);
        jugar = new JButton("Jugar");
        resp = new JDialog(this);
        resp.setSize(300, 115);
        FlowLayout f = new FlowLayout();
        setLayout(f);
        etiqueta2 = new JLabel("");
        add(etiqueta);
        add(campo);
        add(jugar);
        resp.add(etiqueta2);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugar();
            }
        });
    }

    private void Jugar() {
        String r = campo.getText();
        int num = Integer.parseInt(r);
        num++;
        etiqueta2.setText("Mi numero es " + num + " Te Gané!!");

        resp.setVisible(true);
    }


}
