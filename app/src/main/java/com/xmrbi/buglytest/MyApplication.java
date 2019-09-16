package com.xmrbi.buglytest;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by wzn on 2019/9/12.
 */
public class MyApplication extends TinkerApplication {
    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.xmrbi.buglytest.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }

}
