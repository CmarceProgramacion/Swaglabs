Feature: Autenticacion SWAGLABS
  Como usuario
  Necesito autenticarme
  Para ingresar a la plataforma de SWAGLABS

  @Caso1
  Scenario Outline: Iniciar sesion
    Given usuario ingresa a la pagina SWAGLABS
    When Ingresa credenciales con la informacion de la <hoja> y <fila>
    Then valida el mensaje de la pagina principal "Products"

    Examples:
      | hoja | fila |
      | 0    | 1    |
      | 0    | 2    |
      | 0    | 3    |