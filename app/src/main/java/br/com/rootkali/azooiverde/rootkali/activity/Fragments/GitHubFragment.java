package br.com.rootkali.azooiverde.rootkali.activity.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.rootkali.azooiverde.rootkali.R;

/**
 * Created by azooiverde on 21/08/17.
 */

public class GitHubFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.github_layout, null);
    }

}
