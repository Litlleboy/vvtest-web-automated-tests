package com.vvtest.steps;

import com.vvtest.pages.CommomPage;
import net.thucydides.core.annotations.Step;

public class CommomSteps {

    CommomPage commomPage;

    @Step
    public void acessaPaginaInicial() {
        commomPage.open();
    }

    @Step
    public void acessaMenu(String menu) {
        commomPage.clicaMenu(menu);
    }
}
