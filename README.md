<h1 align="center">🔒 Padrão de Projeto Singleton em Java</h1>

---

Este projeto mostra como usar o padrão Singleton em Java por meio de exemplos simples, como um sistema de Logger e cadastro de usuários com IDs automáticos.

## 📌 Problema

Como garantir que apenas um único objeto de uma classe seja criado, mesmo que várias partes do código tentem criar novos?

## 🎯 Objetivo

Assegurar que uma classe tenha uma única instância e forneça um ponto de acesso global a ela.

## 📚 Aplicações comuns do Singleton

- Conexão com banco de dados  
- Acesso a arquivo de log  
- Controle de uma janela única  
- Gerenciamento de configurações globais  

## 💡 Funcionamento

O Singleton segue esses passos:

1. Cria uma variável estática para armazenar a instância.  
2. Tem um construtor privado, para que ninguém crie objetos fora da classe.  
3. Possui um método público e estático chamado `getInstancia()`, que cria o objeto apenas se ainda não existir.

## ✅ Conclusão

O padrão Singleton é muito usado quando é necessário um único ponto de acesso para uma funcionalidade — como log, configuração ou conexão. Ele economiza memória, evita erros e facilita a manutenção do código.
