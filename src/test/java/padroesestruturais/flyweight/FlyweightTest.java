package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

public class FlyweightTest {
    @Test
    void testFlyweight() {

        IconeFactory iconeFactory = new IconeFactory();


        Icone icone1 = iconeFactory.getIcone("icone1");
        Icone icone2 = iconeFactory.getIcone("icone2");
        Icone icone3 = iconeFactory.getIcone("icone3");
        Icone icone4 = iconeFactory.getIcone("icone4");
        Icone icone5 = iconeFactory.getIcone("icone5");


        icone1.exibir(10, 10);
        icone2.exibir(20, 20);
        icone3.exibir(30, 30);
        icone4.exibir(40, 40);
        icone5.exibir(50, 50);
    }
}
