package db_sw7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * SolidWorks GUI to read data from file and display them in different orders.
 */
public final class SolidWorks extends JFrame implements ActionListener {

    private static final String FILE_NAME = "C:\\Users\\Diego\\Documents\\NetBeansProjects\\prg2-exercise\\db_sw1\\src\\db_sw7\\soliddata_cubes.txt";

    private Cube[] solids;

    private final JButton bRead = new JButton("Read file '" + FILE_NAME + "'");
    private final JButton bSort1 = new JButton("Sort on 'volume'");
    private final JButton bSort2 = new JButton("Sort on 'surface'");
    private final JButton bSort3 = new JButton("Sort on 'dimension'");
    private final JTextArea outputArea = new JTextArea();

    /**
     * Konstruktor.
     */
    public SolidWorks() {
        super("SolidWorks");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final JPanel topPanel = new JPanel();
        topPanel.add(bRead);
        add(topPanel, BorderLayout.NORTH);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        final JPanel bottomPanel = new JPanel();
        bottomPanel.add(bSort1);
        bottomPanel.add(bSort2);
        bottomPanel.add(bSort3);
        add(bottomPanel, BorderLayout.SOUTH);

        // Listener registrieren
        bRead.addActionListener(this);
        bSort1.addActionListener(this);
        bSort2.addActionListener(this);
        bSort3.addActionListener(this);
    }

    /**
     * Gibt die Solids aus.
     */
    private void doOutput() {
        outputArea.setText("");
        for (final Cube solid : solids) {
            outputArea.append(solid.toString());
        }
    }

    /*
     * (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent event) {
        if (event.getSource() == bRead) {
            solids = SolidFileIO.readSolids(FILE_NAME);
            doOutput();
        }
        if ((event.getSource() == bSort1) && (solids != null)) {
            // your turn
            doOutput();
        }
        if ((event.getSource() == bSort2) && (solids != null)) {
            // your turn
            doOutput();
        }
        if ((event.getSource() == bSort3) && (solids != null)) {
            // your turn
            doOutput();
        }
    }

    /**
     * main-Methode für Start.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        final SolidWorks frame = new SolidWorks();
        frame.setVisible(true);
    }
}
