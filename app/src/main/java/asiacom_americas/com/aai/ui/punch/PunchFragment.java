package asiacom_americas.com.aai.ui.punch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import asiacom_americas.com.aai.R;
import asiacom_americas.com.aai.ui.punch.PunchViewModel;

public class PunchFragment extends Fragment {

    private PunchViewModel punchViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        punchViewModel =
                ViewModelProviders.of(this).get(PunchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_punch, container, false);
        final TextView textView = root.findViewById(R.id.text_punch);
        punchViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}