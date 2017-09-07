package com.bkkn.me.vkgroup.model;

import com.vk.sdk.api.model.Identifiable;

/**
 * Created by Sergey on 05.09.2017.
 */

public interface Owner extends Identifiable{

    String getFullName();
    String getPhoto();
}