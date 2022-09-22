package Game;

import Controller.PlayerController;
import Display.Display;
import Entity.Enemy;
import Entity.GameObject;
import Entity.Player;
import Input.Input;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Display display;
    private List<GameObject> gameObjects;
    private Input input;

    // passing in parameters for game size.
    public Game(int width, int height){
        input=new Input();
        display = new Display(width,height, input);
        gameObjects = new ArrayList<>();
        gameObjects.add(new Player(new PlayerController(input)));
         }
    public void update(){
        gameObjects.forEach(gameObject -> gameObject.update());
    }
    public void render(){
        display.render(this);

    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
