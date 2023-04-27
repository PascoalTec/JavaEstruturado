import java.util.Random;

import javax.swing.JOptionPane;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random gerador = new Random();
        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado ?");
        int facesDado = Integer.parseInt(facesString);
       
       // int facesDado = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas faces tem o dado ?"));   // mesma coisa q o exemplo acima

        int resultado = 1 + gerador.nextInt(facesDado);
       // int dado6Faces = 1 + (int) (Math.random() * 6);

        //JOptionPane.showMessageDialog(null,dado6Faces);

        // int numero = 1 + gerador.nextInt(100); // 6 é o maior numero, e 1 é o valor minimo
        JOptionPane.showMessageDialog(null, "Voce tirou " + resultado + "no dado");

    }

}
