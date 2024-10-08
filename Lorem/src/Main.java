import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Ensure the GUI creation is on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // Create a parent frame to anchor the JOptionPane
            JFrame parentFrame = new JFrame();
            parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            parentFrame.setSize(300, 200);
            parentFrame.setVisible(false);
            parentFrame.setLocationRelativeTo(null);

            // Create a JOptionPane
            JOptionPane optionPane = new JOptionPane("This is a message",
                    JOptionPane.INFORMATION_MESSAGE, JOptionPane.OK_CANCEL_OPTION);

            // Create a JDialog to wrap the JOptionPane
            JDialog dialog = optionPane.createDialog(parentFrame, "Title");

            // Get screen size
            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

            // Calculate position for the dialog (e.g., bottom-right corner)
            int dialogWidth = dialog.getWidth();
            int dialogHeight = dialog.getHeight();
            int x = screenSize.width - dialogWidth;
            int y = 0;

            // Set the dialog location
            dialog.setLocation(x, y);

            // Show the dialog
            dialog.setVisible(true);
        });
    }
}
