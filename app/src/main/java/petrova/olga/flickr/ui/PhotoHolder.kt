package petrova.olga.flickr.ui

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import petrova.olga.flickr.databinding.ListItemGalleryBinding

class PhotoHolder(
    binding: ListItemGalleryBinding,
    itemImageView: ImageView
) : RecyclerView.ViewHolder(binding.root) {
    val bind: (Drawable) -> Unit = itemImageView::setImageDrawable
}