Estrutura de Pastas
O espaço de trabalho contém duas pastas por padrão, onde:

src: a pasta para manter os códigos-fonte
lib: a pasta para manter as dependências
Enquanto isso, os arquivos de saída compilados serão gerados na pasta bin por padrão.

Se você quiser personalizar a estrutura de pastas, abra .vscode/settings.json e atualize as configurações relacionadas lá.

Gerenciamento de Dependências
A visualização JAVA PROJECTS permite gerenciar suas dependências. Mais detalhes podem ser encontrados aqui.

Projeto do Bootcamp Santander
Este projeto foi criado como parte do Bootcamp Santander Back-End JAVA, uma abstração de um bootcamp com a instrutora Camila Cavalvanti. O objetivo é aplicar os conceitos aprendidos durante o curso em um projeto prático.

Paradigmas da Orientação a Objetos
A orientação a objetos é um paradigma de programação que utiliza "objetos" – instâncias de classes – para modelar partes de um sistema. Java é uma linguagem de programação orientada a objetos (OOP), que se baseia em quatro pilares principais:

1. Abstração
A abstração envolve a simplificação de sistemas complexos através da modelagem de classes que representam conceitos ou entidades. Apenas os detalhes essenciais são expostos, ocultando a complexidade desnecessária.

2. Encapsulamento
O encapsulamento é a prática de esconder os detalhes internos de um objeto e expor apenas o que é necessário. Isso é realizado utilizando modificadores de acesso (como private, protected, e public) e métodos getters e setters.

3. Herança
A herança permite criar novas classes baseadas em classes existentes. Uma classe filha (ou subclasse) herda atributos e métodos de uma classe pai (ou superclasse), promovendo a reutilização de código e a criação de hierarquias.

4. Polimorfismo
O polimorfismo permite que objetos de diferentes classes sejam tratados de forma unificada através de interfaces comuns ou classes base. Isso permite a flexibilidade de usar uma única interface para diferentes tipos de ações.

Aplicação no Projeto
Neste projeto do Bootcamp Santander, você aplicará esses conceitos para criar uma aplicação que simula a gestão de um bootcamp, incluindo a criação de cursos, gerenciamento de inscrições, e emissão de certificados. Cada entidade no sistema (como alunos, cursos, e instrutores) será representada como objetos com atributos e métodos específicos.