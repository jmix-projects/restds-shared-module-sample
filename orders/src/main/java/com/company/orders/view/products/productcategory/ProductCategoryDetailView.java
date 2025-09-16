package com.company.orders.view.products.productcategory;

import com.company.orders.view.main.MainView;
import com.company.shared.entity.ProductCategory;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "productCategories/:id", layout = MainView.class)
@ViewController("shared_ProductCategory.detail")
@ViewDescriptor("product-category-detail-view.xml")
@EditedEntityContainer("productCategoryDc")
public class ProductCategoryDetailView extends StandardDetailView<ProductCategory> {
}
