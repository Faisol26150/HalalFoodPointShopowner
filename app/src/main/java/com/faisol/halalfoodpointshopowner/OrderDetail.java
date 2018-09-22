package com.faisol.halalfoodpointshopowner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.faisol.halalfoodpointshopowner.Common.Common;
import com.faisol.halalfoodpointshopowner.ViewHolder.OrderDetailAdapter;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class OrderDetail extends AppCompatActivity {

    TextView order_id,order_phone,order_address,order_total,order_comment;
    String order_id_value="";
    RecyclerView lstFoods;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // add this code
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Mitr.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
        setContentView(R.layout.activity_order_detail);

        order_id = (TextView)findViewById(R.id.order_id);
        order_phone = (TextView)findViewById(R.id.order_phone);
        order_address = (TextView)findViewById(R.id.order_address);
        order_total = (TextView)findViewById(R.id.order_total);
        order_comment = (TextView)findViewById(R.id.order_comment);

        lstFoods = (RecyclerView)findViewById(R.id.lstFoods);
        lstFoods.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        lstFoods.setLayoutManager(layoutManager);

        if (getIntent()!= null)
            order_id_value = getIntent().getStringExtra("OrderId");

        //set value
        order_id.setText(order_id_value);
        order_phone.setText(Common.currenRequest.getPhone());
        order_total.setText(Common.currenRequest.getTotal());
        order_address.setText(Common.currenRequest.getAddress());
        order_comment.setText(Common.currenRequest.getComment());

        OrderDetailAdapter adapter = new OrderDetailAdapter(Common.currenRequest.getFoods());
        adapter.notifyDataSetChanged();
        lstFoods.setAdapter(adapter);


    }
}
