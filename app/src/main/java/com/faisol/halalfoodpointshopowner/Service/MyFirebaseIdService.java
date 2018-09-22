package com.faisol.halalfoodpointshopowner.Service;

import com.faisol.halalfoodpointshopowner.Common.Common;
import com.faisol.halalfoodpointshopowner.Model.Token;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Abu Rubban on 22-Sep-18.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
                updateToServer(refreshedToken);
    }

    private void updateToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Token data = new Token(refreshedToken,true); // false because this token send from Clien
        tokens.child(Common.currentUser.getPhone()).setValue(data);
    }

}
