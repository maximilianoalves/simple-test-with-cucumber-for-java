Feature: PesquisaFeature
  Esse é um teste funcional para uma pesquisa básica no Google.

  Scenario: Simples pesquisa no Google
    Given que eu navego até o google
    And eu entro com a pesquisa "Maximiliano Alves da Cruz"
    And clico no botão pesquisar
    Then Eu devo estar com a pesquisa realizada e o primeiro resultado deve ser "Maximiliano Alves da Cruz. | LinkedIn"