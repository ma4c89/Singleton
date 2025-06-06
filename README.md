<h1 align="center">🔒 Padrão de Projeto Singleton em Java</h1>

<p align="center">
  <img src="https://www.geeksforgeeks.org/wp-content/uploads/Singleton-Design-Pattern-in-Java-1-1.png" alt="Diagrama do Padrão Singleton em Java" width="600"/>
</p>

---

Este projeto demonstra a aplicação do padrão Singleton em Java por meio de exemplos práticos, como um sistema de Logger e cadastro de usuários com IDs automáticos.

## 📌 Problema

❓ Como garantir que apenas uma única instância de uma classe seja criada, mesmo quando diversas partes do código tentam criar novos objetos?

## 🎯 Objetivo

🎯 Garantir que uma classe possua somente uma instância e disponibilizar um ponto de acesso global a essa instância.

## 📚 Aplicações comuns do Singleton

- 🔗 Gerenciamento de conexão com banco de dados  
- 📄 Acesso exclusivo a arquivos de log  
- 🪟 Controle de janelas ou interfaces únicas  
- ⚙️ Configurações e recursos globais da aplicação  

## 💡 Funcionamento

O padrão Singleton funciona seguindo os passos abaixo:

1. 🗂 Define uma variável estática para armazenar a instância única.  
2. 🔒 Restringe o construtor da classe, tornando-o privado para impedir criação externa de objetos.  
3. 📲 Oferece um método público e estático, geralmente chamado `getInstancia()`, que cria e retorna a instância única quando necessário.

## ✅ Conclusão

O padrão Singleton é amplamente utilizado para garantir um ponto único de acesso a funcionalidades críticas, como logging, configurações e conexões. Ele contribui para a economia de recursos, evita inconsistências e simplifica a manutenção do código.
