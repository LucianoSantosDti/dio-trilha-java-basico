public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo!");
        analisarCandidato(1900.0);
        analisarCandidato(22000.0);
        analisarCandidato(2000.0);

    }
    static void analisarCandidato(double salarioPretendido){
        double salariobase= 2000.0;
        if(salariobase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salariobase == salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
        

    }
}
