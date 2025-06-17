     let secretNumber,
        attempts = 0;

      const guessInput = document.getElementById("guessInput"),
        guessBtn = document.getElementById("guessButton"),
        resetBtn = document.getElementById("resetButton"),
        msg = document.getElementById("message"),
        attemptsText = document.getElementById("attempts");

      function startGame() {
        secretNumber = Math.floor(Math.random() * 100) + 1;
        attempts = 0;
        msg.textContent = "";
        guessInput.value = "";
        guessInput.disabled = false;
        guessBtn.disabled = false;
        attemptsText.textContent = "Attempts: 0";
      }

      function checkGuess() {
        let guess = parseInt(guessInput.value);

        if (attempts >= 3)
          return endGame(`🚫 All 3 attempts used! Answer: ${secretNumber}`);
        if (!guess || guess < 1 || guess > 100)
          return (msg.textContent = "⚠️ Enter a number 1–100");

        attempts++;
        attemptsText.textContent = `Attempts: ${attempts}`;

        if (guess === secretNumber) return endGame("🎉 Correct Guess!");
        msg.textContent = guess < secretNumber ? "📉 Too low!" : "📈 Too high!";

        if (attempts === 3) endGame(` 😢 Game Over! Answer: ${secretNumber}`);
        guessInput.value = "";
      }

      function endGame(text) {
        msg.textContent = text;
        guessInput.disabled = true;
        guessBtn.disabled = true;
      }

      guessBtn.onclick = checkGuess;
      resetBtn.onclick = startGame;
      guessInput.onkeypress = (e) => e.key === "Enter" && checkGuess();

      startGame();