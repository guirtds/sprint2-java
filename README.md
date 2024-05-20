# Sprint2 Java - Projeto MyTrend

- Acessar Link para vídeo do Projeto: https://www.youtube.com/watch?v=Pz85ywx5Fgc

### Nome da Aplicação: MyTrend

### Descrição do projeto: 
<br>
- O MyTrend é um aplicativo voltado para o setor de Varejo, focado na venda de roupas, acessórios e sapatos. Desenvolvido em resposta ao desafio da Plusoft, "Desvendando o Potencial dos Dados", o MyTrend utiliza AI Generativa e Deep Analytics para oferecer uma experiência única aos clientes. Ele permite aos usuários encontrar combinações ideais de roupas de forma ágil e inovadora, utilizando dados gerados nas interações com clientes, leads e prospects. Com ênfase na compreensão e utilização eficaz dos dados, o MyTrend impulsiona o crescimento empresarial ao fornecer recomendações personalizadas e relevantes para cada usuário.

 
## Integrantes
- Guilherme Rocha Toledo dos Santos - RM99396
  <br>
 Responsável pela codificação CadastroCliente e exportação para o GitHub.
  
- Gustavo Nunes Pereira - RM551496
  <br>
  Responsável pela codificação CRUD CaracteristicasCliente.
  
- Isadora Tatajuba Moreira Pinto - RM552522
  <br>
  Responsável pelo ReadME da aplicação.
   
- Maria Eduarda Sousa de Oliveira - RM552477
  <br>
  Responsável pela documentação e diagramas.
  
- Matheus Wasserman Fernandes Silva - RM550712
  <br>
  Responsável pelas melhorias e correções do projeto.


## Execução do código

1. Extrair arquivo da pasta zipada
2. Abrir o IntelliJ
3. Na opção (OpenFile) e acessar a pasta "sprint"
4. Com o código Java aberto no IntelliJ, rodar as dependências (build.graddle)
5. Rodar a aplicação
6. Para requisições utilizar os endpoints que estão disponíveis na documentação do projeto.


## Visão geral - Listagem de endpoints 
### Endpoints Cliente
- Criar Cliente <br>
  Método: POST  <br>
  Endpoint: /api/cliente  <br>
  Descrição: Cria um novo cliente com os dados fornecidos.  <br>
- Buscar Cliente  <br>
  Método: GET  <br>
  Endpoint: /api/cliente/buscar  <br>
  Descrição: Busca todos os clientes cadastrados.  <br>
- Atualizar Cliente
  Método: PUT  <br>
  Endpoint: /api/cliente/{id}  <br>
  Descrição: Atualiza os dados de um cliente específico identificado pelo ID.  <br>
- Excluir Cliente
  Método: DELETE  <br>
  Endpoint: /api/cliente/{id}  <br>
  Descrição: Exclui um cliente específico identificado pelo ID.  <br>

### Endpoints Endereço
- Criar Endereço  <br>
  Método: POST  <br>
  Endpoint: /api/endereco  <br>
  Descrição: Cria um novo endereço com os dados fornecidos. <br>
- Atualizar Endereço  <br>
  Método: PUT  <br>
  Endpoint: /api/endereco/{id}  <br>
  Descrição: Atualiza os dados de um endereço específico identificado pelo ID.  <br>
- Buscar Endereço  <br>
  Método: GET  <br>
  Endpoint: /api/endereco/buscar  <br>
  Descrição: Busca todos os endereços cadastrados.  <br>
- Excluir Endereço  <br>
  Método: DELETE  <br>
  Endpoint: /api/endereco/{id}  <br> 
  Descrição: Exclui um endereço específico identificado pelo ID.  <br>

### Endpoints Pedido
- Criar Pedido <br>
  Método: POST <br>
  Endpoint: /api/pedido <br>
  Descrição: Cria um novo pedido com os dados fornecidos. <br>
- Atualizar Pedido <br>
  Método: PUT <br>
  Endpoint: /api/pedido/{id} <br>
  Descrição: Atualiza os dados de um pedido específico identificado pelo ID. <br>
- Buscar Pedido <br>
  Método: GET <br>
  Endpoint: /api/pedido/buscar <br>
  Descrição: Busca todos os pedidos cadastrados. <br>
- Excluir Pedido <br>
  Método: DELETE <br>
  Endpoint: /api/pedido/{id} <br>
  Descrição: Exclui um pedido específico identificado pelo ID. <br>

### Endpoints CadastroCliente
- Criar CadastroCliente <br>
  Método: POST <br>
  Endpoint: /api/cadastroCliente <br>
  Descrição: Cria um novo cadastro de cliente com os dados fornecidos. <br>
- Atualizar CadastroCliente <br>
  Método: PUT <br>
  Endpoint: /api/cadastroCliente/{id} <br>
  Descrição: Atualiza os dados de um cadastro de cliente específico identificado pelo ID. <br>
- Buscar CadastroCliente <br>
  Método: GET <br>
  Endpoint: /api/cadastroCliente/buscar <br>
  Descrição: Busca todos os cadastros de clientes registrados. <br>
- Excluir CadastroCliente <br>
  Método: DELETE <br>
  Endpoint: /api/cadastroCliente/{id} <br>
  Descrição: Exclui um cadastro de cliente específico identificado pelo ID. <br>

### Endpoints CaracteristicasCliente
- Criar CaracteristicasCliente <br>
  Método: POST <br>
  Endpoint: /api/caracteristicasCliente <br>
  Descrição: Cria uma nova caracteistica de cliente com os dados fornecidos. <br>
- Atualizar CaracteristicasCliente <br>
  Método: PUT <br>
  Endpoint: /api/caracteristicasCliente/{id} <br>
  Descrição: Atualiza os dados de uma caracteistica de cliente específica identificada pelo ID. <br>
- Buscar CaracteristicasCliente <br>
  Método: GET <br>
  Endpoint: /api/caracteristicasCliente/buscar <br>
  Descrição: Busca todos as caracteisticas de clientes registradas. <br>
- Excluir CaracteristicasCliente <br>
  Método: DELETE <br>
  Endpoint: /api/caracteristicasCliente/{id} <br>
  Descrição: Exclui uma caracteistica de cliente específica identificada pelo ID. <br>

<br>

## Atualizações do projeto <br>
Adição de mais duas entidades, sendo elas: <br>
- CadastroCliente <br>
= CaracteristicasCliente <br>
Além das correções no Bean Validation, para exemplificar: <br>
- @Email <br>
- @NotNull <br>
- @Positive <br>
- @PastOrPresent <br>

## Observações <br>
- Observação: Diagramas Relacionais e UML estão inseridos na documentação commitada. <br>
- Os endpoints listados estão disponíveis na pasta "Endpoints". <br>
