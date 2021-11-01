package com.flamexander.cloud.client;

//import com.flamexander.cloud.client.services.ProductService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flamexander.cloud.client.entites.Product;
import java.util.List;

@RestController
public class GreetingControllerImpl implements GreetingController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    ExcelReader excelReader;

//    @Autowired
//    ProductService productService;

    @Autowired
    public void setGreetingClient(ExcelReader excelReader) {
        this.excelReader = excelReader;
    }

    @Value("${spring.application.name}")
    private String appName;

    @Value("${userValue}")
    private String username;

    @Override
    public String greeting() {
//        try {
//            return String.format(excelReader.read().toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InvalidFormatException e) {
//            e.printStackTrace();
//        }
        return "this eureka client";
    }

    @Override
    public String greeting1() {
        return String.format("Hello1");
    }

    @Override
    public String greetingExample() {
        return String.format("greetingExample");
    }

//    @Override
//    public String getTableBase() {
//        return String.format("Hello1");
//    }

    @GetMapping("/abc")
    public void test() {
        System.out.println("test");
    }


    @Override
    public Cat getCat() {
        return new Cat(1, "Zina");
    }

//    @Override
//    public List<Product> getProduct() {
//        return productService.getAllProducts();
//    }
}
