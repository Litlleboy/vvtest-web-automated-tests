package com.vvtest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class CommomPage extends PageObject {

    @FindBy(css = "#primary-menu li a")
    private List<WebElementFacade> listMenu;


    public void clicaMenu(String menu) {
        listMenu.stream()
                .filter(opcoesMenu -> opcoesMenu.getText().equalsIgnoreCase(menu))
                .findFirst()
                .get()
                .click();
    }
}
