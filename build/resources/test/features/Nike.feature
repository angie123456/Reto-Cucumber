Feature:HU-01 Buscador Nike
  Yo como usuario de N
  Quiero buscar un pais en la plataforma
  Para ver el nombre del pais en pantalla

  Background:
   Given que me encuentro en la pagina de N
    When busque el pais <NombrePais>


  Scenario Outline: Buscar producto
    When busque el producto <NombreProducto>
    Then  podre ver <NombreProducto> en pantalla
    Examples:
      |NombreProducto|
      |Nike Wildhorse 7 Calzado de trail running para hombre|
