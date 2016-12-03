package com.elijah.game.grabblegame;

/**
 * Created by Elijah on 11/10/2016.
 */

public class Letter {
    private int value;
    private Category category;

    public enum Category {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}


    public Letter(Category category, int value) {

        this.value = value;
        this.category = category;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setCategorys(Category category) {
        this.category = category;
    }

    public Category getCateory() {
        return category;
    }


    public int getAssociatedDrawable() {
        return categoryToDrawable(category);
    }

    public static int categoryToDrawable(Category noteCategory) {
        switch (noteCategory) {
            case A:
                return R.drawable.a;
            case B:
                return R.drawable.b;
            case C:
                return R.drawable.c;
            case D:
                return R.drawable.d;
            case E:
                return R.drawable.e;
            case F:
                return R.drawable.f;
            case G:
                return R.drawable.g;
            case H:
                return R.drawable.h;
            case I:
                return R.drawable.i;
            case J:
                return R.drawable.j;
            case K:
                return R.drawable.k;
            case L:
                return R.drawable.l;
            case M:
                return R.drawable.m;
            case N:
                return R.drawable.n;
            case O:
                return R.drawable.o;
            case P:
                return R.drawable.p;
            case Q:
                return R.drawable.p;
            case R:
                return R.drawable.r;
            case S:
                return R.drawable.s;
            case T:
                return R.drawable.t;
            case U:
                return R.drawable.u;
            case V:
                return R.drawable.v;
            case W:
                return R.drawable.w;
            case X:
                return R.drawable.x;
            case Y:
                return R.drawable.y;
            case Z:
                return R.drawable.z;
            default:
                return R.drawable.x;
        }
    }

}
