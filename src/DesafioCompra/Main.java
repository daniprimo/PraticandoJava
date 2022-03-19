package DesafioCompra;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eronice Cristina lopes Sousa Moreira");
        Compra compra1 = new Compra();
        compra1.adicionarIntens("Sabonete Dove",5.25,3);
        compra1.adicionarIntens("Arroz 5Kg",7.25,4);
        compra1.adicionarIntens("Caixa c/12 Leite Mucosa",3.25,12);

        Compra compra2 = new Compra();
        compra1.adicionarIntens("Impressora",998,1);
        compra1.adicionarIntens("Placa Mãe nerd",875.37,1);
        compra1.adicionarIntens("Fonte",300.25,1);

        Compra compra3 = new Compra();
        compra1.adicionarIntens("Impressora",998,1);
        compra1.adicionarIntens("Placa Mãe nerd",875.37,1);
        compra1.adicionarIntens("Fonte",300.25,1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);
        cliente.adicionarCompra(compra3);
        System.out.println(cliente.obterValorTotal());

    }



}
