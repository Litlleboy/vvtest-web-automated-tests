package com.vvtest.model;

import com.github.javafaker.Faker;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.thucydides.core.annotations.Steps;

@Getter @Setter @Builder @Accessors(fluent = true)
public class QuestionarioDTO {

    private String nome;
    private String sobrenome;
    private String email;
    private String confirmacaoEmail;
    private int idade;
    private int tempoArea;
    private int atracaoArea;
    private int precisaMelhorar;
    private String linguagemProgramacao;

    public static QuestionarioDTO retornaCamposObrigatorios() {
        Faker faker = new Faker();
        String nome = faker.name().firstName();
        String sobrenome = faker.name().lastName();
        String email;
        String confirmacaoEmail = email = faker.internet().emailAddress();;
        int idade = faker.number().numberBetween(0, 2);
        int tempoArea = faker.number().numberBetween(0, 2);
        int atracaoArea = faker.number().numberBetween(0, 2);
        int precisaMelhorar = faker.number().numberBetween(0, 4);
        String linguagemProgramacao = String.format("%s, %s e %s", faker.programmingLanguage().name(), faker.programmingLanguage().name(), faker.programmingLanguage().name());

        return new QuestionarioDTOBuilder()
                .nome(nome)
                .sobrenome(sobrenome)
                .email(email)
                .confirmacaoEmail(confirmacaoEmail)
                .idade(idade)
                .tempoArea(tempoArea)
                .atracaoArea(atracaoArea)
                .precisaMelhorar(precisaMelhorar)
                .linguagemProgramacao(linguagemProgramacao)
                .build();
    }
}
