import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;

@Configuration
public class Main {
    @Bean
    AsciiPanel asciiPanel() {
        return new AsciiPanel();
    }

    @Bean
    AsciiFont asciiFont() {
        return new AsciiFont();
    }

    @Bean
    String fontFilename() {
        return "drake_10x10.png";
    }

    @Bean
    int height() {
        return 10;
    }

    @Bean
    int width() {
        return 10;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);

        System.out.println(asciiPanel.getAsciiFont().getFontFilename());

        context.close();
    }
}
