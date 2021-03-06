package com.deco2800.marswars.renderers;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.renderers.BatchTiledMapRenderer;

/**
 * Renderers provide an interface between lists of objects and the LibGDX Graphics Backend.
 * Renderers can be used to create both 2D and 3D worlds currently, however further renderers could be created to render
 * other objects such as minimaps etc.
 * @author Tim Hadwen
 */
public interface Renderer {

    /**
     * Renderers must be able to render a world given a list of Entities and a batch renderer
     * @param batch Batch to render onto
     */
    void render(SpriteBatch batch, Camera camera);

    /**
     * Retuns the correct renderer for tiles in the given engine
     */
    BatchTiledMapRenderer getTileRenderer(SpriteBatch batch);
}