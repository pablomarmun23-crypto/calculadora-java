import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JFileChooser;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
public class NotasGui {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notas");
        JTextArea textArea = new JTextArea(10, 30);
        JButton button = new JButton("Guardar");
        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel, BorderLayout.SOUTH);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                String content = textArea.getText();
                java.io.File file = fileChooser.getSelectedFile();
                if (!file.getName().endsWith(".txt")) {
                file = new java.io.File(file.getAbsolutePath() + ".txt");
            }
                try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
                    writer.write(content);
                } catch (java.io.IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton botonLimpiar = new JButton("Limpiar");
        panel.add(botonLimpiar);
        botonLimpiar.addActionListener(e -> textArea.setText(""));
        JButton botonCargar = new JButton("Cargar");
        panel.add(botonCargar);
        botonCargar.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                java.io.File file = fileChooser.getSelectedFile();
                try (java.util.Scanner scanner = new java.util.Scanner(file)) {
                    StringBuilder content = new StringBuilder();
                    while (scanner.hasNextLine()) {
                        content.append(scanner.nextLine()).append("\n");
                    }
                    textArea.setText(content.toString());
                } catch (java.io.IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton botonSalir = new JButton("Salir");
        panel.add(botonSalir);
        botonSalir.addActionListener(e -> System.exit(0));
    }
}
