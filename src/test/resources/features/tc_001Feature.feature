Feature: Document Upload Mode Selection

  Scenario: Validate selection of document upload mode
    Given I am on the document upload page
    When I select "cargar documentos"
    Then the system should display options for "carga única" and "carga múltiple"
    
    When I choose "carga en un solo archivo"
    Then a single file upload box should be enabled
    
    When I choose "cargar documentos por separado"
    Then multiple file upload boxes for each required document should be displayed