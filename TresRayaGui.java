import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
public class TresRayaGui {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tres en Raya");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        JButton[][] botones = new JButton[3][3];
        String[] turno = {"X"};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                panel.add(botones[i][j]);
                int finalI = i;
                int finalJ = j;
                botones[i][j].addActionListener(e -> {
                if (botones[finalI][finalJ].getText().equals("")) {
                botones[finalI][finalJ].setText(turno[0]);

                if (turno[0].equals("X")) {
                turno[0] = "O";
                } else {
                turno[0] = "X";
            }
        }
        if (checkWin(botones, "X")) {
            JOptionPane.showMessageDialog(frame, "¡JUGADOR X GANA!");
            reiniciarJuego(frame, botones, turno);
                
        } else if (checkWin(botones, "O")) {
            JOptionPane.showMessageDialog(frame, "¡JUGADOR O GANA!");
            reiniciarJuego(frame, botones, turno);
        
        } else if (checkDraw(botones)) {
            JOptionPane.showMessageDialog(frame, "¡EMPATE!");
        reiniciarJuego(frame, botones, turno);
        }
    });
            }
        }
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void reiniciarJuego(JFrame frame, JButton[][] botones, String[] turno) {
    int opcion = JOptionPane.showConfirmDialog(
        frame,
        "¿Jugar de nuevo?",
        "Juego terminado",
        JOptionPane.YES_NO_OPTION
    );

    if (opcion == JOptionPane.YES_OPTION) {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                botones[fila][columna].setText("");
            }
        }
        turno[0] = "X";
    } else {
        System.exit(0);
    }
    }
    public static boolean checkWin(JButton[][] botones, String jugador) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (botones[i][0].getText().equals(jugador) &&
                botones[i][1].getText().equals(jugador) &&
                botones[i][2].getText().equals(jugador)) {
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (botones[0][j].getText().equals(jugador) &&
                botones[1][j].getText().equals(jugador) &&
                botones[2][j].getText().equals(jugador)) {
                return true;
            }
        }
        // Verificar diagonales
        if (botones[0][0].getText().equals(jugador) &&
            botones[1][1].getText().equals(jugador) &&
            botones[2][2].getText().equals(jugador)) {
            return true;
        }
        if (botones[0][2].getText().equals(jugador) &&
            botones[1][1].getText().equals(jugador) &&
            botones[2][0].getText().equals(jugador)) {
            return true;
        }
        return false;
    }
    public static boolean checkDraw(JButton[][] botones) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().equals("")) {
                    return false; // Aún hay un espacio vacío, no es un empate
                }
            }
        }
        return true; // No hay espacios vacíos, es un empate
    }
}
