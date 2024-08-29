import java.awt.*;
import javax.swing.*;

/*
  this is the View component
  It draws the organism on the screen
*/

public class LifeView extends JPanel {
    private static final long serialVersionUID = 1L;
    private final int SIZE = LifeModel.SIZE;
    private LifeCell[][] myGrid;

    /**
     * initialize the grid with dead cells
     */
    public LifeView() {
        myGrid = new LifeCell[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++)
            for (int col = 0; col < SIZE; col++)
                myGrid[row][col] = new LifeCell();
    }


    /**
     * Draw the grid at its current state
     *
     * @param grid - the current grid
     */
    public void updateView(LifeCell[][] grid) {
        myGrid = grid;
        repaint(); //call paintComponent
    }

    /**
     * Use the graphics object to draw the grid
     * This method is called by repaint()
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int testWidth = getWidth() / (SIZE + 1);
        int testHeight = getHeight() / (SIZE + 1);
        // keep each life cell square
        int boxSize = Math.min(testHeight, testWidth);

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (myGrid[r][c] != null) {
                    if (myGrid[r][c].isAliveNow())// live cells blue
                        g.setColor(Color.blue);
                    else g.setColor(new Color(235, 235, 255)); // dead cells gray

                    g.fillRect((c + 1) * boxSize, (r + 1) * boxSize, boxSize - 2, boxSize - 2);// draw a cell
                }
            }
        }
    }
}
