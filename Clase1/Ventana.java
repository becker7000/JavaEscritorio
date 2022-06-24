import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    //Atributos:
    private String titulo;
    private JPanel panel;

    // Constructor:
    // Es un métod especial que me ayuda a instaciar un objeto
    // de una clase...
    public Ventana(String titulo, int ancho, int altura){

        this.titulo = titulo;

        // Ajustamos el tamaño de la ventana:
        setSize(ancho,altura);

        // Ajustamos el título;
        setTitle(titulo);

        // Ajustamos el tamaño mínimo:
        setMinimumSize(new Dimension(450,450));

        // Ajustamos que la ventana aparezca justo en el centro
        // sin importar la resolución...
        setLocationRelativeTo(null);

        // Configuramos la acción que queremos que suceda al
        // cerrar la ventana..
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
