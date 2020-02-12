package com.netease.nim.uikit.common;

import com.netease.nimlib.sdk.msg.model.RecentContact;

import java.util.Collection;

public class CommonUtil {

    // 置顶功能可直接使用，也可作为思路，供开发者充分利用RecentContact的tag字段
    public static final long RECENT_TAG_STICKY = 0x0000000000000001; // 联系人置顶tag

    public static void addTag(RecentContact recent, long tag) {
        tag = recent.getTag() | tag;
        recent.setTag(tag);
    }

    public static void removeTag(RecentContact recent, long tag) {
        tag = recent.getTag() & ~tag;
        recent.setTag(tag);
    }

    public static boolean isTagSet(RecentContact recent, long tag) {
        return (recent.getTag() & tag) == tag;
    }

    public static void addStickyTag(RecentContact recent) {
        addTag(recent, RECENT_TAG_STICKY);
    }

    public static void removeStickTag(RecentContact recent) {
        removeTag(recent, RECENT_TAG_STICKY);
    }

    public static boolean isStickyTagSet(RecentContact recent) {
        return isTagSet(recent, RECENT_TAG_STICKY);
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
