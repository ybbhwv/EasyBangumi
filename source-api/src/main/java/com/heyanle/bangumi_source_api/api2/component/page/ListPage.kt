package com.heyanle.bangumi_source_api.api2.component.page

import com.heyanle.bangumi_source_api.api2.Source
import com.heyanle.bangumi_source_api.api2.component.Component
import com.heyanle.bangumi_source_api.api2.component.ComponentBuilderScope
import com.heyanle.bangumi_source_api.api2.component.search.SearchComponent
import com.heyanle.bangumi_source_api.api2.entity.CartoonCover

/**
 * Created by HeYanLe on 2023/2/20 16:03.
 * https://github.com/heyanLE
 */
class ListPage(
    override val label: String,
    override val source: Source,
    override val newScreen: Boolean = false,
    val firstKey: ()->Int,
    val getCartoons: suspend  (pageKey: Int) -> Source.SourceResult<Pair<Int?, List<CartoonCover>>>
): CartoonPage

class ListPagesBuilderScope(
    val source: Source,
){
    val components: ArrayList<ListPage> = arrayListOf()
}

fun ComponentBuilderScope.listPage(
    label: String,
    newScreen: Boolean = false,
    firstKey: Int,
    firstKeyFactory: () -> Int = {firstKey},
    getCartoons: suspend (
        pageKey: Int
    ) -> Source.SourceResult<Pair<Int?, List<CartoonCover>>>
){
    this.components.add(ListPage(label, source, newScreen, firstKeyFactory, getCartoons))
}

fun ListPagesBuilderScope.listPage(
    label: String,
    newScreen: Boolean = false,
    firstKey: Int,
    firstKeyFactory: () -> Int = {firstKey},
    getCartoons: suspend (
        pageKey: Int
    ) -> Source.SourceResult<Pair<Int?, List<CartoonCover>>>
){
    this.components.add(ListPage(label, source, newScreen, firstKeyFactory, getCartoons))
}




