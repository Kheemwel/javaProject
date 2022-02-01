package RunAndJump.GameObjects;

public class GameStates {
    enum GameState {
        START_GAME_STATE,
        GAME_PLAYING_STATE,
        GAME_OVER_STATE
    }

    enum CharacterState {
        RUNNING,
        JUMPING,
        DEATH
    }
}
