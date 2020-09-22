package asiacom_americas.com.aai.ui.workspace;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import asiacom_americas.com.aai.R;
import asiacom_americas.com.aai.ui.workspace.WorkspaceFragment;

public class WorkspaceFragment extends Fragment {

    private WorkspaceViewModel workspaceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        workspaceViewModel =
                ViewModelProviders.of(this).get(WorkspaceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_workspace, container, false);
        final TextView textView = root.findViewById(R.id.text_workspace);
        workspaceViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}