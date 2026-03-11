package br.com.nogueiranogueira.aularefatoracao.service.strategy;

import br.com.nogueiranogueira.aularefatoracao.model.dto.SolicitacaoCreditoRequest;

public interface AnaliseStrategy {

    boolean analisar(SolicitacaoCreditoRequest solicitacao);
}
