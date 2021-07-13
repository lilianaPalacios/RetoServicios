#language: en

  Feature: como futuro usuario
           quiero crear un usuario
           para posteriormente usar los servicios expuestos


  Background:
      Given se verifica la conexion a internet

    #@Case1
    Scenario: Create user successfully

  Scenario: Crear un usuario con datos correctos

    When El usuario ingresa los datos solicitados por el servicio
          |_id|_UserName|_firstName|_lastName|_email|_password|_phone|_userStatus|
          |0  |pepitoPe |pepito    |perez    |as@gmail.com|As123|3154125812|0   |
    Then El servicio responde un status code 200