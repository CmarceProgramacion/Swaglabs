Feature: Comprar producto en SWAGLABS
  Como usuario
  Necesito acceder  la plataforma SWAGLABS
  Para realizar la compra de un articulo

  @Caso1
  Scenario: Comprar producto
    Given usuario ingresa a la pagina SWAGLABS
    When Ingresa el nombre del usuario y la contrasena
    And Selecciona el producto agregandolo al carrito
    Then valida el mensaje de la pagina principal "Checkout: Complete!"
