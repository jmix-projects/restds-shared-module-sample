package com.company.orders.view.products.product;

import com.company.orders.view.main.MainView;
import com.company.shared.entity.Product;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "products", layout = MainView.class)
@ViewController("shared_Product.list")
@ViewDescriptor("product-list-view.xml")
@LookupComponent("productsDataGrid")
@DialogMode(width = "50em")
public class ProductListView extends StandardListView<Product> {
}
