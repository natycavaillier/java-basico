package aula3;

import java.util.ArrayList;

public class matrizes {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        int c = 3;

        for (int i = 0; i < c; i++) {
            matriz.add(new ArrayList<>());
        }

        matriz.get(0).add(12);
        matriz.get(0).add(22);
        matriz.get(0).add(14);
        matriz.get(1).add(52);
        matriz.get(1).add(37);
        matriz.get(1).add(78);
        matriz.get(2).add(87);
        matriz.get(2).add(62);
        matriz.get(2).add(42);

        System.out.println(matriz.get(0));
        System.out.println(matriz.get(1));
        System.out.println(matriz.get(2));

        System.out.println("[1,1] = " + matriz.get(1).get(1));
    }
}
