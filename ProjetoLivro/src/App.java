public class App {
    public static void main(String[] args) throws Exception {
                        
        LivroDigital livroDigi = new LivroDigital("Mais esperto que o diabo", 
        new Autor("Luigi santos", "USA", "email@email.com"), 
        "Desenvolvimento Pessoal", 
        8, 
        55, 
        150);

        livroDigi.info();
    }
}
