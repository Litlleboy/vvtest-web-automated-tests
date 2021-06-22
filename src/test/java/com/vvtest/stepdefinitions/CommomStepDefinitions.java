package com.vvtest.stepdefinitions;

import com.vvtest.steps.CommomSteps;

import io.cucumber.java.pt.Dado;
import net.thucydides.core.annotations.Steps;

public class CommomStepDefinitions {

    @Steps
    CommomSteps commomSteps;

    @Dado("que eu acesse a página da VV Test")
    public void que_eu_acesse_a_página_da_VV_Test() {
        commomSteps.acessaPaginaInicial();
    }

    @Dado("acesse o menu {string}")
    public void acesse_o_menu(String menu) {
        commomSteps.acessaMenu(menu);
    }
}
