import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
public class CalculadoraGrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JTextField pantalla = new JTextField();
        pantalla.setFont(new Font("Arial", Font.BOLD, 15));
        pantalla.setPreferredSize(new Dimension(180, 40));
        JPanel panelBotones = new JPanel();
        frame.add(pantalla, BorderLayout.NORTH);
        frame.add(panelBotones, BorderLayout.CENTER);
        panelBotones.setLayout(new GridLayout(5, 4)); // Configura un diseño de cuadrícula 5x4
        JButton boton = new JButton ("1");
        panelBotones.add(boton);
        boton.addActionListener(e -> pantalla.setText(pantalla.getText() + "1"));
        JButton boton2 = new JButton ("2");
        panelBotones.add(boton2);
        boton2.addActionListener(e -> pantalla.setText(pantalla.getText() + "2"));
        JButton boton3 = new JButton ("3");
        panelBotones.add(boton3);
        boton3.addActionListener(e -> pantalla.setText(pantalla.getText() + "3"));
        JButton boton4 = new JButton ("4");
        panelBotones.add(boton4);
        boton4.addActionListener(e -> pantalla.setText(pantalla.getText() + "4"));
        JButton boton5 = new JButton ("5");
        panelBotones.add(boton5);
        boton5.addActionListener(e -> pantalla.setText(pantalla.getText() + "5"));
        JButton boton6 = new JButton ("6");
        panelBotones.add(boton6);
        boton6.addActionListener(e -> pantalla.setText(pantalla.getText() + "6"));
        JButton boton7 = new JButton ("7");
        panelBotones.add(boton7);
        boton7.addActionListener(e -> pantalla.setText(pantalla.getText() + "7"));
        JButton boton8 = new JButton ("8");
        panelBotones.add(boton8);
        boton8.addActionListener(e -> pantalla.setText(pantalla.getText() + "8"));
        JButton boton9 = new JButton ("9");
        panelBotones.add(boton9);
        boton9.addActionListener(e -> pantalla.setText(pantalla.getText() + "9"));
        JButton boton0 = new JButton ("0");
        panelBotones.add(boton0);
        boton0.addActionListener(e -> pantalla.setText(pantalla.getText() + "0"));
        double[] numero1 = {0};
        String[] operacion = {""};
        JButton botonSuma = new JButton ("+");
        panelBotones.add(botonSuma);
        botonSuma.addActionListener(e -> {
            numero1[0] = Double.parseDouble(pantalla.getText());
            operacion[0] = "+";
            pantalla.setText("");
        });
        JButton botonResta = new JButton ("-");
        panelBotones.add(botonResta);
        botonResta.addActionListener(e -> {
            numero1[0] = Double.parseDouble(pantalla.getText());
            operacion[0] = "-";
            pantalla.setText("");
        });
        JButton botonMultiplicacion = new JButton ("*");
        panelBotones.add(botonMultiplicacion);
        botonMultiplicacion.addActionListener(e -> {
            numero1[0] = Double.parseDouble(pantalla.getText());
            operacion[0] = "*";
            pantalla.setText("");
        });
        JButton botonDivision = new JButton ("/");
        panelBotones.add(botonDivision);
        botonDivision.addActionListener(e -> {
            numero1[0] = Double.parseDouble(pantalla.getText());
            operacion[0] = "/";
            pantalla.setText("");
        });
        JButton botonIgual = new JButton ("=");
        panelBotones.add(botonIgual);
        botonIgual.addActionListener(e -> {
            double numero2 = Double.parseDouble(pantalla.getText());
            double resultado = 0;
            switch (operacion[0]) {
                case "+":
                    resultado = numero1[0] + numero2;
                    break;
                case "-":
                    resultado = numero1[0] - numero2;
                    break;
                case "*":
                    resultado = numero1[0] * numero2;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1[0] / numero2;
                    } else {
                        pantalla.setText("Error: División por cero");
                        return;
                    }
                    break;
            }
            pantalla.setText(String.valueOf(resultado));
        });
        JButton botonLimpiar = new JButton("C");
        panelBotones.add(botonLimpiar);
        botonLimpiar.addActionListener(e -> pantalla.setText(""));
        botonSuma.addActionListener(e -> {

            if (!pantalla.getText().isEmpty()) {

                numero1[0] = Double.parseDouble(pantalla.getText());
                operacion[0] = "+";
                pantalla.setText("");
            }
        });
        botonResta.addActionListener(e -> {

            if (!pantalla.getText().isEmpty()) {

                numero1[0] = Double.parseDouble(pantalla.getText());
                operacion[0] = "-";
                pantalla.setText("");
            }
        });
        botonMultiplicacion.addActionListener(e -> {

            if (!pantalla.getText().isEmpty()) {

                numero1[0] = Double.parseDouble(pantalla.getText());
                operacion[0] = "*";
                pantalla.setText("");
            }
        });
        botonDivision.addActionListener(e -> {

            if (!pantalla.getText().isEmpty()) {

                numero1[0] = Double.parseDouble(pantalla.getText());
                operacion[0] = "/";
                pantalla.setText("");
            }
        });
        JButton botonPunto = new JButton(".");
        panelBotones.add(botonPunto);
        botonPunto.addActionListener(e -> {
            if (!pantalla.getText().contains(".")) {
                pantalla.setText(pantalla.getText() + ".");
            }
        });
        JButton botonBorrar = new JButton("←");
        panelBotones.add(botonBorrar);
        botonBorrar.addActionListener(e -> {
            String texto = pantalla.getText();
            if (!texto.isEmpty()) {
                pantalla.setText(texto.substring(0, texto.length() - 1));
            }
        });
        panelBotones.add(boton);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(botonSuma);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonResta);
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonMultiplicacion);
        panelBotones.add(boton0);
        panelBotones.add(botonPunto);
        panelBotones.add(botonIgual);
        panelBotones.add(botonDivision);
        panelBotones.add(botonLimpiar);
        panelBotones.add(botonBorrar);
        panelBotones.setLayout(new GridLayout(5, 4)); // Configura un diseño de cuadrícula 5x4
        frame.setVisible(true);

    }
}
