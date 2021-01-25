package App;

import Service.HtmlBuilder;

public class Demo {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChild("li", "hello")
                .addChild("li", "world");
        System.out.println(builder);

    }
}
