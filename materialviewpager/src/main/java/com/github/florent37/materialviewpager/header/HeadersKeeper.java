package com.github.florent37.materialviewpager.header;

import android.util.Log;

import com.github.florent37.materialviewpager.Utils;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Arthur Korchagin on 14.01.16
 */
public abstract class HeadersKeeper extends Utils {

    protected final LinkedList<HeaderDesign> mHeaders;


    public HeadersKeeper(Collection<HeaderDesign> headerDesigns) {
        mHeaders = new LinkedList<>(headerDesigns);
        Log.d(HeadersKeeper.class.getName(), "-> HeadersKeeper ->");
    }

    public abstract int getColorWithOffset(int position, float offset);

    public HeaderDesign getHeaderDesign(int position) {
        return mHeaders.get(position);
    }


}
