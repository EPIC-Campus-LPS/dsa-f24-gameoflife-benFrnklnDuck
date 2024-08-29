import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*
    this is the Controller component
*/

public class Life extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private LifeView view;
    private LifeModel model;
    private JButton runButton, pauseButton, resumeButton, stepButton;
    //private Timer timer;

    public Life() {
        super("Conway's Game of Life");

        // build the buttons
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        runButton = new JButton("Run");
        runButton.addActionListener(this);
        runButton.setEnabled(true);
        controlPanel.add(runButton);
        pauseButton = new JButton("Pause");
        pauseButton.addActionListener(this);
        pauseButton.setEnabled(false);
        controlPanel.add(pauseButton);
        resumeButton = new JButton("Resume");
        resumeButton.addActionListener(this);
        resumeButton.setEnabled(false);
        controlPanel.add(resumeButton);
        stepButton = new JButton("Step");
        stepButton.addActionListener(this);
        stepButton.setEnabled(true);
        controlPanel.add(stepButton);

        // build the view
        view = new LifeView();
        view.setBackground(Color.white);

        // put buttons, view together
        Container c = getContentPane();
        c.add(controlPanel, BorderLayout.NORTH);
        c.add(view, BorderLayout.CENTER);

        // build the model
        model = new LifeModel(view);
    }

    /**
     * respond to each button press
     */
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == runButton) {
            model.run();
            runButton.setEnabled(false);
            pauseButton.setEnabled(true);
            resumeButton.setEnabled(false);
            stepButton.setEnabled(false);
        } else if (b == pauseButton) {
            model.pause();
            runButton.setEnabled(false);
            pauseButton.setEnabled(false);
            stepButton.setEnabled(true);
        } else if (b == resumeButton) {
            model.resume();
            runButton.setEnabled(false);
            pauseButton.setEnabled(true);
            stepButton.setEnabled(false);
        } else if (b == stepButton) {
            model.step();
            runButton.setEnabled(true);
            pauseButton.setEnabled(true);
            resumeButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        Life conway = new Life();
        conway.setDefaultCloseOperation(EXIT_ON_CLOSE);
        conway.setSize(570, 640);
        conway.setVisible(true);
    }


}
