Feature: Autenticacion SWAGLABS
  Como usuario
  Necesito autenticarme
  Para ingresar a la plataforma de SWAGLABS

  @Caso1
  Scenario: Iniciar sesion
    Given usuario ingresa a la pagina SWAGLABS
    When Ingresa el nombre del usuario y la contrasena
    Then valida el mensaje de la pagina principal "Products"