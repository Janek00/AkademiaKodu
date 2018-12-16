package pl.kodu.akademia.Zadanie2;

public class Box {
    private int height;
    private int width;

    public Box(int width) {
        this.height = width*2;
        this.width = width;
    }

    public void joinDiagonal(Box box) {
        this.height += box.height;
        this.width += box.width;
    }

    public void joinHorizontally(Box box) {
        this.height += box.height;
        if (box.height > this.height)
            this.height = box.height;
    }

    public void joinVertically(Box box) {
        this.width += box.width;
        if (box.width > this.width)
            this.width = box.width;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
