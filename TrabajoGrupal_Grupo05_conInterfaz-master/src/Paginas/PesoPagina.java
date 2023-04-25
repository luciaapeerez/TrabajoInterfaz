package Paginas;

import PaqC05.Contenedor;

import javax.swing.*;

public class PesoPagina extends JFrame {
    private JPanel panel1;
    private JTextField id;
    private JCheckBox inspecionadoEnAduanasCheckBox;
    private JTextField empresa;
    private JTextField Peso;

    public PesoPagina(Contenedor c){
        setContentPane(panel1);
        setTitle("Gestión de contadores");
        setSize(1200,600);
        setVisible(true);

        //---MUESTRA DE IDENTIFICACIÓN ---
        id.setText(String.valueOf(c.getId()));

        //---MUESTRA DE PESO ---
        Peso.setText(String.valueOf(c.getPeso()));

        //---MUESTRA DE EMPRESA REMITENTE---
        empresa.setText(c.getEmpresaRemitente());
        //---MUESTRA DE ADUANAS ---
        inspecionadoEnAduanasCheckBox.setSelected(c.getInspeccionado());
    }

}
