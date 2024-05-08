import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            double ValorDoce = valorAleatorio();
       //     if (ValorDoce>mesada)
        //    ValorDoce = mesada;

            System.out.println("Doce valor: "+ValorDoce+ " Adicionado ao carrinho ");
            mesada = mesada - ValorDoce;
        }

        System.out.println("Mesada: "+mesada);
        System.out.println("Joaozinho gastou toda sua mesada");

    }
    private static double  valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);

    }
}
