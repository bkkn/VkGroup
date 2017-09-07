package com.bkkn.me.vkgroup.common.utils;

import com.bkkn.me.vkgroup.model.Owner;
import com.bkkn.me.vkgroup.model.WallItem;
import com.bkkn.me.vkgroup.rest.model.response.ItemWithSendersResponse;

import java.util.List;

/**
 * Created by Sergey on 05.09.2017.
 */

public class VkListHelper {
    public static List<WallItem> getWallList(ItemWithSendersResponse<WallItem> response) {
        List<WallItem> wallItems = response.items;

        for (WallItem wallItem : wallItems) {
            Owner sender = response.getSender(wallItem.getFromId());
            wallItem.setSenderName(sender.getFullName());
            wallItem.setSenderPhoto(sender.getPhoto());

            wallItem.setAttachmentsString(Utils.convertAttachmentsToFontIcons(wallItem.getAttachments()));

            if (wallItem.haveSharedRepost()) {
                Owner repostSender = response.getSender(wallItem.getSharedRepost().getFromId());
                wallItem.getSharedRepost().setSenderName(repostSender.getFullName());
                wallItem.getSharedRepost().setSenderPhoto(repostSender.getPhoto());

                wallItem.getSharedRepost().setAttachmentsString(Utils.convertAttachmentsToFontIcons(
                        wallItem.getSharedRepost().getAttachments()
                ));
            }
        }
        return wallItems;
    }
}