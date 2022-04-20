package Generics.ComGeneric.comHeranca;

import Generics.ComGeneric.Caixa;

public class CaixaNumero< N  extends Number> extends Caixa <N> {
    //esta limitando somente os tipos que extendido de number excluindo o string de poder ser registrado
}
