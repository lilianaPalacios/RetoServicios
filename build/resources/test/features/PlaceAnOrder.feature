#language: en

  Feature: Como usuario
    quiero comprar una mascota
    para jugar con ella

  Scenario: Comparar una mascota
    Given que se consume el servicio
    When Compro la mascota
      |_id|_petId|_quantity|_shipDate|_status|_complete|
      |0  |0     |100      |2021-07-13T00:20:37.930Z|placed|true|
    Then Se obtiene un codigo de respuesta 200