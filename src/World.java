public class World {
    public int sizeX;
    public int sizeY;
    public int sizeEX;
    public int sizeEY;
    public int[][] inPutConveyorData;
    public int[][] outPutConveyorData;

    public int[][] world;

    public World(int inPutSizeX, int inPutSizeY) {
        sizeX = inPutSizeX;
        sizeY = inPutSizeY;
        sizeEX = sizeX + 1;
        sizeEY = sizeY + 1;

        inPutConveyorData = new int[][] {
                {1, sizeEY}, {2, 0}, {0, 3}, {sizeEX, 4}
        };
        outPutConveyorData = new int[][] {
                {5, sizeEY}, {6, 0}, {0, 7}, {sizeEX, 8}
        };

        world = new int[sizeY][sizeX];
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeY; x++) {
                world[y][x] = 0;
            }
        }
        world[3][3] = 1;
    }
}
