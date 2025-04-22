Feature: Subida de archivo con vista previa

  Scenario: Validar subida de archivo con formato válido y vista previa
    Given el usuario está en la página de carga de archivos
    When selecciona un archivo en formato PDF/DOCX dentro del límite de 50 MB
    Then el archivo se carga y se muestra la vista previa con nombre, tamaño y tipo del archivo