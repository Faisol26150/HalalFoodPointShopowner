package com.faisol.halalfoodpointshopowner.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.faisol.halalfoodpointshopowner.Interface.ItemClickListener;
import com.faisol.halalfoodpointshopowner.R;

/**
 * Created by Abu Rubban on 03-Sep-18.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder{
    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress;


    public Button btnEdit,btnRemove,btnDetail,btnColor,btnNext;

    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderAddress = (TextView) itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView) itemView.findViewById(R.id.order_id);
        txtOrderPhone = (TextView) itemView.findViewById(R.id.order_phone);
        txtOrderStatus = (TextView) itemView.findViewById(R.id.order_status);

        btnEdit = (Button) itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button) itemView.findViewById(R.id.btnRemove);
        btnDetail = (Button) itemView.findViewById(R.id.btnDetail);


        btnColor = (Button) itemView.findViewById(R.id.btnColor1);

    }

}
