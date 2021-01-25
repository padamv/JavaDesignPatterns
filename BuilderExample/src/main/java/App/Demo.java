package App;

import Service.EmployeeBuilder;
import Service.HtmlBuilder;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChild("li", "hello")
                .addChild("li", "world");
       // System.out.println(builder);

        EmployeeBuilder employeeBuilder = new EmployeeBuilder()
                .withName("Adam")
                .worksAs("Developer");
        System.out.println(employeeBuilder.build());
    }
}
