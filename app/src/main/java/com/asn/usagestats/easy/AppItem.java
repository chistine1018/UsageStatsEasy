package com.asn.usagestats.easy;

import android.graphics.drawable.Drawable;

public class AppItem {

    public Drawable appIcon;
    public String appName;
    public int usagePercentage;
    public String usageDuration;

    public AppItem(Drawable appIcon, String appName, int usagePercentage, String usageDuration) {
        this.appIcon = appIcon;
        this.appName = appName;
        this.usagePercentage = usagePercentage;
        this.usageDuration = usageDuration;
    }
}
