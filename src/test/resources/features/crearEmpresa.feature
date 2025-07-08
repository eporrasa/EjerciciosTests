Feature: Crear una empresa
  Como usuario
  Quiero crear una empresa
  Para poder asignarle información relevante

  Scenario: Nueva empresa
    Given Estoy en la página principal
    When Selecciono el menú empresas
    And Presiono el botón Nueva empresa
    And Ingreso "800.587.254-7" como nuevo NIT
    And Ingreso "Prueba Empresa" como nueva razon social
    Then Debo ver la nueva página para cargar la información