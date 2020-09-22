package asiacom_americas.com.aai.ui.workspace;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkspaceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WorkspaceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}