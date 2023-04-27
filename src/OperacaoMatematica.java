import javax.sound.midi.Sequencer.SyncMode;
import javax.swing.JOptionPane;

public class OperacaoMatematica {
    public static void main(String[] args) {
        int numeroA = 5;
        int numeroB = 6;

        int resultado = (int) Math.pow(10, 2);  // 10 elevado a 2
        // int resultado = (int) Math.ceil(10.54); // 11 -- arredondou

        System.out.println(resultado);
    }
}
