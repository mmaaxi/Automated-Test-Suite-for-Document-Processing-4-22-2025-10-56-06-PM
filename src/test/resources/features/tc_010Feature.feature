Feature: Validar generación de "Slip de salida" y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given el usuario ha iniciado sesión y navega a la sección de carga de documentos
    When el usuario carga los documentos necesarios y confirma el procesamiento
    Then el sistema debe generar el "Slip de salida"
    And el sistema debe guardar los documentos originales en el historial de la solicitud
    And el sistema debe guardar los datos extraídos en el historial de la solicitud