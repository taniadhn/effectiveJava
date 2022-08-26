package com.work.effectivejava.item9;

import java.awt.*;
import java.util.Objects;





public class ColorPoint {


    private final Color color;
    private final Point point;


    public ColorPoint(int x, int y, Color color) {

        this.color = color;
        point =  new Point(x,y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColorPoint that = (ColorPoint) o;
        return Objects.equals(color, that.color) && Objects.equals(point, that.point);
    }

}
