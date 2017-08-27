package tw.brad.app.helloworld.myfragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F1Fragment extends Fragment {
    public F1Fragment(){
        Log.i("brad", "F1Fragment()");
    }
    public static F1Fragment newInstance() {
        F1Fragment f1Fragment = new F1Fragment();
        return f1Fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("brad", "F1Fragment:onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("brad", "F1Fragment:onCreateView()");
        return inflater.inflate(R.layout.fragment_f1, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("brad", "F1Fragment:onAttach()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("brad", "F1Fragment:onDetach()");
    }
}
