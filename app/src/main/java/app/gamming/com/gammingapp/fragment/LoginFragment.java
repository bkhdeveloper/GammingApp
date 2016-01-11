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
import app.gamming.com.gammingapp.common.Utils;
import app.gamming.com.gammingapp.model.User;
import app.gamming.com.gammingapp.thread.ListGamesAsync;

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

        ((MainActivity)getActivity()).getSupportActionBar().setTitle(R.string.title_login);
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

        //TODO Juste for testing
        mEdLogin.setText("android.test@xyrality.com");
        mEdPassword.setText("password");

        Button btnLogin= (Button) v.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //((MainActivity)getActivity()).setFragment(GameWorldsFragment.newInstance());

                new ListGamesAsync(getActivity(),buildUserModel()).execute();
            }
        });
    }

    private User buildUserModel(){

        User user=new User();
        user.setLogin(mEdLogin.getText().toString());
        user.setPassword(mEdPassword.getText().toString());
        user.setDeviceId(Utils.getDeviceId(getActivity()));
        user.setDeviceType(Utils.getDeviceType());

        return user;
    }
}
