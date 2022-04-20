package Generics.ComGeneric.DentroDeMetodos;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("js","java","C++","KOtlin");
        List<Integer> nums = Arrays.asList(15,3,8,5);

        String UltimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(UltimaLinguagem);

        Integer UltimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(UltimoNumero);

        System.out.println("Tipo generico que o metodo sozinho analaiza qual tipo é o dado");

        String UltimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(UltimaLinguagem);

        Integer UltimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(UltimoNumero);




    }
}
