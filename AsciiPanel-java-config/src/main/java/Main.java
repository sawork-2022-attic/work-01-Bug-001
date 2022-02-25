import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import asciiPanel.AsciiPanel;
import config.AsciiPanelConfig;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);

        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);

        for (int i = 0; i < 24; i++) {
            asciiPanel.write("Hello, world!", 0, i);
        }
        JFrame frame = new JFrame("AsciiPanel");
        frame.add(asciiPanel);
        frame.setSize(80 * 9, 24 * 16);
        frame.setVisible(true);

        ((AnnotationConfigApplicationContext) context).close();
    }
}
