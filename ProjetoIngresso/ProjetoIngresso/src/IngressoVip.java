public class IngressoVip extends Ingresso {
    
    public double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;        
    }

    public void ImprimirVip() {
        super.Imprimir();
        System.out.println("Adicional: " + adicional);
        System.out.println("Valor total: " + (valor + adicional));
    }    
}
