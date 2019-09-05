package zx.learn.result.computer.motherboard;

public enum BoardSize {
    ATX(5), MATX(4), ITX(3);

    int size;


    BoardSize(int size) {
        this.size = size;
    }


}
