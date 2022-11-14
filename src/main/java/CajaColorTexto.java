import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CajaColorTexto extends JFrame implements ActionListener {
    private JLabel texto; JRadioButtonMenuItem fondoBlanco; JRadioButtonMenuItem fondoAmarillo; JRadioButtonMenuItem fondoAzul;
    JRadioButtonMenuItem rojo; JRadioButtonMenuItem azul; JRadioButtonMenuItem negro; JRadioButtonMenuItem verde; JRadioButtonMenuItem sansSerif;
    JPanel fondo; JCheckBoxMenuItem negrita; JCheckBoxMenuItem cursiva; JRadioButtonMenuItem serif; JRadioButtonMenuItem monospaced;


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
        negro = new JRadioButtonMenuItem("Negro");
        azul = new JRadioButtonMenuItem("Azul");
        rojo = new JRadioButtonMenuItem("Rojo");
        verde = new JRadioButtonMenuItem("Verde");
        JMenu tipoDeLetra = new JMenu("Tipo de letra");
        serif = new JRadioButtonMenuItem("Serif");
        monospaced = new JRadioButtonMenuItem("Monospaced");
        sansSerif = new JRadioButtonMenuItem("SansSerif");
        negrita = new JCheckBoxMenuItem("Negrita");
        cursiva = new JCheckBoxMenuItem("Cursiva");

        //Añado colores de fondo al menú, desmarcados por defecto y añado listener

        fondoBlanco.setSelected(false); cambiarFondo.add(fondoBlanco); fondoAmarillo.setSelected(false);
        cambiarFondo.add(fondoAmarillo); fondoAzul.setSelected(false); cambiarFondo.add(fondoAzul);
        fondoBlanco.addActionListener(this); fondoAmarillo.addActionListener(this);fondoAzul.addActionListener(this);

        archivo.add(acercaDe); archivo.add(salir); archivo.add(cambiarFondo);

        menuBar.add(archivo);

        //Añado colores de fuente al menú, desmarcados por defecto y añado listener

        negro.setSelected(false);negro.addActionListener(this); azul.setSelected(false); azul.addActionListener(this);
        rojo.setSelected(false); rojo.addActionListener(this); verde.setSelected(false); verde.addActionListener(this);
        color.add(negro); color.add(azul); color.add(rojo);color.add(verde);

        //Añado fuentes al menú, desmarcados por defecto y añado listener

        serif.setSelected(false); serif.addActionListener(this); monospaced.setSelected(false); monospaced.addActionListener(this); sansSerif.setSelected(false);sansSerif.addActionListener(this);
        tipoDeLetra.add(serif); tipoDeLetra.add(monospaced); tipoDeLetra.add(sansSerif);
        tipoDeLetra.add(negrita); tipoDeLetra.add(cursiva);

        formato.add(color); formato.add(tipoDeLetra);

        menuBar.add(formato); this.setJMenuBar(menuBar);


        texto = new JLabel("Texto de fondo");


        fondo = new JPanel();
        fondo.setBackground(Color.cyan);
        fondo.setLayout(new FlowLayout());
        fondo.add(texto);




        this.add(fondo);

        this.setVisible(true);
        this.setSize(700, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        //cambiar color de fondo

        if (e.getSource().equals(fondoBlanco)) {
            fondo.setBackground(Color.white);
        } else if (e.getSource().equals(fondoAmarillo)) {
            fondo.setBackground(Color.yellow);
        } else if (e.getSource().equals((fondoAzul))) {
            fondo.setBackground(Color.cyan);
        }

        //cambiar color de texto

        if (e.getSource().equals(rojo)) {
            texto.setForeground(Color.red);
        } else if (e.getSource().equals(verde)) {
            texto.setForeground(Color.green);
        } else if (e.getSource().equals(negro)) {
            texto.setForeground(Color.black);
        } else if (e.getSource().equals(azul)) {
            texto.setForeground(Color.blue);
        }

        //cambiar fuente de texto

        if (e.getSource().equals(serif)) {
            texto.setFont(new Font("Serif", Font.PLAIN, 50));

        } else if (e.getSource().equals(sansSerif)) {
            texto.setFont(new Font("SansSerif", Font.PLAIN, 50));

        } else if (e.getSource().equals(monospaced)) {
            texto.setFont(new Font("Monospaced", Font.PLAIN, 50));
        }
    }


    public static void main(String[] args) {
        CajaColorTexto v1 = new CajaColorTexto();
    }

}
