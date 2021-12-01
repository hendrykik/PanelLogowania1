package tb.soft;

import java.awt.event.*;
/**
 * klasa główna zawierająca metodę statyczną main
 */
public class MainWindow extends WindowAdapter {
    public static void main(String[] args) {
        logiihasla Loginyihasla  = new logiihasla();
        PanelLogowania loginPage = new PanelLogowania(Loginyihasla.getloginy());
    }
}
