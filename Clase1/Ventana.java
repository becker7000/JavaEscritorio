import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    //Atributos:
    private String titulo;
    private JPanel panel; // Aquí va la declaración de un panel
    private JTextField input; // Declaramos una entrada texto...
    private JButton button;

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

        // Agregando componentes a la ventada...
        iniciarComponentes();

        // Configuramos la acción que queremos que suceda al
        // cerrar la ventana..
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    } // Aquí termina el constructor de la Ventana

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarCamposTexto();
        colocarBotones();
    }

    public void colocarPaneles(){

        // Creamos un nuevo
        panel = new JPanel();

        // Existen un diseño por defecto que todas las ventanas
        // de Java tienen, ese diseño lo podemos desactivar así
        panel.setLayout(null);

        // Método que nos ayuda a agregar el JPanel al JFrame
        this.getContentPane().add(panel);

        // Ajustamos en fondo del panel
        panel.setBackground(new Color(232, 230, 100));

    } // Aquí termina colocarPaneles

    public void colocarEtiquetas(){

        // Creamos una etiqueta :
        JLabel etiqueta = new JLabel();

        // Ajustamos los permisos de diseño:
        etiqueta.setOpaque(true);

        // Ajustamos el texto que contendrá el JLabel
        etiqueta.setText(" Recibo de CFE, consumo de electricidad");

        // Ajustamos la alineación del texto dentro del JLabel
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustamos un tamaño
        etiqueta.setSize(495,30);

        // Ajustamos un color a la letra
        etiqueta.setForeground(new Color(36, 47, 87));

        // Creamos una fuente para luego usarla en nuestro JLabel
        Font fuente = new Font("Arial",Font.BOLD,20);

        // Agregamos la fuente a la JLabel
        etiqueta.setFont(fuente);

        // Agregamos el JLabel al JPanel
        panel.add(etiqueta);

    } //Aquí termina colocarEtiquetas

    public void colocarCamposTexto(){

        // Creamos una nueva caja de texto
        input = new JTextField();

        // Ajustamos su posición dentro del Panel
        // y al mismo tiempo si tamaño:
        input.setBounds(60, 50,200,30);

        //Agregamos al panel la caja de texto
        panel.add(input);

    } // Terminan las cajas de texto

    public void colocarBotones(){

        // Creamos un botón
        button = new JButton("Calcular");

        // Ajustamos dimensines y posición
        button.setBounds(60,100, 200, 50);

        // Agregamos el button al panel
        panel.add(button);

    }


} // Acá termina la clase Ventana
