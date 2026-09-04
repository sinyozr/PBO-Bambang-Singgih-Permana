public class Dragon {
    int x = 0;
    int y = 0;
    int direction = 1;

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak boleh lebih dari 4, dan tidak boleh kurang dari 1");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y += steps;
                break;
            case 4:
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        System.out.println("Posisi: (" + x + ", " + y + ") \nArah: " + direction);
    }
}