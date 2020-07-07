# bitbank-biblioteca
Simula uma biblioteca que vai armazenar um .jar para importar classes.

Passos para realizar isso:
------------------------------------------------------------------------------------------------------
- Ir até Package Explorer, selecionar o projeto escolhido e clicar com o botão direito -> Export
------------------------------------------------------------------------------------------------------
- Ir até a pasta Java -> JAR file
------------------------------------------------------------------------------------------------------
- Na caixa de diálogo, selecionar as pastas que serão exportadas
------------------------------------------------------------------------------------------------------
- Selecionar apenas a pasta src, apenas exportaremos o código fonte
------------------------------------------------------------------------------------------------------
- Exportamos o código para o desktop com o nome de bitbank-1.0.jar
------------------------------------------------------------------------------------------------------
- Criamos um novo projeto, Ex: projeto-biblioteca
------------------------------------------------------------------------------------------------------
- Criamos uma pasta dentro desse projeto chamado libs
------------------------------------------------------------------------------------------------------
- Criamos uma classe, Ex: TesteBiblioteca
------------------------------------------------------------------------------------------------------
- Nomearemos o package como brq.com.nomedosite.nomedoprojeto
------------------------------------------------------------------------------------------------------
- Selecionamos o nomedoarquivo.jar e clicamos com botão direito. Build Path -> Add to Build Path
------------------------------------------------------------------------------------------------------
- Voltamos para a classe TesteBiblioteca, utilizamos o import para pegar as classes do .jar
------------------------------------------------------------------------------------------------------
- E por fim, criamos: import br.com.nomedoprojeto.banco.modelo.*;
------------------------------------------------------------------------------------------------------

Feito todos esses passos, você poderá utilizar as classes de um projeto aleatório que foi repassado por outro desenvolvedor.
