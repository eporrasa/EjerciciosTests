Feature: Crear una empresa
  Como usuario
  Quiero crear una empresa
  Para poder asignarle información relevante

  Scenario: Nueva empresa
    Given Estoy en la página principal
    When Selecciono el menú empresas
    And Presiono el botón Nueva empresa
    And Ingreso "<NIT>" como nuevo NIT
    And Ingreso "<empresa>" como nueva razon social
    Then Debo ver el titulo "<titulo>"

    Examples:
      | NIT | empresa | titulo   |
      | 800.001.000-1  | Prueba1     | Adicionar Empresa  |
      | 801.002.002-2 | Alejandria Consulting   | Adicionar Empresa  |
      | admin | admin    | Adicionar Empresa |
      | admin | adminko  | Adicionar Empresa     |
      | user2 | user2    | userhome  |