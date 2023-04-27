public class App {
    public static void main(String[] args) throws Exception {


        // Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";


            // "Celular " + celularA.nome + " com tela de " + celularA.tamanhoTela + ", com %d e $0 %s"
            System.out.format("Celular %s com tela de %f, com %d e SO %s", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
    }





    /*
        int numero;

        // Scanner -> classe
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        numero = leitor.nextInt();
        //numero = leitor.nextFloat()
        // tier = Integer.parseInt(valor)
        System.out.println("O meu número é: " + numero);
    */
    
}
