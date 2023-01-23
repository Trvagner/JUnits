package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
//Trabalhando com TDD
//Criar a classe
public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		//refatorando
		//direciona os percentuais para a classe eNum Desempenho
		
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
		
		
		//antes de refatorar
		//		if (desempenho == Desempenho.A_DESEJAR) {
//			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
//			funcionario.reajustarSalario(reajuste);
//		}else if (desempenho == Desempenho.BOM) {
//			BigDecimal reajuste =funcionario.getSalario().multiply(new BigDecimal("0.15"));
//				funcionario.reajustarSalario(reajuste);
//		}else {
//			BigDecimal reajuste =funcionario.getSalario().multiply(new BigDecimal("0.2"));
//			funcionario.reajustarSalario(reajuste);
//			}
			
		}
		
	}


