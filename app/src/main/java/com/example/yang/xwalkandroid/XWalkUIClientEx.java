package com.example.yang.xwalkandroid;

/**
 * Created by yang on 16/6/23.
 */
import android.webkit.ValueCallback;

import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;


public class XWalkUIClientEx extends XWalkUIClient {

    public XWalkUIClientEx(XWalkView view) {
        super(view);
    }

    @Override
    public void openFileChooser(XWalkView view, final ValueCallback uploadFile, String acceptType, String capture) {
        uploadFile.onReceiveValue(null);
    }
}