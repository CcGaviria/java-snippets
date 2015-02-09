/**
*
* 
* 
* 
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	JTextField Ventana;
	double resultado;
	String operacion;
	JPanel Pnum, Poper;

	boolean nvaoper = true;

	public Calculadora() {
		super();
		setSize(280, 330);
		setTitle("~~Calculadora~~");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());

		Ventana = new JTextField("0", 25);
		Ventana.setBorder(new EmptyBorder(3, 3, 2, 2));
		Ventana.setFont(new Font("Arial", Font.ITALIC, 35));
		Ventana.setHorizontalAlignment(JTextField.RIGHT);
		Ventana.setEditable(false);
		Ventana.setBackground(Color.WHITE);
		panel.add("North", Ventana);

		Pnum = new JPanel();
		Pnum.setLayout(new GridLayout(4, 3));
		Pnum.setBorder(new EmptyBorder(3, 3, 2, 2));

		for (int n = 9; n >= 0; n--) {
			botonesnum("" + n);
		}

		botonesnum(".");

		panel.add("Center", Pnum);

		Poper = new JPanel();
		Poper.setLayout(new GridLayout(6, 1));
		Poper.setBorder(new EmptyBorder(3, 3, 2, 2));

                
		nuevoBotonOperacion("CE");
		nuevoBotonOperacion("*");
		nuevoBotonOperacion("/");
		nuevoBotonOperacion("+");
		nuevoBotonOperacion("-");
		nuevoBotonOperacion("=");

		panel.add("East", Poper);

		validate();
	}
	private void botonesnum(String valor) {
		JButton boton1 = new JButton();
		boton1.setText(valor);
		boton1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton boton1 = (JButton) evt.getSource();
				numeroPulsado(boton1.getText());
			}
		});

		Pnum.add(boton1);
	}
	private void nuevoBotonOperacion(String operacion) {
		JButton boton1 = new JButton(operacion);
		boton1.setForeground(Color.BLACK);

		boton1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton boton1 = (JButton) evt.getSource();
				operacionPulsado(boton1.getText());
			}});
		Poper.add(boton1);
	}

        private void numeroPulsado(String valor) {
		if (Ventana.getText().equals("0") || nvaoper) {
			Ventana.setText(valor);
		} else {
			Ventana.setText(Ventana.getText() + valor);
		}
		nvaoper = false;
	}
	private void operacionPulsado(String pulsa) {
		if (pulsa.equals("=")) {
			calcularResultado();
		} else if (pulsa.equals("CE")) {
			resultado = 0;
			Ventana.setText("");
			nvaoper = true;
		} else {
			operacion = pulsa;
			if ((resultado > 0) && !nvaoper) {
				calcularResultado();
			} else {
				resultado = new Double(Ventana.getText());
			}
		}

		nvaoper = true;
	}

	private void calcularResultado() {
		if (operacion.equals("+")) {
			resultado += new Double(Ventana.getText());
		} else if (operacion.equals("-")) {
			resultado -= new Double(Ventana.getText());
		} else if (operacion.equals("/")) {
			resultado /= new Double(Ventana.getText());
		} else if (operacion.equals("*")) {
			resultado *= new Double(Ventana.getText());
		}

		Ventana.setText("" + resultado);
		operacion = "";
	}

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora cal=new Calculadora();
        cal.setVisible(true);
    }
}