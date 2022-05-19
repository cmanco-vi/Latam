#Autor: Crihstian Manco
@HU1
Feature: opencart
  Como usuario, quiero ver los el historial de pedidos

  @prueba
  Scenario Outline: Ver pedidos totales

    Given que Crihstian Manco quiere visitar la página de opencart
    And él inicia sesión en la página
      | username   | password   |
      | <username> | <password> |
    When va a la sección de historial de pedidos y visualiza el historial de pedidos
    Then él valida la sección de pedidos totales

    Examples:
      | username      | password |
      | cmanco@choucairtesting.com          | demo   |

