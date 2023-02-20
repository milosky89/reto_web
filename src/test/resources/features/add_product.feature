#author: Camilo Garcia

  @addProduct
  Feature: Add products to shop cart
    as a Falabella user
    I want to add products
    to buy them

    @addProductsSuccessful
    Scenario: Choose products in falabella
      Given "User" want to navigate to "https://www.falabella.com.co/"
      When add products to cart
      Then I can see the name of the products
      And I can see the number of products
      And I can see the subtotal of all products