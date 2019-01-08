package e.wolfsoft1.uiuxlabecommerce_jp_shop6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop6.adapter.ColorAdapter;
import e.wolfsoft1.uiuxlabecommerce_jp_shop6.adapter.SizeAdapter;
import e.wolfsoft1.uiuxlabecommerce_jp_shop6.model.Color_Model;
import e.wolfsoft1.uiuxlabecommerce_jp_shop6.model.Size_Model;

public class Shop_6 extends AppCompatActivity {

    RecyclerView recyclerview_color, size_recyclerview;

    private Integer color[] = {R.drawable.ic_color1, R.drawable.ic_color2, R.drawable.ic_color3, R.drawable.ic_color4, R.drawable.ic_color5, R.drawable.ic_color6, R.drawable.ic_color7};
    private String size[] = {"XL", "S", "XS", "XL", "XX", "L"};

    ArrayList<Color_Model> color_modelArrayList;
    ArrayList<Size_Model> size_modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_6);

        recyclerview_color = findViewById(R.id.recyclerview_color);
        size_recyclerview = findViewById(R.id.size_recyclerview);

        color_modelArrayList = new ArrayList<>();
        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < color.length; i++) {
            Color_Model color_model = new Color_Model(color[i]);
            color_modelArrayList.add(color_model);
        }

        for (int i = 0; i < size.length; i++) {
            Size_Model size_model = new Size_Model(size[i]);
            size_modelArrayList.add(size_model);
        }

        recyclerview_color.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter adapter = new ColorAdapter(this, color_modelArrayList);
        recyclerview_color.setAdapter(adapter);

        size_recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter sizeAdapter = new SizeAdapter(this, size_modelArrayList);
        size_recyclerview.setAdapter(sizeAdapter);
    }
}
