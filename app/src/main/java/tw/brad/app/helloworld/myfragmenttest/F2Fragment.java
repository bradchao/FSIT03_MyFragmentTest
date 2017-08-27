package tw.brad.app.helloworld.myfragmenttest;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F2Fragment extends Fragment {
    private View view;
    private TextView f2mesg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("brad", "F2:onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("brad", "F2:onCreateView()");
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_f2, container, false);
            f2mesg = (TextView) view.findViewById(R.id.f2mesg);
        }
        return view;
    }

    public TextView getF2mesg(){
        return f2mesg;
    }

}
