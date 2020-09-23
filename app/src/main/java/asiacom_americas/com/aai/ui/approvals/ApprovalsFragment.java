package asiacom_americas.com.aai.ui.approvals;

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
import asiacom_americas.com.aai.ui.approvals.ApprovalsViewModel;

public class ApprovalsFragment extends Fragment {

    private ApprovalsViewModel approvalsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        approvalsViewModel =
                ViewModelProviders.of(this).get(ApprovalsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_approvals, container, false);
        final TextView textView = root.findViewById(R.id.text_approvals);
        approvalsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}