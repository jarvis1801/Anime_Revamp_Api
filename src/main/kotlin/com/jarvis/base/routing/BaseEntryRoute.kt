package com.jarvis.base.routing

import com.jarvis.base.model.BaseObject

abstract class BaseEntryRoute<B: BaseObject> : BaseRoute() {

    fun getEntryById() {

    }

    fun getEntryListByIdList() {

    }

    fun getEntryList() {

    }

    fun getEntryByStatement(): B? {
        return getEntryListByStatement().firstOrNull()
    }

    fun getEntryListByStatement(): List<B> {

    }
}