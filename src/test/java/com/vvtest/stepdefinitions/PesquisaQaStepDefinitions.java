package com.vvtest.stepdefinitions;

import com.vvtest.steps.PesquisaQaSteps;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

public class PesquisaQaStepDefinitions {

    @Steps
    PesquisaQaSteps pesquisaQaSteps;

    @Quando("eu preencher todos os campos obrigatórios")
    public void eu_preencher_todos_os_campos_obrigatórios() {
        pesquisaQaSteps.preencheCamposObrigatorios();
    }

    @Então("deve ser direcionado para uma página de sucesso")
    public void deve_ser_direcionado_para_uma_página_de_sucesso() {
        pesquisaQaSteps.deveExibirPaginaSucesso();
    }

}
