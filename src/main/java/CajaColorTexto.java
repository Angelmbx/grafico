import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CajaColorTexto extends JFrame implements ActionListener {
    private JLabel textoDeFondo; JRadioButtonMenuItem fondoBlanco; JRadioButtonMenuItem fondoAmarillo; JRadioButtonMenuItem fondoAzul;
    private JPanel fondo; JCheckBoxMenuItem negrita; JCheckBoxMenuItem cursiva;

    public CajaColorTexto(){
        JMenuBar menuBar = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu cambiarFondo = new JMenu("Cambiar color de fondo");
        fondoBlanco = new JRadioButtonMenuItem("Blanco");
        fondoAmarillo = new JRadioButtonMenuItem("Amarillo");
        fondoAzul = new JRadioButtonMenuItem("Azul");
        JMenuItem acercaDe = new JMenuItem("Acerca de...");
        JMenuItem salir = new JMenuItem("Salir");
        JMenu formato = new JMenu("Formato");
        JMenu color = new JMenu("Color");
        JRadioButtonMenuItem negro = new JRadioButtonMenuItem("Negro");
        JRadioButtonMenuItem azul = new JRadioButtonMenuItem("Azul");
        JRadioButtonMenuItem rojo = new JRadioButtonMenuItem("Rojo");
        JRadioButtonMenuItem verde = new JRadioButtonMenuItem("Verde");
        JMenu tipoDeLetra = new JMenu("Tipo de letra");
        JRadioButtonMenuItem serif = new JRadioButtonMenuItem("Serif");
        JRadioButtonMenuItem monospaced = new JRadioButtonMenuItem("Monospaced");
        JRadioButtonMenuItem sansSerif = new JRadioButtonMenuItem("SansSerif");
        negrita = new JCheckBoxMenuItem("Negrita");
        cursiva = new JCheckBoxMenuItem("Cursiva");


        fondoBlanco.setSelected(false); cambiarFondo.add(fondoBlanco); fondoAmarillo.setSelected(false);
        cambiarFondo.add(fondoAmarillo); fondoAzul.setSelected(false); cambiarFondo.add(fondoAzul);
        fondoBlanco.addActionListener(this); fondoAmarillo.addActionListener(this);fondoAzul.addActionListener(this);

        archivo.add(acercaDe); archivo.add(salir); archivo.add(cambiarFondo);

        menuBar.add(archivo);

        negro.setSelected(false);negro.addActionListener(this); azul.setSelected(false); azul.addActionListener(this);
        rojo.setSelected(false); rojo.addActionListener(this); verde.setSelected(false); verde.addActionListener(this);
        color.add(negro); color.add(azul); color.add(rojo);color.add(verde);

        serif.setSelected(false); serif.addActionListener(this); monospaced.setSelected(false); monospaced.addActionListener(this); sansSerif.setSelected(false);sansSerif.addActionListener(this);
        tipoDeLetra.add(serif); tipoDeLetra.add(monospaced); tipoDeLetra.add(sansSerif);
        tipoDeLetra.add(negrita); tipoDeLetra.add(cursiva);

        formato.add(color); formato.add(tipoDeLetra);

        menuBar.add(formato); this.setJMenuBar(menuBar);


        textoDeFondo = new JLabel("Texto de fondo");


        fondo = new JPanel();
        fondo.setBackground(Color.cyan);
        fondo.setLayout(new FlowLayout());
        fondo.add(textoDeFondo);




        this.add(fondo);

        this.setVisible(true);
        this.setSize(700, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(fondoBlanco)) {
            fondo.setBackground(Color.white);
        } else if (e.getSource().equals(fondoAmarillo)) {
            fondo.setBackground(Color.yellow);
        } else {
            fondo.setBackground(Color.cyan);
        }

        if (e.getSource().equals(negrita)){
            textoDeFondo.
        }

    }


    public static void main(String[] args) {
        CajaColorTexto v1 = new CajaColorTexto();
    }

}
