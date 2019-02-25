package edu.illinois.cs.cs125.spring2019.mp2.lib;

/**
 * I pray to god everyday, to keep you forever.
 */
public class ConnectN {
    /**Minimum board width is 6.*/
    public static final int MIN_WIDTH = 6;
    /**Maximum board width is 16.*/
    public static final int MAX_WIDTH = 16;
    /**Minimum board height is 6.*/
    public static final int MIN_HEIGHT = 6;
    /**Maximum board height is 16.*/
    public static final int MAX_HEIGHT = 16;
    /**Minimum board N value is 4.*/
    public static final int MIN_N = 4;
    /**width.*/
    private int width;
    /**height.*/
    private int height;
    /**n.*/
    private int n;
    /**b.*/
    private boolean start = false;
    /**233. */
    private  boolean wid = false;
    /**999. */
    private boolean hei = false;
    /**
     * Creates a new ConnectN board with a given width, height, and N value.
     * @param setWidth the width for the new ConnectN board
     * @param setHeight the height for the new ConnectN board
     * @param setN the N value for the new ConnectN board
     */
    public ConnectN(final int setWidth, final int setHeight, final int setN) {
        this.width = setWidth;
        this.height = setHeight;
        this.n = setN;
        this.start = false;
        if (setWidth < MIN_WIDTH || setWidth > MAX_WIDTH) {
            this.width = 0;
            this.n = 0;
        }
        if (setHeight < MIN_HEIGHT || setHeight > MAX_HEIGHT) {
            this.height = 0;
            this.n = 0;
        }
        if (setN < MIN_N || setN >= width || setN >= height) {
            this.n = 0;
        }
    }
    /**Create a new ConnectN board with uninitialized width, height, and N value.*/
    public ConnectN() {
    }

    /**
     * Create a new ConnectN board with given width and height, but uninitialized N value.
     * @param setWidth the width for the new ConnectN board
     * @param setHeight the height for the new ConnectN board
     */
    public ConnectN(final int setWidth, final int setHeight) {
        this.width = setWidth;
        this.height = setHeight;
        if (setWidth < MIN_WIDTH || setWidth > MAX_WIDTH) {
            this.width = 0;
        }
        if (setHeight < MIN_HEIGHT || setHeight > MAX_HEIGHT) {
            this.height = 0;
        }
    }

    /**
     *Create a new ConnectN board with dimensions and N value copied from another board.
     * @param otherBoard the ConnectN board to copy width, height, and N from
     */
    public ConnectN(final ConnectN otherBoard) {
        this.width = otherBoard.width;
        this.height = otherBoard.height;
        this.n = otherBoard.n;
    }

    /**
     * Get the current board width.
     * @return the current board width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Attempt to set the board width.
     * @param setWidth the new width to set
     * @return true if the width was set successfully, false on error
     */
    public boolean setWidth(final int setWidth) {
        if (setWidth < MIN_WIDTH || setWidth > MAX_WIDTH) {
            n = 0;
            return false;
        }
        if (start) {
            return false;
        }
        this.width = setWidth;
        if (this.n >= setWidth && this.n >= this.height) {
            this.n = 0;
        }
        this.wid = true;
        return true;
    }

    /**
     *Get the current board height.
     * @return the current board height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     *Attempt to set the board height.
     * @param setHeight the new height to set
     * @return true if the height was set successfully, false on error
     */
    public boolean setHeight(final int setHeight) {
        if (setHeight < MIN_HEIGHT || setHeight > MAX_HEIGHT) {
            n = 0;
            return false;

        }
        if (start) {
            return false;
        }
        this.height = setHeight;
        if (this.n >= setHeight && this.n >= this.width) {
            this.n = 0;
        }
        this.hei = true;
        return true;
    }

    /**
     * Get the current board N value.
     * @return the current board N value
     */
    public int getN() {
        return this.n;
    }

    /**
     * Attempt to set the current board N value.
     * @param newN the new N
     * @return true if N was set successfully, false otherwise
     */
    public boolean setN(final int newN) {
        if (start) {
            return false;
        }
        if (!wid || !hei) {
            return false;
        }
        if (newN < MIN_N || newN >= width || newN >= height) {
            return false;
        }
        this.n = newN;
        return true;
    }

    /**
     * Set the board at a specific position.
     * @param player the player attempting the move
     * @param setX the X coordinate that they are trying to place a tile at
     * @param setY the Y coordinate that they are trying to place a tile at
     * @return true if the move succeeds, false on error
     */
    public boolean setBoardAt(final Player player, final int setX, final int setY) {
        return true;
    }

    /**
     *Drop a tile in a particular column.
     * @param player the player attempting the move
     * @param setX the X coordinate for the stack that they are trying to drop a tile in
     * @return true if the move succeeds, false on error
     */
    public boolean setBoardAt(final Player player,
                              final int setX) {
        return true;
    }

    /**
     * Get the player at a specific board position.
     * @param getX the X coordinate to get the player at
     * @param getY the Y coordinate to get the player at
     * @return the player whose tile is at that position, or null if nobody has played at that position
     */
    public Player getBoardAt(final int getX,
                             final int getY) {
        return null;
    }

    /**
     * Return a copy of the board.
     * @return a copy of the current board
     */
    public Player[][] getBoard() {
        return null;
    }

    /**
     * Return the winner of the game, or null if the game has not ended.
     * @return the winner of the game, or null if the game has not ended
     */
    public Player getWinner() {
        return null;
    }

    /**
     * Class method to create a new ConnectN board.
     * @param width the width of the new ConnectN instance to create
     * @param height the height of the new ConnectN instance to create
     * @param n the n value of the new ConnectN instance to create
     * @return the n value of the new ConnectN instance to create
     */
    public static ConnectN create(final int width,
                                  final int height,
                                  final int n) {
        return null;
    }

    /**
     *Creates multiple new ConnectN instances.
     * @param number the number of new ConnectN instances to create
     * @param width the width of the new ConnectN instance to create
     * @param height the height of the new ConnectN instance to create
     * @param n the n value of the new ConnectN instance to create
     * @return an array of new ConnectN instances, or null if the parameters are invalid
     */
    public static ConnectN[] createMany(final int number,
                                        final int width,
                                        final int height,
                                        final int n) {
        return null;
    }

    /**
     * Compare two ConnectN boards.
     * @param firstBoard the first ConnectN board to compare
     * @param secondBoard the second ConnectN board to compare
     * @return true if the boards are the same, false otherwise
     */
    public static boolean compareBoards(final ConnectN firstBoard,
                                        final ConnectN secondBoard) {
        return true;
    }

    /**
     * Compare any number of ConnectN boards.
     * @param boards the array of ConnectN boards to compare
     * @return true if all passed boards are the same, false otherwise
     */
    public static boolean compareBoards(final ConnectN... boards) {
        return true;
    }



}

