package com.faisol.halalfoodpointshopowner.Common;

import com.faisol.halalfoodpointshopowner.Model.Request;
import com.faisol.halalfoodpointshopowner.Model.User;
import com.faisol.halalfoodpointshopowner.Remote.APIService;
import com.faisol.halalfoodpointshopowner.Remote.FCMRetrofitClient;
import com.faisol.halalfoodpointshopowner.Remote.RetrofitClient;

public class Common {
    public static User currentUser;
    public static Request currenRequest;

    public static final String UPDATE = "อัพเดท";
    public static final String DELETE = "ลบ";

    public static final int PICK_IMAGE_REQUEST = 71;

    private static final String fcmUrl = "https://fcm.googleapis.com/";

    public static APIService getFCMClient(){
        return FCMRetrofitClient.getClient(fcmUrl).create(APIService.class);
    }

    public  static String convertCodeToStatus(String code)
    {
        if(code.equals("0"))
            return "รอการอัพเดทสถานะ";
        else if(code.equals("1"))
            return "รับออเดอร์";
        else if (code.equals("2"))
            return "อยู่ระหว่างการส่ง";
        else
            return "จ่ายเงินเรียบร้อย";
    }
}
