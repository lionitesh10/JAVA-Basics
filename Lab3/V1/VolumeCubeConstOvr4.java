class Box {
    int length, breadth, height;

    Box(int l) {
        length = breadth = height = l;
    }

    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void Volume() {
        System.out.println("Volume of Box is : " + (length * breadth * height));
    }
}

class VolumeCubeConstOvr4 {
    public static void main(String[] args) {
        Box Cube = new Box(5);
        Cube.Volume();
        Box normalBox = new Box(5, 6, 7);
        normalBox.Volume();
    }
}