package Lambdas.InterfaceSupplierFornecedor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

        Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Pe");

        System.out.println(umLista.get());
    }
}
