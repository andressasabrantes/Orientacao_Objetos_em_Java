public class App {
    public static void main(String[] args) throws Exception {
        
        IngressoVip ingressoVip1 = new IngressoVip("Numanice", 350, 150);
        ingressoVip1.ImprimirVip();

        System.out.println("-----------------------------------");

        Ingresso ingresso1 = new Ingresso("My world 2.0", 2500.00);
        ingresso1.Imprimir();
    }
}
