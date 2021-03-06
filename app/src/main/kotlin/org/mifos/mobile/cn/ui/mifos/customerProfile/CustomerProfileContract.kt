package org.mifos.mobile.cn.ui.mifos.customerProfile

import org.mifos.mobile.cn.ui.base.MvpView

interface CustomerProfileContract {

    interface View: MvpView{
        fun checkCameraPermission();

        fun requestPermission();

        fun  loadCustomerPortrait();
    }
}