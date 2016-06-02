package com.manning.androidhacks.hack020.view;

public interface ISplashView {
	// 显示进度
	void showProgress();
	// 隐藏进度
	void hideProgress();
	// 显示错误
	void showNoInetErrorMsg();
	// 跳转到下一个View
	void moveToMainView();
}
