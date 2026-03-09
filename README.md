# 🔐 Gerador de Senhas Android com Histórico

Este projeto consiste no desenvolvimento de um aplicativo Android em **Kotlin** para geração de senhas seguras com **histórico de senhas geradas**.

O aplicativo permite que o usuário configure critérios de geração de senha através de uma interface simples e intuitiva, podendo escolher o tamanho da senha e os tipos de caracteres utilizados.

O objetivo do projeto é demonstrar conceitos importantes do desenvolvimento Android, incluindo **interface com XML, lógica em Kotlin, navegação entre telas e manipulação de listas**.

---

# 📱 Funcionalidades

O aplicativo possui as seguintes funcionalidades:

- 🔑 Geração de senhas seguras
- 📏 Controle do tamanho da senha com SeekBar
- 🔠 Opção de incluir letras maiúsculas
- 🔢 Opção de incluir números
- 🔣 Opção de incluir símbolos
- 📋 Botão para copiar senha gerada
- 🔄 Botão para gerar nova senha
- 📚 Histórico de senhas geradas
- 🧭 Navegação entre telas com Bottom Navigation

---

# 🧠 Conceitos Aplicados

Durante o desenvolvimento deste projeto foram utilizados os seguintes conceitos:

- Kotlin para lógica do aplicativo
- XML para construção da interface gráfica
- Fragments para dividir as funcionalidades do aplicativo
- Bottom Navigation para navegação entre telas
- ArrayList para armazenar histórico de senhas
- RecyclerView para exibição do histórico

Componentes de interface utilizados:

- SeekBar
- Switch
- CardView
- RecyclerView
- BottomNavigationView
- Buttons

---

# 📂 Estrutura do Projeto

A estrutura principal do projeto é organizada da seguinte forma:

app  
 ├── java/com/example/passwordgenerator  
 │   ├── MainActivity.kt  
 │   ├── GeneratorFragment.kt  
 │   ├── HistoryFragment.kt  
 │   └── HistoryAdapter.kt  
 │  
 ├── res  
 │   ├── layout  
 │   │   ├── activity_main.xml  
 │   │   ├── fragment_generator.xml  
 │   │   └── fragment_history.xml  
 │   │  
 │   ├── menu  
 │   │   └── bottom_menu.xml  
 │   │  
 │   └── values  
 │       ├── colors.xml  
 │       └── strings.xml  

---

# 🧩 Interface do Aplicativo

O aplicativo possui duas telas principais acessadas pela barra de navegação inferior.

## Tela 1 — Gerador de Senhas

Nesta tela o usuário pode:

- Definir o tamanho da senha usando o **SeekBar**
- Ativar ou desativar:
  - Letras maiúsculas
  - Números
  - Símbolos
- Gerar uma senha segura
- Copiar a senha gerada

A senha é exibida em destaque dentro de um **CardView**.

---

## Tela 2 — Histórico de Senhas

Nesta tela são exibidas todas as senhas geradas anteriormente.

Cada senha gerada é automaticamente adicionada a uma lista de histórico, permitindo que o usuário visualize senhas criadas anteriormente.

---

# 🔐 Lógica de Geração de Senhas

A geração de senha funciona através da combinação de conjuntos de caracteres selecionados pelo usuário.

Os conjuntos possíveis incluem:

- Letras minúsculas
- Letras maiúsculas
- Números
- Símbolos

O algoritmo seleciona caracteres aleatórios destes conjuntos até atingir o tamanho definido pelo usuário.

Exemplo de senha gerada:

A9#kT2@zL1

---

# ⚙️ Como Executar o Projeto

## 1 Clonar o repositório

git clone https://github.com/seuusuario/password-generator-android.git

---

## 2 Abrir no Android Studio

Abra o **Android Studio** e selecione:

Open Project

Depois selecione a pasta do projeto.

---

## 3 Sincronizar dependências

O Android Studio irá automaticamente executar:

Gradle Sync

Aguarde a sincronização terminar.

---

## 4 Executar o aplicativo

Conecte um dispositivo Android ou utilize um **emulador**.

Depois clique em:

Run ▶

O aplicativo será instalado e executado automaticamente.

---


# 🎯 Objetivo Acadêmico

Este projeto foi desenvolvido como atividade prática para aplicar conceitos de:

- Desenvolvimento Android
- Kotlin
- Interface com XML
- Navegação entre telas
- Estruturação de aplicativos mobile

---

# 👨‍💻 Autor

Seu Nome

Curso: Seu Curso  
Instituição: Sua Faculdade  
Ano: 2026

---

# 📄 Licença

Projeto desenvolvido apenas para fins educacionais.
