package tests;

import model.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import repository.ProductRepository;
import service.ProductService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductServiceTests {

  @Test
  public void getProductsWithPriceGreaterThanTest() {
    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    Product p1 = new Product();
    p1.setPrice(5);

    Product p2 = new Product();
    p2.setPrice(11);

    Product p3 = new Product();
    p3.setPrice(15);

    when(productRepository.getAllProducts())
            .thenReturn(Arrays.asList(p1,p2,p3));

    List<Product> products =
            productService.getProductsWithPriceGreaterThan(10);

    assertEquals(Arrays.asList(p2,p3), products);
  }

  @Test
  public void getProductsWithPriceGreaterThanNoGreaterPriceTest() {
    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    Product p1 = new Product();
    p1.setPrice(5);

    Product p2 = new Product();
    p2.setPrice(6);

    Product p3 = new Product();
    p3.setPrice(8);

    when(productRepository.getAllProducts())
            .thenReturn(Arrays.asList(p1,p2,p3));

    List<Product> products =
            productService.getProductsWithPriceGreaterThan(10);

    assertTrue(products.isEmpty());
  }

  @Test
  public void getProductsWithPriceGreaterThanWhenNoProductsTest() {
    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    when(productRepository.getAllProducts())
            .thenReturn(Arrays.asList());

    List<Product> products =
            productService.getProductsWithPriceGreaterThan(10);

    assertTrue(products.isEmpty());
  }

  @Test
  public void addProductTest() {
    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    Product p = new Product();
    p.setName("beer");
    p.setPrice(5);

    when(productRepository.getProductByName(p.getName()))
            .thenReturn(Optional.empty());


    productService.addProduct(p);

    verify(productRepository).addProduct(p);
  }

  @Test
  public void addProductWhenProductAlreadyExistsTest() {
    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    Product p = new Product();
    p.setName("beer");
    p.setPrice(5);

    when(productRepository.getProductByName(p.getName()))
            .thenReturn(Optional.of(p));


    assertThrows(RuntimeException.class,
            () -> productService.addProduct(p));
  }
}
