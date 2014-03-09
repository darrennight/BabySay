package cc.itbox.babysay.fragments;

import org.holoeverywhere.app.Activity;
import org.holoeverywhere.app.TabSwipeFragment;

import android.os.Bundle;
import cc.itbox.babysay.R;

public class RegisterOrLoginFragment extends TabSwipeFragment {

	private Activity mActivity;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mActivity = (Activity) getActivity();

	}

	@Override
	public void onHandleTabs() {
		addTab(R.string.login, LoginFragment.class, null);
		addTab(R.string.register, RegisterFragment.class, null);

	}

}
