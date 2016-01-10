package app.gamming.com.gammingapp.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import app.gamming.com.gammingapp.MainActivity;
import app.gamming.com.gammingapp.R;

/**
 * Created by hamdi on 1/10/2016.
 */
public class LoginFragment extends Fragment{

    public static LoginFragment newInstance(){
        return new LoginFragment();
    }

    private EditText mEdLogin;
    private EditText mEdPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.login_fragment,container,false);
        initViews(v);

        return v;
    }

    private void initViews(View v) {

        mEdLogin= (EditText) v.findViewById(R.id.username);
        mEdPassword= (EditText) v.findViewById(R.id.password);

        Button btnLogin= (Button) v.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((MainActivity)getActivity()).setFragment(GameWorldsFragment.newInstance());
            }
        });
    }
}
