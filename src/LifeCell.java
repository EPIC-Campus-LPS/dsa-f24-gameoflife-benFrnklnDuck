

/**
 * This class represents a single cell
 * it has 4 states - alive now, dead now
 * alive in the next generation, dead in next generation
 * @author kimberly.jans
 *
 */
public class LifeCell
{
    boolean alive_now;      
    boolean alive_next;      
    
    public LifeCell()
    {
        alive_now = false;
        alive_next = false;
    }

    /**
     * @return true if cell is alive, false if dead
     */
    public boolean isAliveNow()
    {
        return alive_now;
    }
    
    /**
     * @param state - set state of cell (alive/dead)
     */
    public void setAliveNow(boolean state)
    {
        alive_now = state;
    }

    /**
     * @return true if cell will be alive in the next generation
     */
    public boolean isAliveNext()
    {
        return alive_next;
    }
    
    /**
     * @param state - set cell to alive or dead in next generation
     */
    public void setAliveNext(boolean state)
    {
        alive_next = state;
    }

}

