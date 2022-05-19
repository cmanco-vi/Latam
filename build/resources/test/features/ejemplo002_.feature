#Autor: Crihstian Manco
@HU1
Feature: opencart
  Como usuario, quiero ver mis descargas

  @prueba2
  Scenario Outline: Ver descargas

    Given que Crihstian Manco quiere visitar la página de opencart
    And él inicia sesión en la página
      | username   | password   |
      | <username> | <password> |
    When va a la sección de descargas y visualiza las descargas_
    Then él valida la sección de descargas_

    Examples:
      | username      | password |
      | cmanco@choucairtesting.com          | demo   |

