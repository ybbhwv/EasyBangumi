package com.heyanle.lib_anim.old

import com.heyanle.bangumi_source_api.api.ISourceParser
import com.heyanle.bangumi_source_api.api.ParserLoader
import com.heyanle.lib_anim.old.agefans.AgefansParser
import com.heyanle.lib_anim.old.bimibimi.BimibimiParser
import com.heyanle.lib_anim.old.cycdm.CycdmParser
import com.heyanle.lib_anim.old.cycplus.CycplusParser
import com.heyanle.lib_anim.old.omofun.OmofunParser
import com.heyanle.lib_anim.old.yhdm.YhdmParser
import com.heyanle.lib_anim.old.yhdmp.YhdmpParser

/**
 * Created by HeYanLe on 2023/2/1 15:55.
 * https://github.com/heyanLE
 */


object InnerLoader : ParserLoader {

    override fun load(): List<ISourceParser> {
        return listOf(
            OmofunParser(),     // Omofun
            CycplusParser(),    // 次元城+
            CycdmParser(),      // 次元城
            YhdmParser(),       // 樱花动漫
            YhdmpParser(),      // 樱花动漫 P
            BimibimiParser(),   // Bimibimi
            AgefansParser(),    // Age
        )
    }
}