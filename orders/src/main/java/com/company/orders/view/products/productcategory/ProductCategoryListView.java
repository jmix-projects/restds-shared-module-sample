package com.company.orders.view.products.productcategory;

import com.company.orders.view.main.MainView;
import com.company.shared.entity.ProductCategory;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "productCategories", layout = MainView.class)
@ViewController("shared_ProductCategory.list")
@ViewDescriptor("product-category-list-view.xml")
@LookupComponent("productCategoriesDataGrid")
@DialogMode(width = "50em")
public class ProductCategoryListView extends StandardListView<ProductCategory> {
}
