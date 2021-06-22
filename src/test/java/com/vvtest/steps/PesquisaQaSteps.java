package com.vvtest.steps;

import com.vvtest.model.QuestionarioDTO;
import com.vvtest.pages.PesquisaQaPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PesquisaQaSteps {

    PesquisaQaPage pesquisaQaPage;

    @Step
    public void preencheCamposObrigatorios() {
        QuestionarioDTO camposQuestionario = QuestionarioDTO.retornaCamposObrigatorios();

        pesquisaQaPage.preencheNome(camposQuestionario.nome())
                .preencheSobrenome(camposQuestionario.sobrenome())
                .preencheEmail(camposQuestionario.email())
                .preencheConfirmacaoEmail(camposQuestionario.confirmacaoEmail())
                .preencheIdade(camposQuestionario.idade())
                .preencheTempoArea(camposQuestionario.tempoArea())
                .preencheAtracaoArea(camposQuestionario.atracaoArea())
                .preenchePrecisaMelhorar(camposQuestionario.precisaMelhorar())
                .preencheLinguagemProgramacao(camposQuestionario.linguagemProgramacao());

        enviaFormulario();
    }

    public void enviaFormulario() {
        pesquisaQaPage.clicaEnviar();
    }

    @Step
    public void deveExibirPaginaSucesso() {
        String msgSucesso = pesquisaQaPage.retornaMensagemSucesso();

        assertThat(msgSucesso, equalTo("Your form has been successfully submitted."));
    }
}
