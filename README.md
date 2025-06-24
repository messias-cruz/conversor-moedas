# 💱 Conversor de Moedas (Java + API)

Este projeto é um **conversor de moedas via console**, desenvolvido como parte do desafio da formação Java da Alura. Ele realiza a conversão entre diferentes moedas usando dados **reais e atualizados** obtidos de uma API pública (ExchangeRate API).

## 🚀 Funcionalidades

- Interface via terminal com menu interativo
- Conversão de moedas em tempo real usando API externa
- Suporte a múltiplas moedas:
  - USD ⇄ BRL
  - EUR ⇄ BRL
  - JPY ⇄ BRL
  - KRW ⇄ BRL
- Cálculo automático do valor convertido
- Boas práticas com separação de responsabilidades (Main, ApiCliente, Conversor, ExchangeRates)

## 🛠 Tecnologias utilizadas

- Java 21
- API REST pública ([ExchangeRate API](https://www.exchangerate-api.com/))
- Gson (para tratar JSON)
- IntelliJ IDEA

## 🔧 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git

2. Acesse a pasta do projeto:
   cd conversor-moedas

3. Adicione sua chave da ExchangeRate API na classe ApiCliente.java:
   private static final String API_KEY = "SUA_CHAVE_AQUI";

4. Compile e execute o projeto:
   * Use o IntelliJ ou rode pelo terminal:
   javac -cp libs/gson-2.13.1.jar -d out src/*.java
   java -cp "out;libs/gson-2.13.1.jar" Main

📦 Organização do projeto
   conversor-moedas/
│
├── src/
│   ├── Main.java
│   ├── Conversor.java
│   ├── ApiCliente.java
│   └── ExchangeRates.java
│
├── libs/
│   └── gson-2.13.1.jar
└── README.md

🙋‍♂️ Autor
Messias Cruz
🚀 Estudante de Java | Apaixonado por aprender e compartilhar conhecimento

   


