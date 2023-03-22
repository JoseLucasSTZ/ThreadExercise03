
public class Principal {

    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 1000);
        Trabalhador raimundo = new Trabalhador("bota", 1000);
        Trabalhador joao = new Trabalhador("camiseta", 1000);
        severino.start();
        raimundo.start();
        joao.start();
    }
}
