package cc.itbox.babysay.activities;

import org.holoeverywhere.app.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cc.itbox.babysay.R;

/**
 * 基类Activity
 * 
 * @author malinkang 2014-2-22 下午3:54:20
 * 
 */

public class BaseActivity extends Activity {

	protected ActionBar mActionBar;
	protected FragmentManager mSupportFragmentManager;
	protected FragmentTransaction mFragmentTransaction;

	@SuppressLint("CommitTransaction")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mActionBar = getSupportActionBar();
		mActionBar.setBackgroundDrawable(getResources().getDrawable(
				R.drawable.ab_solid_custom_pink_inverse_holo));
		mSupportFragmentManager = getSupportFragmentManager();
		mFragmentTransaction = mSupportFragmentManager.beginTransaction();
	}
	
}
