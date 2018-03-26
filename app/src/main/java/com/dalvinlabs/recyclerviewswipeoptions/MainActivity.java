package com.dalvinlabs.recyclerviewswipeoptions;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.dalvinlabs.recyclerviewswipeoptions.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    Adapter adapter = new Adapter(Product.getProducts());
    Adapter.SwipeHandler swipeHandler = new Adapter.SwipeHandler(adapter);
    ItemTouchHelper itemTouchHelper = new ItemTouchHelper(swipeHandler);
    adapter.setSwipeHandler(swipeHandler);
    binding.recyclerView.setAdapter(adapter);
    itemTouchHelper.attachToRecyclerView(binding.recyclerView);
  }
}
