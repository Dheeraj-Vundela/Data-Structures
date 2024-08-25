// MazeRunner_Solution
package Maze_DS;

import asset.Cheese;
import asset.Maze;


public class MazeRunner {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Maze maze = new Maze(9, 16);
        maze.printWorld(new Mouse(), new Cheese()).show();
    }

}
