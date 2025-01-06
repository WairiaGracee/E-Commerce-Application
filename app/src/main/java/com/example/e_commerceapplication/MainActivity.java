package com.example.e_commerceapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;



public class MainActivity extends AppCompatActivity {
    private RecyclerView featuredProductsRecyclerView;
    private FeaturedProductsAdapter featuredProductsAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize button
        Button viewProductsButton = findViewById(R.id.viewProductsButton);
        // Initialize the RecyclerView
        featuredProductsRecyclerView = findViewById(R.id.featuredProductsRecyclerView);
        featuredProductsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the product list
        productList = new ArrayList<>();

        // Add products to the list
        productList.add(new Product("Basic White T-Shirt", 15.99, "https://example.com/white_tshirt.jpg"));
        productList.add(new Product("Slim Fit Denim Jeans", 39.99, "https://example.com/slim_fit_jeans.jpg"));
        productList.add(new Product("Leather Bomber Jacket", 129.99, "https://example.com/leather_bomber_jacket.jpg"));
        productList.add(new Product("Nike Air Force 1", 89.99, "https://example.com/nike_airforce1.jpg"));
        productList.add(new Product("Ray-Ban Aviators", 149.99, "https://example.com/rayban_aviators.jpg"));
        productList.add(new Product("Classic Baseball Cap", 19.99, "https://example.com/baseball_cap.jpg"));
        productList.add(new Product("Chelsea Leather Boots", 120.00, "https://example.com/chelsea_boots.jpg"));
        productList.add(new Product("Summer Floral Dress", 39.99, "https://example.com/summer_floral_dress.jpg"));
        productList.add(new Product("Unisex Zip-Up Hoodie", 34.99, "https://example.com/zip_up_hoodie.jpg"));
        productList.add(new Product("Casio Classic Analog Watch", 49.99, "https://example.com/casio_watch.jpg"));

        // Initialize the adapter and set it to the RecyclerView
        featuredProductsAdapter = new FeaturedProductsAdapter(productList);
        featuredProductsRecyclerView.setAdapter(featuredProductsAdapter);




        // Set up the button click listener
        viewProductsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click action here (e.g., go to Product List screen)
            }
        });
    }
}