import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // void -> significa que não está retornando
    void mostrarStatus(){
        System.out.format("Personagem: %s com level %d e com %d de força.\n", nome, nivel, forca);
    }


    int calcularDano(){
        Random gerador = new Random();
        // 1...20
        //nextInt(): 0... 19 -- isso começaria no 0
        // se ele gerou nextInt(): 0 + 1 = 1
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }


    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        System.out.format("%s atacou uma '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
                                //nome        habilidade    alvo      danoCausado
    }
}
