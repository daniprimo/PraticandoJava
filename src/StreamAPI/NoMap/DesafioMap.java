package StreamAPI.NoMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        /*
            NUmero para String BInaria ... 6 => 110
            Inverter a String "110" =: "011"
            Converter de volta para inteiro => "011" => 3
         */

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);



        Function<Integer, String> binario = n -> Integer.toBinaryString(n);
        UnaryOperator<String> converte = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> volta = s -> Integer.parseInt(s,2);

        nums.stream()
                .map(binario)
                .map(converte)
                .map(volta)
                .forEach(System.out::println);
    }


}
