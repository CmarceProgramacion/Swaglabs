Feature: Comprar producto en SWAGLABS
  Como usuario
  Necesito acceder  la plataforma SWAGLABS
  Para realizar la compra de un articulo

  @Caso1
  Scenario Outline: Comprar producto
    Given usuario ingresa a la pagina SWAGLABS
    When Ingresa credenciales con la informacion de la <hoja> y <fila>
    And Selecciona el producto agregandolo al carrito de la <hoja> y <fila>
    Then valida el mensaje de la pagina principal "Checkout: Complete!"

    Examples:
      | hoja | fila |
      | 0    | 1    |
      | 0    | 2    |
      | 0    | 3    |
