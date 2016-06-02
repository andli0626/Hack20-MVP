
package com.manning.androidhacks.hack020.presenter.model.impl;

import com.manning.androidhacks.hack020.presenter.model.IConnectionStatus;

// 网络状态
public class ConnectionStatus implements IConnectionStatus {

	@Override
	public boolean isOnline() {
		// TODO: Here we should place the code to check the connectivity.
		return true;
	}

}
