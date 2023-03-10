package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	
	//na refatoração criamos o metodo abstrato
	//percentualReajuste
	//implementa em cada constante
	A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
                return new BigDecimal("0.03");
        }
},
BOM {
        @Override
        public BigDecimal percentualReajuste() {
                return new BigDecimal("0.15");
        }
},
OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
                return new BigDecimal("0.2");
        }
};

public abstract BigDecimal percentualReajuste();

}
