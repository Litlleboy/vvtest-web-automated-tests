package com.vvtest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class PesquisaQaPage extends PageObject {

    @FindBy(name = "fname")
    private WebElementFacade txtNome;

    @FindBy(name = "lname")
    private WebElementFacade txtSobrenome;

    @FindBy(name = "email")
    private WebElementFacade txtEmail;

    @FindBy(xpath = "//label[text()='Confirmação de email ']/following::input[1]")
    private WebElementFacade txtConfirmacaoEmail;

    @FindBy(xpath = "//label[text()='Idade ']/following::ul[1]/li")
    private List<WebElementFacade> rdbIdade;

    @FindBy(xpath = "//label[text()='Quanto tempo você está na área de QA? ']/following::select[1]")
    private WebElementFacade selectTempoArea;

    @FindBy(xpath = "//label[text()='O que te atraiu na área? ']/following::select[1]")
    private WebElementFacade selectAtracaoArea;

    @FindBy(xpath = "//label[text()='O que mais você precisa melhorar? ']/following::ul[1]/li")
    private List<WebElementFacade> rdbPrecisaMelhorar;

    @FindBy(xpath = "//label[text()='Qual linguagem de programação te interessa  ']/following::input[1]")
    private WebElementFacade txtLinguagemProgramacao;

    @FindBy(css = "input[value='Enviar']")
    private WebElementFacade btnEnviar;

    @FindBy(css = ".nf-response-msg")
    private WebElementFacade lblSucesso;

    public PesquisaQaPage preencheNome(String nome) {
        txtNome.type(nome);
        return this;
    }

    public PesquisaQaPage preencheSobrenome(String sobrenome) {
        txtSobrenome.type(sobrenome);
        return this;
    }

    public PesquisaQaPage preencheEmail(String email) {
        txtEmail.type(email);
        return this;
    }

    public PesquisaQaPage preencheConfirmacaoEmail(String confirmacaoEmail) {
        txtConfirmacaoEmail.type(confirmacaoEmail);
        return this;
    }

    public PesquisaQaPage preencheIdade(Integer idade) {
        rdbIdade.get(idade).click();
        return this;
    }

    public PesquisaQaPage preencheTempoArea(Integer tempoArea) {
        selectTempoArea.selectByIndex(tempoArea);
        return this;
    }

    public PesquisaQaPage preencheAtracaoArea(Integer atracaoArea) {
        selectAtracaoArea.selectByIndex(atracaoArea);
        return this;
    }

    public PesquisaQaPage preenchePrecisaMelhorar(Integer precisaMelhorar) {
        rdbPrecisaMelhorar.get(precisaMelhorar).click();
        return this;
    }

    public PesquisaQaPage preencheLinguagemProgramacao(String linguagemProgramacao) {
        txtLinguagemProgramacao.type(linguagemProgramacao);
        return this;
    }

    public void clicaEnviar() {
        btnEnviar.click();
    }

    public String retornaMensagemSucesso() {
        return lblSucesso.getText();
    }
}
