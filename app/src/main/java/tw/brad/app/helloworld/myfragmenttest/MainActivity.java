package tw.brad.app.helloworld.myfragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private F1Fragment f1;
    private F2Fragment f2;
    private FragmentManager fmgr;
    private FragmentTransaction tran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = F1Fragment.newInstance();
        f2 = new F2Fragment();

        fmgr = getFragmentManager();
        tran = fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();


    }
}
