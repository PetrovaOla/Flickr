package petrova.olga.flickr.ui

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhotoHolder(itemTextView: TextView):RecyclerView.ViewHolder(itemTextView) {
    val bind:(CharSequence) -> Unit = itemTextView::setText
}