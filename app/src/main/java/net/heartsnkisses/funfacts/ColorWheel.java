package net.heartsnkisses.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by akipnis on 8/1/2017.
 */

public class ColorWheel {
  private static final int[] COLORS = new int[] {
      Color.RED,
      Color.GREEN,
      Color.BLUE,
      Color.BLACK,
      Color.LTGRAY,
      Color.MAGENTA,
      Color.DKGRAY
  };

  private static final Random RANDOM = new Random();

  public int getColor() {
    return COLORS[RANDOM.nextInt(COLORS.length)];
  }
}
