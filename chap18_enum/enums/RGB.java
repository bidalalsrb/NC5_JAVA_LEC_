package chap18_enum.enums;

public enum RGB {
    //상수명 RED, GREEN, BLUE

    RED("red", 255, 0, 0) {
        public void makeWhite() {

            String[] color = {"red", "green", "blue"};
            System.out.println(color[1] + "," + color[2] + "부족해");
        }
    },

    GREEN("green", 0, 255, 0) {
        @Override
        public void makeWhite() {
            String[] color = {"red", "green", "blue"};
            System.out.println(color[0] + "," + color[2] + "부족해");
        }
    },
    BLUE("blue", 0, 0, 255) {
        @Override
        public void makeWhite() {
            String[] color = {"red", "green", "blue"};
            System.out.println(color[0] + "," + color[1] + "부족해");
        }
    };

    public String name;
    public int red;
    public int green;
    public int blue;

    public String getName() {
        return name;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    RGB(String name, int red, int green, int blue) {
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public abstract void makeWhite();
}
