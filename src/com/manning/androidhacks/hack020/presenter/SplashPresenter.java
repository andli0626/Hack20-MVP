package com.manning.androidhacks.hack020.presenter;

import com.manning.androidhacks.hack020.presenter.model.IConnectionStatus;
import com.manning.androidhacks.hack020.presenter.model.impl.ConnectionStatus;
import com.manning.androidhacks.hack020.view.ISplashView;

// 主导器
public class SplashPresenter {

	private IConnectionStatus mConnectionStatus;
	private ISplashView 	  mView;

	public SplashPresenter() {
		this(new ConnectionStatus());
	}

	public SplashPresenter(IConnectionStatus connectionStatus) {
		mConnectionStatus = connectionStatus;
	}

	public void setView(ISplashView view) {
		this.mView = view;
	}

	protected ISplashView getView() {
		return mView;
	}

	// 完成加载
	public void didFinishLoading() {
		ISplashView view = getView();
		// 有网络
		if (mConnectionStatus.isOnline()) {
			view.moveToMainView();
		} 
		// 无网络
		else {
			view.hideProgress();
			view.showNoInetErrorMsg();
		}
	}
}
