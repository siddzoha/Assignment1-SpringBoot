package ca.sheridan.siddzoha.assign1.siddiquizassign1.productcontroller;
import ca.sheridan.siddzoha.assign1.siddiquizassign1.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private List<Product> products = new ArrayList<>();

    @GetMapping({"/", "index"})
    public String index(Model model) {
        model.addAttribute("products", new Product());
        return "index";
    }

    @PostMapping("/AddProduct")
    public String addProduct(@ModelAttribute Product product, Model model) {
        products.add(product);
        model.addAttribute("product", product);
        return "confirm";
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        model.addAttribute("products", products);
        return "products";
    }

}
