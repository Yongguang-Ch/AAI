package asiacom_americas.com.aai.ui.approvals;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ApprovalsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ApprovalsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}