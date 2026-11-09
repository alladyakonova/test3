package pac;

public class GameSettings {
    static int maxPlayers = 5;
    final String gameName = "Маджонг";
    int currentPlayers;

    GameSettings (int currentPlayers) {
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        currentPlayers++;

    }

    void printGameStatus() {
        System.out.println("Название игры: " + gameName + ", Текущеее количество игроков: " + this.currentPlayers + ", Максимальное количество игроков: " + maxPlayers);
    }



}
