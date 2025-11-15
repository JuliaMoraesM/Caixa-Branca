# Caixa-Branca
Julia Moraes Martins (RA 248065) - Matéria UX/UI e Testes de Software 
Etapas da Atividade: Tema Caixa Branca

(Parte 1)
- Preenchimento da planilha
<img width="1031" height="580" alt="image" src="https://github.com/user-attachments/assets/5e538730-23e1-413f-85ef-47d4567d1339" />

- Notação de grafo de fluxo
 ![Notação de Grafo de Fluxo](https://github.com/user-attachments/assets/e121ad5f-d61a-461a-86b6-5a253a1982fe)
- Cálculo da complexidade ciclomática

| Nó | Descrição |
|----|-----------|
| **N1** | Inicio (Monta SQL) |
| **N2** | Executa a consulta (Query) |
| **N3** | Ponto de decisão: (`if (rs.next())` |
| **N4** | Bloco verdadeiro |
| **N5** | Retornar |

###  Arestas (5)

- N1 → N2  
- N2 → N3  
- N3 → N4  
- N3 → N5  
- N4 → N5  

### Cálculo 
M = E - N + 2P  
M = 5 - 5 + 2 . 1
M = 2


- Identificação dos caminhos básicos
 

  Resultado Verdadeio: N1 → N2 → N3 → N4 → N5

  Resultado Falso: N1 → N2 → N3 → N5
