package io.github.angry_birds.Block;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import io.github.angry_birds.CustomWorld;

public class Icehollow extends Block {

    public Icehollow(float x, float y, CustomWorld world, ShapeRenderer shapeRenderer, SpriteBatch batch, float angle, int health) {
        super(x, y,"ui/hollowglass.png", world, batch, shapeRenderer,health,1.5f,50,50,angle,2);
        super.createRectangulardynamicBody();
    }
}
