Feature: HU-01 Buscador Nike
  Yo como usuario de N
  Quiero buscar un producto en la plataforma
  Para ver el nombre del producto en pantalla

  Scenario: Buscar producto
    Given que me encuentro en la pagina de N
    When busque el producto con excel en "C:\Users\Angie\IdeaProjects\Mi primer reto Cucumber\productos.xlsx"
    Then  podre ver <NombreProducto> en pantalla
