package app.gamming.com.gammingapp.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.gamming.com.gammingapp.MainActivity;
import app.gamming.com.gammingapp.R;

/**
 * Created by hamdi on 1/10/2016.
 */
public class GameWorldsFragment extends Fragment {


    public static GameWorldsFragment newInstance(){
        return new GameWorldsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle(R.string.title_list_games);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.game_words_fragment,container,false);
        initViews(v);

        return v;
    }

    private void initViews(View v) {


    }
}
