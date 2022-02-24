package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;

@Configuration
public class AsciiPanelConfig {
    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel(80, 24, CP437_9x16_Font());
    }

    @Bean
    public AsciiFont CP437_8x8_Font() {
        return new AsciiFont("cp437_8x8.png", 8, 8);
    }

    @Bean
    public AsciiFont CP437_10x10_Font() {
        return new AsciiFont("cp437_10x10.png", 10, 10);
    }

    @Bean
    public AsciiFont CP437_12x12_Font() {
        return new AsciiFont("cp437_12x12.png", 12, 12);
    }

    @Bean
    public AsciiFont CP437_16x16_Font() {
        return new AsciiFont("cp437_16x16.png", 16, 16);
    }

    @Bean
    public AsciiFont CP437_9x16_Font() {
        return new AsciiFont("cp437_9x16.png", 9, 16);
    }

    @Bean
    public AsciiFont DRAKE_10x10_Font() {
        return new AsciiFont("drake_10x10.png", 10, 10);
    }

    @Bean
    public AsciiFont TAFFER_10x10_Font() {
        return new AsciiFont("taffer_10x10.png", 10, 10);
    }

    @Bean
    public AsciiFont QBICFEET_10x10_Font() {
        return new AsciiFont("qbicfeet_10x10.png", 10, 10);
    }

    @Bean
    public AsciiFont TALRYTH_15_15_Font() {
        return new AsciiFont("talryth_square_15x15.png", 15, 15);
    }
}
