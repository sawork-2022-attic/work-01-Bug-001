import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asciiPanel.AsciiPanel;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        AsciiPanel asciiPanel = context.getBean("panel", AsciiPanel.class);

        for (int i = 0; i < 24; i++) {
            asciiPanel.write("Hello, world!", 0, i);
        }
        JFrame frame = new JFrame("AsciiPanel");
        frame.add(asciiPanel);
        frame.setSize(80 * 9, 24 * 16);
        frame.setVisible(true);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
