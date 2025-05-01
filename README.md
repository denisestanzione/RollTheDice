# 🎲Roll The Dice🎲

---

Una semplice ma coinvolgente applicazione Android che sfida la sorte con il lancio di dadi. Il gioco si articola in tre schermate (Activity) e mostra all'utente un risultato di vittoria o sconfitta in base alla parità del numero uscito. 

---

## 👩‍💻 Autore
- Realizzato da **Stanzione Denise**
- **GitHub: [@denisestanzione](https://github.com/denisestanzione)**

---

## 📝 Caratteristiche
- **Tre Activity** ben definite per guidare l'utente attraverso il flusso del gioco
- Generazione casuale del lancio dei dadi
- Passaggio di dati tra Activity tramite **'Intent'**
- Valutazione semplice:
  - dispari = vittoria🏆
  - pari = sconfitta❌
- Interfaccia intuitiva e immagini di dadi

---

## 👾 Struttura dell'app

### **Activity 1: Schermata iniziale💻**
- **Layout:**
  - Due **'ImageView'** che rappresentano i due dadi
  - Un **'Button'** con testo **"Lancia"**

- **Funzionalità:**
  - Al clic sul bottone **"Lancia"**, viene generato un numero casuale tra 1 e 6, che verrà mostrato poi nella seconda Activity

 
 ### **Activity 2: Lancio dado🎰**
- **Layout:**
  - Una **'ImageView'** che mostra la faccia del dado uscito
  - Un **'Button'** con testo **"Risultato"**

- **Funzionalità:**
  - Visualizza l'immagine del numero del dado
  - Al clic sul bottone **"Risultato"** passa alla terza Activity



### **Activity 3: Risultato🎖**
- **Layout:**
  - Un **'TextView'** che mostra l'esito **"Hai vinto!"** oppure **"Hai perso!"**

- **Funzionalità:**
  - Se il numero estratto è dispari mostra **Hai vinto!"**
  - Se è pari mostra **"Hai perso!"**

---

## 🤳 Tecnologie utilizzate
- **Linguaggio:** Kotlin
- **IDE:** Android Studio
- **Framework:** Android SDK
- **Layout:** XML
- **Navigazione:** 'Intent' tra Activity

---

## ✔ Installazione
1. Clona il repository:
   ```bash
   https://github.com/denisestanzione/RollTheDice.git
2. Apri il progetto in [**Android Studio**](https://developer.android.com/studio)
3. Collega un emulatore o un dispositivo Android
4. Per avviare l'app premi su **"Run"** ▶

---

## ➕ Possibili aggiunte 
- Aggiunta di suoni al lancio del dado
- Animazione del lancio dei dadi
- Classifica con i risultati delle utlime partite

---

## 📲 Stato del progetto
Il progetto è ancora in fase di sviluppo. 
   
  




