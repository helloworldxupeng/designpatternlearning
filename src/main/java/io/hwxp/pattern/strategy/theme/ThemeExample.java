package io.hwxp.pattern.strategy.theme;

public class ThemeExample {
    public static void main(String[] args) {
        ThemeManager themeManager=new ThemeManager();
        themeManager.setTheme(new DefaultTheme());
        themeManager.showTheme();
    }
}
