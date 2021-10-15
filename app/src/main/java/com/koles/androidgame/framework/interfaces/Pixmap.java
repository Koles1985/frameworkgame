package com.koles.androidgame.framework.interfaces;

import com.koles.androidgame.framework.interfaces.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public PixmapFormat getFormat();

    public void dispose();
}
