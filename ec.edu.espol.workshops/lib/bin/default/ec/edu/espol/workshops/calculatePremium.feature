Feature: Calculate the insurance prime for a customer
    
    Scenario Outline: The customer is valid
    Given Is "<gender>", "<isMarried>", "<age>", "<isValid>" license
    When I calculate the premium
    Then Show "<answer>"
    
    Examples:
    / gender	/ isMarried	/ age	/ isValid	/ answer /
    / male	/ not married	/ 22	/ valid	/ 2000 /
    / female	/ married	/ 50	/ valid	/ 400 /
    / female	/ married	/ 26	/ valid	/ 300 /
    / female	/ not married	/ 80	/ valid	/ 500 /