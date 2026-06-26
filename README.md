# ☕ Java Exercícios — Gustavo Ben Abraham

Repositório com exercícios e práticas de Java desenvolvidos durante meus estudos.  
Todos os projetos foram escritos no **Eclipse IDE** e organizados por aulas.

---

## 📁 Estrutura do Repositório

```
java-exercicios/
└── CursoJavaBasico/
    └── src/
        ├── Aula13Exercicio01/   → Primeiros programas Java
        ├── Aula13Exercicio02/   → ...
        ├── Aula15Exercicio01/   → Estruturas condicionais
        ├── Aula15Exercicio02/   → ...
        ├── cursobasicojava11/   → Variáveis e tipos de dados
        ├── cursobasicojava12/   → Leitura de dados pelo teclado
        ├── cursobasicojava13/   → Operadores
        ├── cursobasicojava14/   → Estruturas condicionais (if)
        ├── cursobasicojava15/   → Switch Case
        └── ...
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem principal
- **Eclipse IDE** — Ambiente de desenvolvimento
- **Git + GitHub** — Controle de versão

---

## 🚀 Script de Envio Automático para o GitHub

Para facilitar o envio dos exercícios ao GitHub, desenvolvi um script `.bat` que automatiza todo o processo de `add`, `commit`, `pull` e `push` com apenas um clique.

### 📥 Como usar o script

**1. Faça o download do arquivo:**  
Baixe o arquivo [`enviar-para-github.bat`](./enviar-para-github.bat) deste repositório.

**2. Configure o caminho da sua pasta:**  
Abra o arquivo com o Bloco de Notas e edite a linha abaixo com o caminho do **seu** repositório:

```bat
cd /d "C:\Users\SEU_USUARIO\caminho\para\seu\repositorio"
```

**3. Como executar:**
- Coloque o arquivo `.bat` dentro da pasta do seu repositório
- Sempre que terminar um exercício no Eclipse, clique duas vezes no `.bat`
- Digite uma descrição do que você adicionou quando solicitado
- Pronto! O exercício será enviado automaticamente para o GitHub ✅

### ⚙️ O que o script faz por baixo dos panos

```
git add .              → Detecta automaticamente os arquivos novos
git commit -m "..."    → Salva com a descrição que você digitou
git pull origin main   → Sincroniza com o GitHub antes de enviar
git push origin main   → Envia tudo para o repositório
```

> 💡 O `git pull` antes do `push` evita erros de conflito — esse é o segredo para nunca ter o erro `rejected` no terminal!

---

## 📌 Como clonar este repositório

```bash
git clone https://github.com/GustavoBenAbraham/java-exercicios.git
```

---

## 👤 Autor

**Gustavo Ben Abraham**  
🔗 [github.com/GustavoBenAbraham](https://github.com/GustavoBenAbraham)

---

> *Repositório em constante crescimento conforme avanço nos estudos de Java* 📚
