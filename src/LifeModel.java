                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

import java.util.Scanner;


/**
 * @author kimberly.jans
 * This class simulates Conway's Game of Life
 * each time the timer fires, the next generation of
 * the cells is calculated.
 * If you click run, the simulation will run continuously
 * pause will stop the simulation momentarily
 * step will generate only the next generation of cells
 * resume starts the simulation running again after pause
 */
public class LifeModel implements ActionListener
{

    /*
     *  This is the Model component.
     */

    public static final int SIZE = 60;
    private LifeCell[][] myGrid; //grid of cells
    private LifeView myView; //Jpanel that draws grid
    private Timer timer; //makes the animation possible

    // initial population from file or random if no file available
    public LifeModel(LifeView view)
    {
    	
    	// initialize 
        myGrid = new LifeCell[SIZE][SIZE];
        for (int r = 0; r < SIZE; r++ )
            for (int c = 0; c < SIZE; c++ )
                myGrid[r][c] = new LifeCell();

      
        try
        {
        	File reader = new File("life100.txt");
        	Scanner infile = new Scanner(reader);
        	int numInitialCells = infile.nextInt();
            for (int count=0; count<numInitialCells; count++)
            {
                int r = infile.nextInt();
                int c = infile.nextInt();
                myGrid[r][c].setAliveNow(true);
            }
            infile.close();
        }
        catch (IOException e)
        {
        	// use random population
        	System.out.println("using a random setup");
                                                       
                for (LifeCell[] row: myGrid)
                    for ( LifeCell cell: row)
                        if ( Math.random() > 0.85)
                            cell.setAliveNow(true);
        }
        myView = view; //set the view
        myView.updateView(myGrid); //draw the grid
    }

    /**
     * This method stop the timer and animation
     */
    public void pause()
    {
        timer.stop();
    }
    
    /**
     * This method restarts the timer and animation
     */
    public void resume()
    {
        timer.restart();
    }
    
    /**
     * This does one generation of Life and stops
     */
    public void step()
    {
        oneGeneration();
        myView.updateView(myGrid);
    }
    
    /**
     * This starts the timer and sets speed
     */
    public void run()
    {
        timer = new Timer(50, this); //create timer and set delay
        timer.setCoalesce(true); //keep timer events even
        timer.start(); //start the timer
    }

   
    /**
     * This makes the animation.  Every time the timer fires
     * a new generation of life is created and drawn on the screen
     */
    public void actionPerformed(ActionEvent e)
    {
        oneGeneration();
        myView.updateView(myGrid);
    }

    /**
     * Updates all cells in the grid to create the next generation
     * of life and death.  The next state of the grid
     * must be set by looking at the now state.
     * The rules of life:
     * 1. An empty cell with 3 live neighbors comes to life in the next generation.
     * 2. A cell with 1 or 0 neighbors will die of loneliness.
     * 3. A cell with 4 or more neighbors will die from overcrowding.
     * 4. A cell with 2 or 3 neighbors will live into the next generation.
     * 5. All births and deaths occur simultaneously!
     * 
     * This method calls NumLiveNeighbors(), updateNextGen()
     */
    public void oneGeneration()
    {
    	
    } 
    
    /**
     * Helper method for oneGeneration()
     * Update all cells in the grid
     * "simultaneously" to their new destiny.
     * use for each loops
     */
    private void updateNextGen() {

    }
     
    /**
     * Helper method for oneGeneration
     * Given a cell in the grid, count its number
     * of live neighbors.  (Can you use nested loops??)
     * @param row - row of cell to find neighbors
     * @param col - column of cell to find neighbors
     * @return - number of live neighbors of the cell
     * 
     * This method calls inBounds()
     */
    private int numLiveNeighbors (int row, int col)
    {
       return 0;
    }
    
    /**
     * Helper method for numLiveNeighbors
     * Given a cell row and col checks to see if 
     * the cell is in bounds.
     * @param row - row of cell
     * @param col - column of cell
     * @return - true if this cell is in bounds
     */
    private boolean inBounds(int row, int col)
    {
        return false;
    }
}

