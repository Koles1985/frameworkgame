package com.koles.androidgame.framework.interfaces;

import android.view.View.OnTouchListener;
import com.koles.androidgame.framework.interfaces.Input.TouchEvent;

import java.util.List;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();

}
