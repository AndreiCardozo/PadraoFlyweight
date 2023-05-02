package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconeFactory {
    private Map<String, Icone> icones = new HashMap<>();

    public Icone getIcone(String nome) {
        if (!icones.containsKey(nome)) {
            icones.put(nome, new Icone(nome));
        }
        return icones.get(nome);
    }
}
