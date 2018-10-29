package io.hwxp.pattern.strategy.theme;

public class ThemeManager {
    private Theme theme;
    public  void  setTheme(Theme theme){
        this.theme=theme;
    }


    public void showTheme(){
        this.theme.showTheme();
    }
}
