import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Cronometro {
    private Timer timer;
    private SimpleDateFormat sdf;
    private boolean alarmaActiva;

    public Cronometro() {
        timer = new Timer();
        sdf = new SimpleDateFormat("HH:mm:ss");
        alarmaActiva = false;
    }

    // Método para mostrar la hora actual en formato HH:mm:ss
    public void mostrarHora() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Calendar calendario = Calendar.getInstance();
                System.out.println("Hora actual: " + sdf.format(calendario.getTime()));
            }
        }, 0, 1000); // Mostrar cada segundo
    }


    }

