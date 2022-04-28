

Feature: Realizar login e efetuar uma Compra em E-commerce


 @Login
   Scenario Outline: Logar no site Automationpractice
   
      Given usuario esteja na pagina inicial do site  "http://automationpractice.com/index.php"    
      When usuario clicar no botao SignIn
      And preencher os campos <email> , <passwd>
      And clicar no botao SignIn para logar
      Then usuario sera redirecionado para a pagina MyAccount 
      And clicar o botao Home para ser direcionado a pagina inicial
    
      Examples:
      | email                       |passwd   |                    
      | "sandra_AccTeste@gmail.com" |"123456" | 
      
      
      
 @Compra
    Scenario Outline: Selecionar produto 
   
      Given usuario inserir nome do item no campo <search> 
      And  direcionado para a pagina de lista de itens
      And  clicar no produto desejado
      When usuario escolher as opcoes dos boxs <quantity> , <size> , <color>
      And  clicar no botao add to cart
      Then tela resumo de compra abrira ,escolher opcao proceed to checkout
    
    
      Examples:
      | search    | quantity   | size | color  |                   
      |"T-shirts" |   "5"      | "M"  | "blue" |
      
     
    Scenario Outline: Confirmar Endereco
   
      Given usuario confirme as informacoes do summary , clicar em proceed to checkout
      And  na pagina Address usuario inserir comentario no campo add comment <observacao>
      When clicar no botao proceed to checkout, sera direcionado para pagina shipping
      And  Devera aceitar terms of service de entrega na pagina shipping
      Then clicar no botao proceed to checkout ,sera direcionado para pagina de payment
      
       Examples:
      | observacao                                   |         
      | "Mercadoria Podera ser entregue para Amara!" |
      
      
      
    Scenario Outline: Finalizar Compra
   
      Given usuario escolher a forma de pagamento pay by bank wire  
      When clicar no botao confirm my order para continuar o pagamento
      And  clicar no botao back to orders, mostrara historico de compra
      Then usuario clicara em home para voltar a pagina inicial do site 
      