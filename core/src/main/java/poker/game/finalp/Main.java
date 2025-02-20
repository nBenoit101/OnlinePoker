package poker.game.finalp;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class Main extends Game {
    public SpriteBatch batch;
    public FitViewport viewport;
    @Override
    public void create() {
        batch = new SpriteBatch();
        viewport = new FitViewport(8,5);

        this.setScreen(new HomeScreen(this));
    }

    public void render() {
        super.render();
    }

    public void dispose() {
        batch.dispose();
    }
}
