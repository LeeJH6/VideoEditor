import javax.swing.*;
import java.awt.BorderLayout;

public class StatisticsPanel extends JPanel {
    JTextArea textArea;

    public StatisticsPanel() {
        textArea = new JTextArea(8, 30);
        textArea.setFont(MyWindowTools.ARIAL_UNICODE_14);
        textArea.setEditable(false);

        addTextArea();
        setBorder(MyWindowTools.createMyBorder("Statistics"));
    }

    public void addTextArea() {
        JScrollPane scrollPane = new JScrollPane(textArea
                , ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
                , ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        setLayout(new BorderLayout());
        add(scrollPane);
    }
