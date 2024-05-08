
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {

    public static void main(String[] args) throws Exception {

        imprimirSelecionados(); 
        /*   System.out.println("Processo Seletivo!");
        analisarCandidato(1900.0);
        analisarCandidato(22000.0);
        analisarCandidato(2000.0);
         */

    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice =0; indice < candidatos.length;indice++){
            System.out.println("O candidato de número: "+ (indice+1)+" é: "+candidatos[indice]);
        }
        System.out.println("Forma abreviada de interacao for each ");
        for(String candidato:candidatos){
            System.out.println("O3e4 candidato selecionado foi: "+ candidato);
        }
    }

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};   
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados <5 && candidatosAtual< candidatos.length){
            String candidato = candidatos[candidatosAtual]; 
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidato+" Solicitou este valor de salário"+salarioPretendido);
            if (salarioBase>= salarioPretendido){
                candidatosSelecionados++;
            }
            candidatosSelecionados++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salariobase = 2000.0;
        if (salariobase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salariobase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA"); 
        }else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }

    }
}
