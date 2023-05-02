package padroesestruturais.flyweight;

public class Icone {
    private String nome;

    public Icone(String nome) {
        this.nome = nome;
        carregar();
    }

    public void exibir(int x, int y) {
        System.out.println("Exibindo ícone " + nome + " nas coordenadas (" + x + ", " + y + ")");
    }

    private void carregar() {
        System.out.println("Carregando ícone " + nome);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
