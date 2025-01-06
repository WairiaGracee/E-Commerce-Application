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
        productList.add(new Product("Basic White T-Shirt", 15.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfNfZZEGBjBZGE8U4p4l5ihBgJr0i2IowPMQ&s"));
        productList.add(new Product("Slim Fit Denim Jeans", 39.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5_quQCboPa2y-PMIA6j4M66ZbzggjOj-3Aw&s"));

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
