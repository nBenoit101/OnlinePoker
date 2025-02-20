package poker.game.finalp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class HomeScreen implements Screen {
    final Main game;
    Texture backgroundIMG;
    Texture bucketIMG;
    Sprite bucket;





    public HomeScreen(final Main game) {
        this.game = game;
        backgroundIMG = new Texture("33.jpg");
        bucketIMG = new Texture("bucket.png");
        bucket = new Sprite(bucketIMG);
        bucket.setSize(1,1);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        ScreenUtils.clear(Color.BLACK);
        game.viewport.apply();
        game.batch.setProjectionMatrix(game.viewport.getCamera().combined);
        game.batch.begin();

        float worldWidth = game.viewport.getWorldWidth();
        float worldHeight = game.viewport.getWorldHeight();

        game.batch.draw(backgroundIMG, 0, 0, worldWidth, worldHeight);
        bucket.draw(game.batch);

        game.batch.end();
    }




    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void resize(int width, int height) {
        game.viewport.update(width, height, true);
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        backgroundIMG.dispose();
        bucketIMG.dispose();
    }

}
