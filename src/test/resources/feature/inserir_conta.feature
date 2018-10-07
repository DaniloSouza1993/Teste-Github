Feature: Cadastro de contas
Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

@ignore
Scenario: Deve inserir uma conta com sucesso
Given que estou acessando a aplicacao
When informo o usuario "daniloinfoprojetos@gmail.com"
And a senha "americasarm"
And seleciono entrar
Then visualizo a pagina inicial
When seleciono Contas
And seleciono Adicionar
And informo a conta "Conta de Teste"
And seleciono Salvar
Then a conta eh inserida com sucesso
Then eu saiu do browser



Scenario: Nao deve inserir uma conta sem nome
Given que estou acessando a aplicacao
When informo o usuario "daniloinfoprojetos@gmail.com"
And a senha "americasarm"
And seleciono entrar
Then visualizo a pagina inicial
When seleciono Contas
And seleciono Adicionar
And seleciono Salvar
Then sou notificar que o nome da conta e obrigatorio



Scenario: Nao deve inserir uma conta com nome já existente 
Given que estou acessando a aplicacao
When informo o usuario "daniloinfoprojetos@gmail.com"
And a senha "americasarm"
And seleciono entrar
Then visualizo a pagina inicial
When seleciono Contas
And seleciono Adicionar
And informo a conta "Conta de Teste"
And seleciono Salvar
Then sou notificado que ja existe uma conta com esse nome