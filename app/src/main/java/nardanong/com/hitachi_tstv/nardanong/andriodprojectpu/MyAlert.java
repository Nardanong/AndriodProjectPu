package nardanong.com.hitachi_tstv.nardanong.andriodprojectpu;

import android.content.Context;
import android.support.v7.app.AlertDialog;

public class MyAlert {

    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }

    public  void normalDialog(String titleString,String messageString) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);


    }

}//Main Class
