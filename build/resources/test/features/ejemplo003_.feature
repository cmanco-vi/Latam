#Autor: Crihstian Manco
@HU1
Feature: opencart
  Como usuario, quiero ver mis Puntos de recompensa

  @prueba3
  Scenario Outline: Ver Puntos de recompensa

    Given que Crihstian Manco quiere visitar la página de opencart
    And él inicia sesión en la página
      | username   | password   |
      | <username> | <password> |
    When va a la sección de puntos de recompensa y visualiza los puntos__
    Then él valida la sección de puntos de recompensa__

    Examples:
      | username      | password |
      | cmanco@choucairtesting.com          | demo   |

